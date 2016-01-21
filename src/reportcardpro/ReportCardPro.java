package reportcardpro;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ReportCardPro
{
    public Report rep = new Report();
    public DefaultListModel dmTempStudentsList = new DefaultListModel();
    public DefaultListModel dmTempSubjectList = new DefaultListModel();
    public DefaultListModel dmTempMarksList = new DefaultListModel();
    
    public Teacher selectedTeacher;
    public Student selectedStudent;
    public Subject selectedSubject;
    public Mark selectedMark;
    
    public ReportCardPro()
    {}
    
    public void startProgram() throws IOException
    {
        tryLogin();
    }
    
    public void tryLogin() throws IOException
    {
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
        
        while(loginScreen.isEnabled())
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                System.err.println(ex.toString());
            }
        }
        System.out.println("Opening teacher profile of: " + loginScreen.foundTeacher.name);

        MainFrame main = new MainFrame(loginScreen.foundTeacher);
        
        try
        {
            main.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
        
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
    
    public void newTeacher(Teacher t) throws IOException
    {
        this.selectedTeacher = t;
        rep.addTeacher(t);
        
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
    
    public void makeDefListOfStudents()
    {
        dmTempStudentsList.clear();
        System.out.println(selectedTeacher.username);
        for (Student s: selectedTeacher.students)
        {
            dmTempStudentsList.addElement(" • " + s.name + " (" + s.gender + "), Age " + s.getAge());
        }
    }
    
    public void makeDefListOfSubjects(Student student)
    {
        dmTempSubjectList.clear();
        for (Subject s: student.subjects)
        {
            dmTempSubjectList.addElement(" • " + s.subjectName + ": " + s.subjectDescription);
        }
    }
    
    public void makeDefListOfMarks(Subject subject)
    {
        dmTempMarksList.clear();
        for (Mark m: subject.marks)
        {
            dmTempMarksList.addElement(" • " + m.getMarkType() + ": " + m.mark + "% [" + m.markDescription + "]");
        }
    }

    public void setCurrentTeacher(Teacher t)
    {
        this.selectedTeacher = t;
        makeDefListOfStudents();
    }
    
    public static void main(String[] args) throws IOException
    {
        ReportCardPro rcp = new ReportCardPro();
        rcp.startProgram();
    }
}