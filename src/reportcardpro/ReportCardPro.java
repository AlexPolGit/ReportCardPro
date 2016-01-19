package reportcardpro;

import java.io.IOException;
import javax.swing.DefaultListModel;

public class ReportCardPro
{
    public Report rep = new Report();
    public DefaultListModel dmTempStudentsList = new DefaultListModel();
    public DefaultListModel dmTempSubjectList = new DefaultListModel();
    public DefaultListModel dmTempMarksList = new DefaultListModel();
    public Login loginScreen = new Login();
    public Registry registerScreen = new Registry();
    public MainFrame mainScreen = new MainFrame();
    
    public Teacher selectedTeacher;
    public Student selectedStudent;
    public Subject selectedSubject;
    public Mark selectedMark;
    
    public void newTeacher(Teacher t) throws IOException
    {
        rep.addTeacher(t);
        rep.writeTeachersList(rep.teachers);
        // RELOAD LOGIN
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
    
    public static void main(String[] args)
    {
        ReportCardPro rcp = new ReportCardPro();
        rcp.rep.readTeacherList();
        rcp.rep.listTeachers();
        rcp.loginScreen.setVisible(true);
    }
}