package reportcardpro;

import java.io.IOException;
import java.util.UUID;

public class Registry extends javax.swing.JFrame
{
    public String toCreateUser;
    public String toCreatePassword;
    public String toCreateName;
    public ReportCardPro rcp = new ReportCardPro();
    
    public void setUsername(String u)
    {
        this.toCreateUser = u;
    }
    
    public void setPassword(String p)
    {
        this.toCreatePassword = p;
    }
    
    public Registry()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        fldName = new javax.swing.JTextField();
        btnCreateAcc = new javax.swing.JButton();
        lblYourName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registry");

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.add(fldName);
        fldName.setBounds(40, 120, 280, 30);

        btnCreateAcc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCreateAcc.setText("Create Account");
        btnCreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateAccMouseClicked(evt);
            }
        });
        jDesktopPane2.add(btnCreateAcc);
        btnCreateAcc.setBounds(80, 190, 200, 80);

        lblYourName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblYourName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYourName.setText("Your Name:");
        jDesktopPane2.add(lblYourName);
        lblYourName.setBounds(120, 50, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateAccMouseClicked
        if (!fldName.getText().isEmpty())
        {
            toCreateName = fldName.getText();
            Teacher t = new Teacher(UUID.randomUUID(), toCreateName, toCreateUser, toCreatePassword);
            System.out.println("New Teacher Created:");
            System.out.println("Name: " + t.name);
            System.out.println("Username: " + t.username);
            System.out.println("Password: " + t.password);
            System.out.println("ID: " + t.id);
            try
            {
                rcp.newTeacher(t);
            }
            catch (IOException ex)
            {
                System.err.println(ex.toString());
            }
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCreateAccMouseClicked

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Registry().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAcc;
    private javax.swing.JTextField fldName;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel lblYourName;
    // End of variables declaration//GEN-END:variables
}