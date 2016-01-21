package reportcardpro;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame
{
    public ReportCardPro rcp = new ReportCardPro();
    public Report rep = new Report();
    public Teacher foundTeacher;
    
    public Login()
    {
        initComponents();
        rep.readTeacherList();
        rep.listTeachers();
        //setIconImage(new ImageIcon("src\\reportcardpro\\img\\bgPaper.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmLogin = new javax.swing.JDesktopPane();
        fldPassword = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        fldUsername = new javax.swing.JTextField();
        lblTempTitle = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblErrorMsgReg = new javax.swing.JLabel();
        lblErrorMsgLogin = new javax.swing.JLabel();
        lblErrorLogin = new javax.swing.JLabel();
        lblErrorReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Card Pro: Login");

        frmLogin.setBackground(new java.awt.Color(240, 240, 240));
        frmLogin.add(fldPassword);
        fldPassword.setBounds(210, 270, 330, 30);

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username:");
        frmLogin.add(lblUsername);
        lblUsername.setBounds(60, 210, 140, 20);

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");
        frmLogin.add(lblPassword);
        lblPassword.setBounds(70, 270, 110, 20);
        frmLogin.add(fldUsername);
        fldUsername.setBounds(210, 210, 330, 30);

        lblTempTitle.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        lblTempTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reportcardpro/img/RCP Logo.png"))); // NOI18N
        lblTempTitle.resize(200, 100);
        lblTempTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTempTitleMouseClicked(evt);
            }
        });
        frmLogin.add(lblTempTitle);
        lblTempTitle.setBounds(40, 30, 560, 160);

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        frmLogin.add(btnRegister);
        btnRegister.setBounds(360, 320, 190, 80);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        frmLogin.add(btnLogin);
        btnLogin.setBounds(80, 320, 190, 80);

        lblErrorMsgReg.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorMsgReg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblErrorMsgReg.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMsgReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frmLogin.add(lblErrorMsgReg);
        lblErrorMsgReg.setBounds(350, 410, 180, 0);

        lblErrorMsgLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorMsgLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblErrorMsgLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMsgLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frmLogin.add(lblErrorMsgLogin);
        lblErrorMsgLogin.setBounds(100, 410, 180, 0);

        lblErrorLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrorLogin.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorLogin.setText(" ");
        frmLogin.add(lblErrorLogin);
        lblErrorLogin.setBounds(60, 420, 230, 30);

        lblErrorReg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrorReg.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorReg.setText(" ");
        frmLogin.add(lblErrorReg);
        lblErrorReg.setBounds(340, 420, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frmLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frmLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if (fldUsername.getText().isEmpty() || fldPassword.getText().isEmpty())
        {
            fldUsername.setText("");
            fldPassword.setText("");
            lblErrorLogin.setText("Fields cannot be blank.");
        }
        else
        {
            lblErrorLogin.setText("");

            String eUser = fldUsername.getText();
            String ePass = fldPassword.getText();

            fldUsername.setText("");
            fldPassword.setText("");

            System.out.println("Trying login as: " + eUser + ", " + ePass);
            try
            {
                this.tryLogin(eUser, ePass);
            }
            catch(IOException ex)
            {
                System.err.println(ex.toString());
            }
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        boolean isUsed = false;
        for (Teacher t: rep.teachers)
        {
            if (t.username.equals(fldUsername.getText()))
            {
                isUsed = true;
                break;
            }
        }

        if (fldUsername.getText().isEmpty() || fldPassword.getText().isEmpty())
        {
            fldUsername.setText("");
            fldPassword.setText("");
            lblErrorReg.setText("Fields cannot be blank.");
        }
        else if (isUsed)
        {
            lblErrorReg.setText(fldUsername.getText() + " already exists.");
            fldUsername.setText("");
            fldPassword.setText("");
        }
        else
        {
            lblErrorReg.setText("");
            Registry reg = new Registry();
            reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            reg.setUsername(fldUsername.getText());
            reg.setPassword(fldPassword.getText());

            fldUsername.setText("");
            fldPassword.setText("");

            reg.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblTempTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTempTitleMouseClicked
        Student testStu = new Student(UUID.randomUUID(), "Jimbo", "Male", 2003, 7, 19);

        Subject temp1 = new Subject("Art", "Arts and crafts.");
        Subject temp2 = new Subject("Business", "$$$.");
        Subject temp3 = new Subject("Geology", "Rocks and minerals.");
        Subject temp4 = new Subject("Philosophy", "But why?");
        Subject temp5 = new Subject("Math", "y=mx+b");
        Subject temp6 = new Subject("Physics", "Ek=1/2mv^2");

        temp1.addMark(new Mark(100.0, 1.0, "Some description"));
        temp1.addMark(new Mark(92.0, 1.0, "thing"));
        
        temp2.addMark(new Mark(75.0, 1.0, "etcetcetc"));
        temp2.addMark(new Mark(90.0, 1.0, "Some description"));
        temp2.addMark(new Mark(67.0, 1.0, "description"));
        temp2.addMark(new Mark(75.0, 1.0, "Some description"));
        temp2.addMark(new Mark(32.0, 1.0, "...."));
        temp2.addMark(new Mark(60.0, 1.0, "Some description"));
        temp2.addMark(new Mark(75.0, 1.0, "abcedrgg"));
        temp2.addMark(new Mark(90.0, 1.0, "abcdef"));
        temp2.addMark(new Mark(60.0, 1.0, "Some description"));
        temp2.addMark(new Mark(63.0, 1.0, "Some description"));
        temp2.addMark(new Mark(90.0, 1.0, "abcd"));
        temp2.addMark(new Mark(60.0, 1.0, "Some description"));
        temp2.addMark(new Mark(99.0, 1.0, "Some description"));
        temp2.addMark(new Mark(90.0, 1.0, "blah blah"));
        temp2.addMark(new Mark(60.0, 1.0, "description"));

        temp3.addMark(new Mark(81.0, 1.0, "Some description or other"));
        
        temp4.addMark(new Mark(83.0, 1.0, "etcetcetc"));
        temp4.addMark(new Mark(65.0, 1.0, "Some description"));
        temp4.addMark(new Mark(73.0, 1.0, "yeah"));
        temp4.addMark(new Mark(90.0, 1.0, "description"));
        
        temp5.addMark(new Mark(83.0, 1.0, "etcetcetc"));
        temp5.addMark(new Mark(99.0, 1.0, "Some description"));
        temp5.addMark(new Mark(93.0, 1.0, "yeah"));
        temp5.addMark(new Mark(90.0, 1.0, "description"));
        temp5.addMark(new Mark(93.0, 1.0, "yeah"));
        temp5.addMark(new Mark(99.0, 1.0, "description"));
        
        temp6.addMark(new Mark(23.0, 1.0, "etcetcetc"));
        temp6.addMark(new Mark(35.0, 1.0, "Some description"));
        temp6.addMark(new Mark(40.0, 1.0, "description"));

        testStu.addSubject(temp1);
        testStu.addSubject(temp2);
        testStu.addSubject(temp3);
        testStu.addSubject(temp4);
        testStu.addSubject(temp5);
        testStu.addSubject(temp6);

        System.out.println(testStu.name + ": " + testStu.subjects.get(0).subjectName + ", " + testStu.subjects.get(1).subjectName + ", " + testStu.subjects.get(2).subjectName);
        testStu.listSubjects();

        PrintableReport pr = new PrintableReport(testStu);

        try
        {
            pr.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }

        pr.setVisible(true);
    }//GEN-LAST:event_lblTempTitleMouseClicked

    public void tryLogin(String u, String p) throws IOException
    {
        boolean error = false;
        rep.readTeacherList();
        for (Teacher t: rep.teachers)
        {
            System.out.println("Current login candidate: " + t.name);
            
            if (t.username.equals(u) && t.password.equals(p))
            {
                error = false;
                btnLogin.setText("Login");
                this.foundTeacher = t;
                System.out.println("Logging in as " + this.foundTeacher.name);
                this.setVisible(false);
                this.setEnabled(false);
                
                rep.writeTeachersList();
                break;
            }
            else
            {
                error = true;
                System.out.println("Credentials do not match those of: " + t.name);
            }
        }
        if (error)
        {
            lblErrorLogin.setText("Could not find user.");
        }
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldUsername;
    private javax.swing.JDesktopPane frmLogin;
    private javax.swing.JLabel lblErrorLogin;
    private javax.swing.JLabel lblErrorMsgLogin;
    private javax.swing.JLabel lblErrorMsgReg;
    private javax.swing.JLabel lblErrorReg;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTempTitle;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
