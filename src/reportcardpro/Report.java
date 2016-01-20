package reportcardpro;

import java.io.*;
import java.util.*;

/**
 * The main class for Report Card Pro that organizes the data collected from: Student and Subject class.
 */

public class Report
{
    /**
     *The list of teachers and the classes they currently have.
     */
    public ArrayList<Teacher> teachers = new ArrayList<>();
    /**
     *Creates a new teacher with the following information:
     * @param name The first name of the teacher (can also add last name, but not required) 
     * <br>
     * @param user The user name of the teacher.
     * <br>
     * @param pass The password of the user name.
     */
    public void createTeacher(String name, String user, String pass)
    {
        Teacher temp = new Teacher(UUID.randomUUID(), name, user, pass);
        teachers.add(temp);
        sortTeachers();
    }
    /**
     *Adds a teacher to a list where they will be sorted by subject they teach and then their name in that subject is sorted by last name alphabetically.
     * @param toTeach
     */
    public void addTeacher(Teacher toTeach)
    {
        teachers.add(toTeach);
        sortTeachers();
    }
    /**
     *Removes a teacher from the list of teachers and the list from the subject list they were in.
     * @param id the id number of the teacher.
     * <br>
     * @param name the name of the teacher.
     * <br>
     * @param user the user name of the teacher.
     * <br>
     * @param pass the password of the user name.
     */
    public void removeTeacher(String id, String name, String user, String pass)
    {
        Teacher temp = new Teacher(UUID.fromString(id), name, user, pass);
        teachers.remove(temp);
        sortTeachers();
    }
    /**
     *Sorts the teacher list by last name alphabetically.
     */
    public void sortTeachers()
    {
        Collections.sort(teachers, new TeacherComparator());
    }
    /**
     *reads the list of teachers on the screen from a file on your computer.
     */
    public void listTeachers()
    {
        System.out.println("Teachers List:");
        for (Teacher t: teachers)
        {
            System.out.println(" - " + t.name + ", " + t.username);
        }
        System.out.println();
    }
    /**
     *reads the list of teachers on the screen from a file on your computer.
     */
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
    /**
     *writes the list of teacher names from a file on your computer.
     * @param input
     * <br>
     * @throws FileNotFoundException
     * <br>
     * @throws IOException
     */
    public void writeTeachersList(ArrayList<Teacher> input) throws FileNotFoundException, IOException
    {
        Properties prop = new Properties();
        
        for (Teacher t: input)
        {
            File sFolder = new File("teachers\\" + t.id + "\\students");
            sFolder.mkdir();
            
            File outFile = new File("teachers\\" + t.id + "\\credentials.properties");
            FileOutputStream fileOS = new FileOutputStream(outFile);

            prop.setProperty("name", t.name);
            prop.setProperty("id", t.id.toString());
            prop.setProperty("user", t.username);
            prop.setProperty("pass", t.password);
            
            prop.store(fileOS, t.name + "'s (Teacher) Saved Properties File");
            fileOS.close();
        }
    }
    /**
     * Finds the teacher by id number.
     * @param id the id number of the teacher.
     * @return 
     */
   
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