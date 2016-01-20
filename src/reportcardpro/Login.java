package reportcardpro;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Card Pro: Login");

        frmLogin.setBackground(new java.awt.Color(240, 240, 240));
        frmLogin.add(fldPassword);
        fldPassword.setBounds(210, 270, 330, 30);

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username:");
        frmLogin.add(lblUsername);
        lblUsername.setBounds(80, 210, 110, 20);

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");
        frmLogin.add(lblPassword);
        lblPassword.setBounds(80, 270, 110, 20);
        frmLogin.add(fldUsername);
        fldUsername.setBounds(210, 210, 330, 30);

        lblTempTitle.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        lblTempTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reportcardpro/img/RCP Logo.png"))); // NOI18N
        lblTempTitle.resize(200, 100);
        frmLogin.add(lblTempTitle);
        lblTempTitle.setBounds(40, 30, 560, 160);

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        frmLogin.add(btnRegister);
        btnRegister.setBounds(350, 350, 190, 80);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        frmLogin.add(btnLogin);
        btnLogin.setBounds(100, 350, 190, 80);

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

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        if (fldUsername.getText().equals("") || fldPassword.getText().equals(""))
        {
            lblErrorMsgReg.setText("Fields cannot be blank.");
        }
        else
        {
            lblErrorMsgReg.setText("");
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

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
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
    }//GEN-LAST:event_btnLoginMouseClicked

    public void tryLogin(String u, String p) throws IOException
    {
        rep.readTeacherList();
        for (Teacher t: rep.teachers)
        {
            System.out.println("Current login candidate: " + t.name);
            
            if (t.username.equals(u) && t.password.equals(p))
            {
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
                btnLogin.setText("Login (Retry)");
                System.out.println("Credentials do not match those of: " + t.name);
            }
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblErrorMsgLogin;
    private javax.swing.JLabel lblErrorMsgReg;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTempTitle;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
