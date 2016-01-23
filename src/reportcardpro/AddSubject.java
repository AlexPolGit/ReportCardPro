package reportcardpro;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class AddSubject extends javax.swing.JFrame
{
    public Teacher currentTeacher;
    public Student currentStudent;
    public Subject createdSubject;
    
    public AddSubject(Teacher t, Student s)
    {
        try
        {
            this.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
        
        this.currentStudent = s;
        this.currentTeacher = t;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fldComm = new javax.swing.JTextField();
        lblComm = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        fldDesc = new javax.swing.JTextField();
        fldTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblAddNewSubject = new javax.swing.JLabel();
        btnAddSubject = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(512, 512));
        setMinimumSize(new java.awt.Dimension(512, 512));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(512, 512));
        jPanel2.setMinimumSize(new java.awt.Dimension(512, 512));
        jPanel2.setPreferredSize(new java.awt.Dimension(512, 512));

        fldComm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblComm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblComm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComm.setText("Comment (Optional):");

        lblDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDesc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDesc.setText("Description:");

        fldDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fldTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Title:");

        lblAddNewSubject.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblAddNewSubject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddNewSubject.setText("Add New Subject to " + currentStudent.name);

        btnAddSubject.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddSubject.setText("Add Subject");
        btnAddSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblAddNewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fldDesc))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fldComm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(fldTitle))))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAddNewSubject)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldComm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubjectActionPerformed
        if (!fldTitle.getText().isEmpty() && !fldDesc.getText().isEmpty())
        {
            currentTeacher.removeStudent(currentStudent);
            createdSubject = new Subject(fldTitle.getText(), fldDesc.getText());
            createdSubject.setComment(fldComm.getText());
            currentStudent.addSubject(createdSubject);
            
            try
            {
                currentTeacher.addStudent(currentStudent);
                currentTeacher.writeStudentList(currentTeacher);
            }
            catch (IOException ex)
            {
                System.err.println(ex.toString());
            }
            
            EditStudent es;
            try
            {
                es = new EditStudent(currentTeacher, currentStudent);
                es.setVisible(true);
            }
            catch (IOException ex)
            {
                Logger.getLogger(AddSubject.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.setVisible(false);
        }
        if (fldTitle.getText().isEmpty() && !fldDesc.getText().isEmpty())
        {
            lblTitle.setForeground(Color.RED);
            lblDesc.setForeground(Color.BLACK);
        }
        if (fldDesc.getText().isEmpty() && !fldTitle.getText().isEmpty())
        {
            lblDesc.setForeground(Color.RED);
            lblTitle.setForeground(Color.BLACK);
        }
        if (fldDesc.getText().isEmpty() && fldTitle.getText().isEmpty())
        {
            lblDesc.setForeground(Color.RED);
            lblTitle.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnAddSubjectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSubject;
    private javax.swing.JTextField fldComm;
    private javax.swing.JTextField fldDesc;
    private javax.swing.JTextField fldTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddNewSubject;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}