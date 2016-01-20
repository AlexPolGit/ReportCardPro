package reportcardpro;

import java.io.*;
import java.util.*;

/**
 * The main class for Report Card Pro that organizes the data collected from: Student and Subject class.
 * @see Student 
 * @see Subject
 * @param listStudents(),sortStudents(),createStudent(),createNullStudent(),removeStudent,readStudentList(),writeStudentList
 */

public class Report
{
    public ArrayList<Teacher> teachers = new ArrayList<>();
    
    public void createTeacher(String name, String user, String pass) throws IOException
    {
        Teacher temp = new Teacher(UUID.randomUUID(), name, user, pass);
        teachers.add(temp);
        sortTeachers();
        writeTeachersList();
    }
    
    public void addTeacher(Teacher toTeach) throws IOException
    {
        teachers.add(toTeach);
        sortTeachers();
        writeTeachersList();
    }
    
    public void removeTeacher(String id, String name, String user, String pass) throws IOException
    {
        Teacher temp = new Teacher(UUID.fromString(id), name, user, pass);
        teachers.remove(temp);
        sortTeachers();
        writeTeachersList();
    }
    
    public void sortTeachers()
    {
        Collections.sort(teachers, new TeacherComparator());
    }
    
    public void listTeachers()
    {
        System.out.println("Teachers List:");
        for (Teacher t: teachers)
        {
            System.out.println(" - " + t.name + ", " + t.username);
        }
        System.out.println();
    }
    
    public void readTeacherList()
    {
        if (new ArrayList<>(Arrays.asList(new File("teachers\\").listFiles())).isEmpty())
        {
            System.err.println("Teachers Folder is Empty.");
        }
        try
        {
            ArrayList<File> list = new ArrayList<>(Arrays.asList(new File("teachers\\").listFiles()));
            Properties prop = new Properties();

            for (int i = 0; i < list.size(); i++)
            {
                list.get(i).mkdir();
                InputStream toStream = new FileInputStream(list.get(i) + "\\credentials.properties");
                prop.load(toStream);
                Teacher tempTeach = new Teacher(UUID.randomUUID(), "", "", "");
                tempTeach.setID(UUID.fromString(prop.getProperty("id")));
                tempTeach.setName(prop.getProperty("name"));
                tempTeach.setUsername(prop.getProperty("user"));
                tempTeach.setPassword(prop.getProperty("pass"));
                
                tempTeach.readStudentList();
                
                teachers.add(tempTeach);
            }
        }
        catch (IOException ex)
        {
            System.err.println(ex.toString());
        }
        sortTeachers();
    }
    
    public void writeTeachersList() throws FileNotFoundException, IOException
    {
        Properties prop = new Properties();
        
        for (Teacher t: teachers)
        {
            File tFolder = new File("teachers\\" + t.id);
            tFolder.mkdirs();
            
            File sFolder = new File("teachers\\" + t.id + "\\students");
            sFolder.mkdirs();
            
            File propFile = new File("teachers\\" + t.id + "\\credentials.properties");
            FileOutputStream fileOS = new FileOutputStream(propFile);

            prop.setProperty("name", t.name);
            prop.setProperty("id", t.id.toString());
            prop.setProperty("user", t.username);
            prop.setProperty("pass", t.password);
            
            prop.store(fileOS, t.name + "'s (Teacher) Saved Properties File");
            fileOS.close();
        }
    }
    
    public Teacher getTeacherByID(UUID id)
    {
        for (Teacher t: teachers)
        {
            if (t.id.equals(id))
            {
                return t;
            }
        }
        System.err.println("Teacher (" + id + ") not found!");
        return null;
    }
    
    public static void main(String[] args)
    {
        Report r = new Report();
        r.readTeacherList();
        
        for (Teacher t: r.teachers)
        {
            System.out.println("Teacher: " + t.name + " (" + t.username + ")");
            t.listStudents();
            
            for (Student s: t.students)
            {
                s.listSubjects();
                System.out.println();
            }
            
            System.out.println("\n\n\n");
        }
    }
}