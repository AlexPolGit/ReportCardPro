package reportcardpro;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame
{
    public ReportCardPro rcp = new ReportCardPro();
    public Report rep = new Report();
    public Teacher foundTeacher;
    
    public Login()
    {
        try
        {
            this.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
        
        initComponents();
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
        frmLogin.setMaximumSize(new java.awt.Dimension(640, 480));
        frmLogin.setMinimumSize(new java.awt.Dimension(640, 480));
        frmLogin.setName(""); // NOI18N

        fldPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        fldUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
            .addComponent(frmLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            this.setEnabled(false);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void lblTempTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTempTitleMouseClicked

    }//GEN-LAST:event_lblTempTitleMouseClicked

    public void tryLogin(String u, String p) throws IOException
    {
        boolean error = false;
        rep.readTeacherList();
        rep.listTeachers();
        for (Teacher t: rep.teachers)
        {
            if (t.username.equals(u) && t.password.equals(p))
            {
                error = false;
                this.foundTeacher = t;
                System.out.println("Logging in as: " + this.foundTeacher.name);
                
                MainFrame mf = new MainFrame(foundTeacher);
                mf.setVisible(true);
                
                this.setVisible(false);
                this.setEnabled(false);

                break;
            }
            else
            {
                error = true;
            }
        }
        if (error)
        {
            lblErrorLogin.setText("Could not find a user.");
        }
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
