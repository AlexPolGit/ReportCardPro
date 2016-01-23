package reportcardpro;

import java.io.IOException;

public class ReportCardPro//subjects=(ABC,abc,[],nice)&(DEF,def,[],nice)&(GHI,ghi,[],nice)
{
    public void startProgram() throws IOException
    {
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    }
    
    public void newTeacher(Teacher t) throws IOException
    {
        Report r = new Report();
        r.addTeacher(t);
        r.writeTeachersList();
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    }

    public static void main(String[] args) throws IOException
    {
        ReportCardPro rcp = new ReportCardPro();
        rcp.startProgram();
    }
}