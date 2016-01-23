package reportcardpro;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import javax.imageio.ImageIO;

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
    private void initComponents()
    {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        fldName = new javax.swing.JTextField();
        btnCreateAcc = new javax.swing.JButton();
        lblYourName = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registry");

        jDesktopPane2.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.add(fldName);
        fldName.setBounds(40, 120, 280, 30);

        btnCreateAcc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCreateAcc.setText("Create Account");
        btnCreateAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAcc.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnCreateAccMouseClicked(evt);
            }
        });
        jDesktopPane2.add(btnCreateAcc);
        btnCreateAcc.setBounds(80, 170, 200, 80);

        lblYourName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblYourName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYourName.setText("Register Name to this Account:");
        jDesktopPane2.add(lblYourName);
        lblYourName.setBounds(50, 50, 260, 30);

        lblNameError.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameError.setText(" ");
        jDesktopPane2.add(lblNameError);
        lblNameError.setBounds(30, 270, 300, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            System.out.println("New Teacher Created...");
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
        else
        {
            lblNameError.setText("Please choose a name.");
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
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblYourName;
    // End of variables declaration//GEN-END:variables
}