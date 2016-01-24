package reportcardpro;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class EditSubject extends javax.swing.JFrame
{
    public Teacher currentTeacher;
    public Student currentStudent;
    public Subject originalSubject;
    public Subject editedSubject;
    
    public EditSubject(Teacher tea, Student stu, Subject sub)
    {
        try
        {
            this.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
        
        this.currentStudent = stu;
        this.currentTeacher = tea;
        this.originalSubject = sub;
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        fldTitle = new javax.swing.JTextField();
        fldDesc = new javax.swing.JTextField();
        fldComm = new javax.swing.JTextField();
        lblEditStudentTitle = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblComm = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        jTextField3.setText("jTextField1");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(512, 512));
        jPanel1.setMinimumSize(new java.awt.Dimension(512, 512));

        fldTitle.setText(originalSubject.subjectName);

        fldDesc.setText(originalSubject.subjectDescription);

        fldComm.setText(originalSubject.comment);

        lblEditStudentTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditStudentTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditStudentTitle.setText("Edit Subject: " + "" + " of " + currentStudent.name);

        lblDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDesc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDesc.setText("Description:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Title:");

        lblComm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblComm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblComm.setText("Comment:");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setText("Update Subject");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblComm, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fldComm, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDesc)
                                .addGap(18, 18, 18)
                                .addComponent(fldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(18, 18, 18)
                                .addComponent(fldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEditStudentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(157, 157, 157))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblEditStudentTitle)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldComm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        String name = fldTitle.getText();
        String desc = fldDesc.getText();
        String comm = fldComm.getText();
        
        editedSubject = new Subject(name, desc);
        editedSubject.setComment(comm);
        
        for (Mark m: originalSubject.marks)
        {
            editedSubject.addMark(m);
        }
        
        currentTeacher.removeStudent(currentStudent);
        currentStudent.removeSubject(originalSubject);
        currentStudent.addSubject(editedSubject);
        
        try
        {
            currentTeacher.addStudent(currentStudent);
            
            EditStudent es = new EditStudent(currentTeacher, currentStudent);
            es.setVisible(true);
        }
        catch (IOException ex)
        {
            System.err.println(ex.toString());
        }
        
        this.setVisible(false);
        this.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField fldComm;
    private javax.swing.JTextField fldDesc;
    private javax.swing.JTextField fldTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblEditStudentTitle;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}