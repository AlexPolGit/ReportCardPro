package reportcardpro;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
/**
 *The class finds information about the teacher in order to work with the program.
 * @param id
 * <br>
 * @param name
 * <br>
 * @param username
 * <br>
 * @param password
 */
public class Teacher
{    /**
     *Id number of the teacher.
     */
    public UUID id;
    /**
     *The first and last name of the teacher
     */
    public String name;
    /**
     *The username the teacher uses to login into the program.
     */
    public String username;
    /**
     *The password the teacher uses to login into the program.
     */
    public String password;
    /**
     *The list of students that the teacher has in their class or classes.
     */
    public ArrayList<Student> students = new ArrayList<>();
    /**
     *converts numbered values to have additional decimal numbers for more accurate marking.
     */
    public DecimalFormat df = new DecimalFormat("#.##");
     /**
     *size of the class the teacher has.
     */
    public int classSize = students.size();
    /**
     * gives the final value of each param:
     * @param sID
     * <br>
     * @param sName
     * <br>
     * @param sUser
     * <br>
     * @param sPass
     */
    public Teacher(String sID, String sName, String sUser, String sPass)
    {
        this.id = UUID.fromString(sID);
        this.name = sName;
        this.username = sUser;
        this.password = sPass;
    }
     /**
     *
     * @param sID
     * <br>
     * @param sName
     * <br>
     * @param sUser
     * <br>
     * @param sPass
     */
    
    public Teacher(UUID sID, String sName, String sUser, String sPass)
    {
        this.id = sID;
        this.name = sName;
        this.username = sUser;
        this.password = sPass;
    }
     /**
     * @param toName
     */

    public void setName(String toName)
    {
        this.name = toName;
    }
    /**
     * @param toID 
     */
    
    public void setID(UUID toID)
    {
        this.id = toID;
    }
    /**
     * @param toID 
     */
   
    public void setID(String toID)
    {
        this.id = UUID.fromString(toID);
    }
    /**
     * creates a new random ID number for a teacher.
     */
    public void newRandomID()
    {
        this.id = UUID.randomUUID();
    }
     /**
     *collects the students names and sorts them alphabetically by last name.
     */
    public void sortStudents()
    {
        Collections.sort(students, new StudentComparator());
    }
     /**
     *creates a random student given the following params.
     * @param name The first and last name of the student
     * <br>
     * @param gender The gender of the student
     * <br>
     * @param year The year the student was born in.
     * <br>
     * @param month The month the student was born in.
     * <br>
     * @param day The day the student was born in.
     */
    public void createStudent(String name, String gender, int year, int month, int day)
    {
        students.add(new Student(UUID.randomUUID(), name, gender, year, month, day));
        sortStudents();
    }
    /**
     *Allows for the teacher to add a new student to their class
     */
    public void createNullStudent()
    {
        students.add(new Student(UUID.randomUUID(), "", "", 0, 0 ,0));
        sortStudents();
    }
    /**
     *Allows for the teacher to remove a student from their class and the information of that student
     * @param id the id number of the student.
     * <br>
     * @param name the first and last name of the student.
     * <br>
     * @param gender the gender of the student.
     * <br>
     * @param year the year the student was born in.
     * <br>
     * @param month the month the student was born in.
     * <br>
     * @param day the day the student was born in.
     */
    public void removeStudent(String id, String name, String gender, int year, int month, int day)
    {
        Student student = new Student(id, name, gender, year, month, day);
        students.remove(student);
        sortStudents();
    }
    /**
     * The teacher sets username they want to use for the program.
     * @param toUser 
     */
    
    public void setUsername(String toUser)
    {
        this.username = toUser;
    }
    /**
     * The teacher sets the password for the username in order to login to the program.
     * @param toPass 
     */
    
