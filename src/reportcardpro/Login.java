package reportcardpro;

public class Login extends javax.swing.JFrame
{
    public ReportCardPro rcp = new ReportCardPro();
    
    public Login()
    {
        initComponents();
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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Report Card Pro: Login");

        frmLogin.setBackground(new java.awt.Color(255, 255, 255));
        frmLogin.add(fldPassword);
        fldPassword.setBounds(210, 230, 330, 30);

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username:");
        frmLogin.add(lblUsername);
        lblUsername.setBounds(80, 170, 110, 20);

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");
        frmLogin.add(lblPassword);
        lblPassword.setBounds(80, 230, 110, 20);
        frmLogin.add(fldUsername);
        fldUsername.setBounds(210, 170, 330, 30);

        lblTempTitle.setFont(new java.awt.Font("Imprint MT Shadow", 0, 48)); // NOI18N
        lblTempTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempTitle.setText("Report Card Pro");
        frmLogin.add(lblTempTitle);
        lblTempTitle.setBounds(130, 40, 370, 80);

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        frmLogin.add(btnRegister);
        btnRegister.setBounds(350, 310, 190, 80);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        frmLogin.add(btnLogin);
        btnLogin.setBounds(100, 310, 190, 80);

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
        Registry reg = new Registry();
        reg.setUsername(fldUsername.getText());
        reg.setPassword(fldPassword.getText());
        fldUsername.setText("");
        fldPassword.setText("");
        reg.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        rcp.selectedTeacher = null;
        rcp.dmTempStudentsList.clear();
        rcp.dmTempSubjectList.clear();
        rcp.dmTempMarksList.clear();
        
        String eUser = fldUsername.getText();
        String ePass = fldPassword.getText();
        fldUsername.setText("");
        fldPassword.setText("");
        
        setCurrentTeacher(eUser, ePass);
    }//GEN-LAST:event_btnLoginMouseClicked

    public boolean credentialsAreCorrect(Teacher t, String u, String p)
    {
        boolean ans = false;
        if (t.username.equals(u) && t.password.equals(p))
        {
            ans = true;
        }
        return ans;
    }
    
    public void setCurrentTeacher(String u, String p)
    {
        boolean found = false;
        for (Teacher t: rcp.rep.teachers)
        {
            if (credentialsAreCorrect(t, u, p))
            {
                btnLogin.setText("Login");
                rcp.setCurrentTeacher(t);
                new MainFrame().setVisible(true);
            }
        }
        if (!found)
        {
            btnLogin.setText("Login (Error)");
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
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTempTitle;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
