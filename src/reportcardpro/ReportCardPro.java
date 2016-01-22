package reportcardpro;

import java.io.IOException;
import javax.swing.*;

public class ReportCardPro
{
    public void startProgram() throws IOException
    {
        tryLogin();
    }
    
    public void tryLogin() throws IOException
    {
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
        
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
        
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
    }
    
    public void newTeacher(Teacher t) throws IOException
    {
        Login loginScreen = new Login();
        loginScreen.setVisible(true);
    }

    public static void main(String[] args) throws IOException
    {
        ReportCardPro rcp = new ReportCardPro();
        rcp.startProgram();
    }
}