    public void setPassword(String toPass)
    {
        this.password = toPass;
    }
    /**
     * reads the list of students in the teacher's class from a file. (file io)
     */
    public void readStudentList()
    {
        if (new ArrayList<>(Arrays.asList(new File("teachers\\" + id.toString() + "\\students\\").listFiles())).isEmpty())
        {
            System.err.println("Students Folder is Empty.");
        }
        try
        {
            ArrayList<File> list = new ArrayList<>(Arrays.asList(new File("teachers\\" + id.toString() + "\\students\\").listFiles()));
            Properties prop = new Properties();

            for (int i = 0; i < list.size(); i++)
            {
                InputStream toStream = new FileInputStream(list.get(i));
                prop.load(toStream);
                Student tempStu = new Student(UUID.randomUUID(), "", "", 0, 0, 0);
                tempStu.setID(UUID.fromString(prop.getProperty("id")));
                tempStu.setName(prop.getProperty("name"));
                tempStu.setGender(prop.getProperty("gender"));
                tempStu.setBirthday(    Integer.parseInt(prop.getProperty("birthYear")),
                                        Integer.parseInt(prop.getProperty("birthMonth")) - 1,
                                        Integer.parseInt(prop.getProperty("birthDate")));
                String subjectString = prop.getProperty("subjects");
                String[] toParse = subjectString.split("&");
                int n = 0;
                
                while (true)
                {
                    String name = toParse[n].replaceAll("\\(", "").replaceAll("\\)", "").split(",")[0];
                    String desc = toParse[n].replaceAll("\\(", "").replaceAll("\\)", "").split(",")[1];
                    String comm = toParse[n].replaceAll("\\(", "").replaceAll("\\)", "").split(",")[3];
                    String marksList[] = toParse[n].replaceAll("\\(", "").replaceAll("\\)", "").split(",")[2].replaceAll("\\[", "").replaceAll("\\]", "").split("-");

                    Subject tempSub = new Subject(name, desc);
                    
                    tempSub.setComment(comm);
                    
                    for (String m : marksList)
                    {
                        Double value = Double.parseDouble(m.split(":")[0]);
                        Double weight = Double.parseDouble(m.split(":")[1]);
                        String mdesc = m.split(":")[2];
                        tempSub.addMark(new Mark(value, weight, mdesc));
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
     /**
     *Allows the teacher to write the throw a file with their list of students with the information of each student in their class.
     * @param input the input file the teacher has selected.
     * @throws FileNotFoundException
     * <br>
     * @throws IOException
     */
    public void writeStudentList(ArrayList<Student> input) throws FileNotFoundException, IOException
    {
        Properties prop = new Properties();
        
        for (Student s: input)
        {
            File outFile = new File(id.toString() + "\\students\\" + s.id + ".properties");
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
                    subjectsString += mar.mark + ":" + mar.markWeight + ":" + mar.markDescription;
                    if (m != sub.marks.size())
                    {
                        subjectsString += "-";
                    }
                }
                subjectsString += "]" + sub.comment + ")";
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
    /**
     *Finds the mean average for the class the teacher logged in has.
     */
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
    /**
     *finds the median average for the class the teacher logged in has.
     */
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
    /**
     *The list of students in the teacher's class/classes.
     */
    public void listStudents()
    {
        System.out.println("Student List:");
        for (Student s: students)
        {
            System.out.println(" - " + s.name + ", " + s.gender + ", age " + s.getAge());
        }
        System.out.println();
    } 
     /**
     *finds the name of the student by first name.
     * @param name first name of student.
     */
    public Student getStudentByName(String name)
    {
        for (Student s: students)
        {
            if (name.equalsIgnoreCase(s.name))
            {
                return s;
            }
        }
        System.err.println("Student (" + name + ") not found!");
        return null;
    }
    /**
     *finds the id number of a student.
     * @param id id number of a student.
     */
    public Student getStudentByID(String id)
    {
        UUID sID = UUID.fromString(id);
        for (Student s: students)
        {
            if (sID.equals(s.id))
            {
                return s;
            }
        }
        System.err.println("Student (" + id + ") not found!");
        return null;
    }
    /**
     *finds the student by searching using their id number.
     * @param id id number of a student.
     */
    public Student getStudentByID(UUID id)
    {
        for (Student s: students)
        {
            if (id.equals(s.id))
            {
                return s;
            }
        }
        System.err.println("Student (" + id + ") not found!");
        return null;
    }
}