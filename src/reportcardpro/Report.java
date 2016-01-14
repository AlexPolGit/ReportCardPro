package reportcardpro;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
/**
 * The main class for Report Card Pro that organizes the data collected from: Student and Subject class.
 * @see Student 
 * @see Subject
 * @param listStudents(),sortStudents(),createStudent(),createNullStudent(),removeStudent,readStudentList(),writeStudentList
 */

public class Report
{
    public ArrayList<Student> students = new ArrayList<>();
    public DecimalFormat df = new DecimalFormat("#.##");
    public int classSize = students.size();
    
    public void listStudents()
    {
        System.out.println("Student List:");
        for (Student s: students)
        {
            System.out.println(" - " + s.name + ", " + s.gender + ", age " + s.getAge());
        }
    } 
    
    public void sortStudents()
    {
        Collections.sort(students, new StudentComparator());
    }
    
    public void createStudent(String name, String gender, int year, int month, int day)
    {
        students.add(new Student(UUID.randomUUID(), name, gender, year, month, day));
        sortStudents();
    }
    
    public void createNullStudent()
    {
        students.add(new Student(UUID.randomUUID(), "", "", 0, 0 ,0));
        sortStudents();
    }
    
    public void removeStudent(String id, String name, String gender, int year, int month, int day)
    {
        Student student = new Student(id, name, gender, year, month, day);
        students.remove(student);
        sortStudents();
    }

    public void readStudentList()
    {
        if (new ArrayList<>(Arrays.asList(new File("students\\").listFiles())).isEmpty())
        {
            System.err.println("Students Folder is Empty.");
        }
        try
        {
            ArrayList<File> list = new ArrayList<>(Arrays.asList(new File("students\\").listFiles()));
            Properties prop = new Properties();

            for (int i = 0; i < list.size(); i++)
            {
                InputStream toStream = new FileInputStream(list.get(i));
                prop.load(toStream);
                Student tempStu = new Student(UUID.randomUUID().toString(), "", "", 0, 0, 0);
                tempStu.setID(UUID.fromString(prop.getProperty("id")));
                tempStu.setName(prop.getProperty("name"));
                tempStu.setGender(prop.getProperty("gender"));
                tempStu.setBirthday(   Integer.parseInt(prop.getProperty("birthYear")),
                                    Integer.parseInt(prop.getProperty("birthMonth")) - 1,
                                    Integer.parseInt(prop.getProperty("birthDate")));
                String subjectString = prop.getProperty("subjects");
                String[] toParse = subjectString.split("&");
                int n = 0;
                
                while (true)
                {
                    String name = toParse[n].replaceAll("\\(", "").replaceAll("\\)", "").split(",")[0];
                    String desc = toParse[n].replaceAll("\\(", "").replaceAll("\\)", "").split(",")[1];
                    String marksList[] = toParse[n].replaceAll("\\(", "").replaceAll("\\)", "").split(",")[2].replaceAll("\\[", "").replaceAll("\\]", "").split("-");

                    Subject tempSub = new Subject(name, desc);
                    
                    for (String m : marksList)
                    {
                        Double value = Double.parseDouble(m.split(":")[0]);
                        Double weight = Double.parseDouble(m.split(":")[1]);
                        tempSub.addMark(new Mark(value, weight));
                    }
                    
                    tempStu.addSubject(tempSub);
                    if (n == toParse.length - 1)
                    {
                        break;
                    }
                    else
                    {
                        n++;
                    }
                }
                
                students.add(tempStu);
            }
        }
        catch (IOException ex)
        {
            System.err.println(ex.toString());
        }
        sortStudents();
    }

    public void writeStudentList(ArrayList<Student> input) throws FileNotFoundException, IOException
    {
        Properties prop = new Properties();
        
        for (Student s: input)
        {
            File outFile = new File("students\\" + s.id + ".properties");
            FileOutputStream fileOS = new FileOutputStream(outFile);
            prop.setProperty("id", s.id.toString());
            prop.setProperty("name", s.name);
            prop.setProperty("gender", s.gender);
            prop.setProperty("birthYear", Integer.toString(s.birthDate.getTime().getYear() + 1900));
            prop.setProperty("birthMonth", Integer.toString(s.birthDate.getTime().getMonth() + 1));
            prop.setProperty("birthDate", Integer.toString(s.birthDate.getTime().getDate()));
            
            String subjectsString = "";
            int n = 0;
            
            for (Subject sub: s.subjects)
            {
                n++;
                subjectsString += ("(" + sub.subjectName + "," + sub.subjectDescription + ",[");
                
                int m = 0;
                
                for (Mark mar : sub.marks)
                {
                    m++;
                    subjectsString += mar.mark + ":" + mar.markWeight;
                    if (m != sub.marks.size())
                    {
                        subjectsString += "-";
                    }
                }
                subjectsString += "])";
                if (n != s.subjects.size())
                {
                    subjectsString += "&";
                }
            }
            
            prop.setProperty("subjects", subjectsString);

            prop.store(fileOS, s.name + "'s Saved Properties File");
            fileOS.close();
        }
    }
    
    public Double getClassMeanAverage()
    {
        int numOfStudents = 0;
        Double sum = 0.0;
        for (Student s: students)
        {
            sum += s.getOverallMeanAverage();
            numOfStudents++;
        }
        return (sum / numOfStudents);
    }
    
    public Double getClassMedianAverage()
    {
        int numOfStudents = students.size();
        Double median = 0.0;
        if (numOfStudents%2 == 1)
        {
            median = students.get((int)Math.floor(numOfStudents / 2)).getOverallMeanAverage();
        }
        else
        {
            median = (Math.ceil(students.get(numOfStudents / 2).getOverallMeanAverage()) + Math.floor(students.get(numOfStudents / 2).getOverallMeanAverage())) / 2;
        }
        return median;
    }

    public static void main(String[] args) throws IOException
    {
        Report r = new Report();
        
        r.readStudentList(); //get a saved student list

        for (Student s : r.students)
        {
            ArrayList<Subject> sub = s.subjects;

            System.out.println(s.name + "'s Age: " + s.getAge());
            System.out.println(s.name + "'s Unique ID: " + s.id);
            s.listSubjects();

            System.out.println();
        }
        r.listStudents();
        r.writeStudentList(r.students); //propgram finished, write saved student list
        
        System.out.println("Class median: " + r.df.format(r.getClassMedianAverage()));
    }
}