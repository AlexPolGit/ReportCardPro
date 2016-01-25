package reportcardpro;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * The main class of report card pro.
 */
public class ReportCardPro//subjects=(ABC,abc,[],nice)&(DEF,def,[],nice)&(GHI,ghi,[],nice)
{
    /**
     * Creates a blank canvas for the teacher to add in the information they need to create a report card.
     */
    public Report rep = new Report();
    /**
     * Picks a default list of students from a file.
     */
    public DefaultListModel dmTempStudentsList = new DefaultListModel();
    /**
     * Picks a default list of subjects 
     */
    public DefaultListModel dmTempSubjectList = new DefaultListModel();
    /**
     * Picks a default list of marks.
     */
    public DefaultListModel dmTempMarksList = new DefaultListModel();
    /**
     * The teacher selected for a class and the subject.
     */
    public Teacher selectedTeacher;
    /**
     * The student selected for report.
     */
    public Student selectedStudent;
    /**
     * The student selected subject.
     */
    public Subject selectedSubject;
    /**
     * The student's selected mark for
     * <br>
     * @param selectedSubject The student selected subject.
     */
    public Mark selectedMark;
    public ReportCardPro()
    {}
    /**
     * Starts the program once the teacher has wrote the correct credentials to login.
     * <br>
     * @throws IOException 
     */
    public void startProgram() throws IOException
    {
        tryLogin();
    }
    /**
     * Sets up the login screen for the teacher to either create an account or login into the program.
     * <br>
     * @throws IOException 
     */
    public void tryLogin() throws IOException
    {
        
    public void startProgram() throws IOException
    {
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    }
    /**
     * At the login screen it allows for the teacher to create a new account for the program.
     * <br>
     * @param t The teacher's credentials.
     * <br>
     * @throws IOException 
     */
    public void newTeacher(Teacher t) throws IOException
    {
        Report r = new Report();
        r.addTeacher(t);
        r.writeTeachersList();
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    
        try
        {
            loginScreen.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
    }
    /**
     * Makes a default list of students based on name, gender and age.
     */
    public void makeDefListOfStudents()
    {
        dmTempStudentsList.clear();
        System.out.println(selectedTeacher.username);
        for (Student s: selectedTeacher.students)
        {
            dmTempStudentsList.addElement(" • " + s.name + " (" + s.gender + "), Age " + s.getAge());
        }
    }
    /**
     * Makes a default list of subjects with their descriptions for each student.
     * <br>
     * @param student 
     */
    public void makeDefListOfSubjects(Student student)
    {
        dmTempSubjectList.clear();
        for (Subject s: student.subjects)
        {
            dmTempSubjectList.addElement(" • " + s.subjectName + ": " + s.subjectDescription);
        }
    }
    /**
     * Makes a default list of marks with a final mark and a description of each evaluation.
     * <br>
     * @param subject 
     */
    public void makeDefListOfMarks(Subject subject)
    {
        dmTempMarksList.clear();
        for (Mark m: subject.marks)
        {
            dmTempMarksList.addElement(" • " + m.getMarkType() + ": " + m.mark + "% [" + m.markDescription + "]");
        }
    }
    /**
     * Sets a teacher for the default list of students.
     * <br>
     * @param t The teacher's credentials.
     */
    public void setCurrentTeacher(Teacher t)
    {
        this.selectedTeacher = t;
        makeDefListOfStudents();
    }
    /**
     * Main method for Report Card Pro. 
     * <br>
     * @throws IOException  
     */

    }

    public static void main(String[] args) throws IOException
    {
        ReportCardPro rcp = new ReportCardPro();
        rcp.startProgram();
    }
}