package reportcardpro;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class EditUserInfo extends javax.swing.JFrame
{
    Teacher currentTeacher;
    
    public EditUserInfo(Teacher t)
    {
        try
        {
            this.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
        
        this.currentTeacher = t;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fldUser = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblCurrPass = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnUpdateInfo = new javax.swing.JButton();
        lblPass = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        fldCurrPass = new javax.swing.JPasswordField();
        fldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(512, 512));
        jPanel1.setMinimumSize(new java.awt.Dimension(512, 512));
        jPanel1.setPreferredSize(new java.awt.Dimension(512, 512));

        fldUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fldUser.setText(currentTeacher.username);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Editing Info of " + "");

        lblCurrPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCurrPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrPass.setText("Please Enter Current Password:");

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("New Username:");

        btnUpdateInfo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateInfo.setText("Update Info");
        btnUpdateInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateInfoMouseClicked(evt);
            }
        });

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPass.setText("New Password:");

        lblError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(204, 0, 0));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Change Name:");

        fldName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fldName.setText(currentTeacher.name);

        fldPass.setText(currentTeacher.password);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(lblName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdateInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fldUser)
                                    .addComponent(lblCurrPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fldName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fldCurrPass)
                                    .addComponent(fldPass))))
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCurrPass)
                .addGap(23, 23, 23)
                .addComponent(fldCurrPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addGap(12, 12, 12)
                .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateInfoMouseClicked
        String enteredPrevPassword = fldCurrPass.getText();
        String enteredNewUsername = fldUser.getText();
        String enteredNewPassword = fldPass.getText();
        
        if (!enteredPrevPassword.equals(currentTeacher.password))
        {
            lblError.setText("Password incorrect.");
        }
        else
        {
            boolean isUsed = false;
            Report rep = new Report();
            
            for (Teacher t: rep.teachers)
            {
                if (t.name.equals(enteredNewUsername))
                {
                    isUsed = true;
                    break;
                }
            }
            
            if (isUsed)
            {
                lblError.setText("Username is used.");
            }
            else if (fldPass.getText().isEmpty())
            {
                lblError.setText("Cannot have blank new password.");
            }
            else
            {
                currentTeacher.setName(fldName.getText());
                if (currentTeacher.name.isEmpty())
                {
                    currentTeacher.setName("Name not Set");
                }
                currentTeacher.setUsername(enteredNewUsername);
                currentTeacher.setPassword(enteredNewPassword);
                try
                {
                    rep.writeTeachersList();
                    MainFrame mf = new MainFrame(currentTeacher);
                    mf.setVisible(true);
                    
                    this.setVisible(false);
                    this.setEnabled(false);
                }
                catch (IOException ex)
                {
                    System.err.println(ex.toString());
                }
            }
        }
    }//GEN-LAST:event_btnUpdateInfoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateInfo;
    private javax.swing.JPasswordField fldCurrPass;
    private javax.swing.JTextField fldName;
    private javax.swing.JPasswordField fldPass;
    private javax.swing.JTextField fldUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurrPass;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}