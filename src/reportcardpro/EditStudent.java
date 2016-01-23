package reportcardpro;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;

public class EditStudent extends javax.swing.JFrame
{
    
    public Teacher currentTeacher;
    public Student currentStudent;
    public Student originalStudent;
    public Subject selectedSubject;
    public Mark selectedMark;

    public DefaultListModel dmTempSubjectList = new DefaultListModel();
    public DefaultListModel dmTempMarksList = new DefaultListModel();
    
    public Report rep = new Report();

    public EditStudent(Teacher t, Student s) throws IOException
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
        this.currentStudent = s;
        this.originalStudent = s;
        
        for (Subject test: currentStudent.subjects)
        {
            System.out.println(test.subjectName);
        }
        
        this.currentTeacher.writeStudentList(currentTeacher);
        
        makeDefListOfSubjects();
        initComponents();
    }
    
    public void makeDefListOfSubjects()
    {
        dmTempSubjectList.clear();
        for (Subject s: currentStudent.subjects)
        {
            dmTempSubjectList.addElement(" • " + s.subjectName + ": " + s.subjectDescription);
        }
    }
    
    public void makeDefListOfMarks()
    {
        dmTempMarksList.clear();
        for (Mark m: selectedSubject.marks)
        {
            dmTempMarksList.addElement(" • " + m.getMarkType() + ": " + m.mark + "% [" + m.markDescription + "]");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGender = new javax.swing.JLabel();
        lblBD = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMarks = new javax.swing.JList();
        btnAddMark = new javax.swing.JButton();
        btnRemoveMark = new javax.swing.JButton();
        btnEditMark = new javax.swing.JButton();
        fldName = new javax.swing.JTextField();
        fldGender = new javax.swing.JTextField();
        fldBDD = new javax.swing.JTextField();
        fldBDM = new javax.swing.JTextField();
        fldBDY = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnUpdateInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSubjects = new javax.swing.JList();
        btnAddSubject = new javax.swing.JButton();
        btnEditSubject = new javax.swing.JButton();
        btnRemoveSubject = new javax.swing.JButton();
        lblSubList = new javax.swing.JLabel();
        lblMarkList = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender:");

        lblBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBD.setText("Birth Date (D/M/Y):");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name: ");

        lstMarks.setModel(dmTempMarksList);
        jScrollPane1.setViewportView(lstMarks);

        btnAddMark.setText("Add Mark");
        btnAddMark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMarkMouseClicked(evt);
            }
        });

        btnRemoveMark.setText("Remove Mark");
        btnRemoveMark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMarkMouseClicked(evt);
            }
        });
        btnRemoveMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMarkActionPerformed(evt);
            }
        });

        btnEditMark.setText("Edit Mark");
        btnEditMark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMarkMouseClicked(evt);
            }
        });
        btnEditMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditMarkActionPerformed(evt);
            }
        });

        fldName.setText(currentStudent.name);

        fldGender.setText(currentStudent.gender);

        fldBDD.setText(Integer.toString(currentStudent.birthDate.getTime().getDate()));

        fldBDM.setText(Integer.toString(currentStudent.birthDate.getTime().getMonth() + 1));

        fldBDY.setText(Integer.toString(currentStudent.birthDate.getTime().getYear() + 1900));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Edit Student Info:");

        btnUpdateInfo.setText("Update Info");
        btnUpdateInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateInfoMouseClicked(evt);
            }
        });

        lstSubjects.setModel(dmTempSubjectList);
        lstSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstSubjectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstSubjects);

        btnAddSubject.setText("Add Subject");
        btnAddSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSubjectMouseClicked(evt);
            }
        });
        btnAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubjectActionPerformed(evt);
            }
        });

        btnEditSubject.setText("Edit Subject");
        btnEditSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditSubjectMouseClicked(evt);
            }
        });
        btnEditSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSubjectActionPerformed(evt);
            }
        });

        btnRemoveSubject.setText("Remove Subject");
        btnRemoveSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveSubjectMouseClicked(evt);
            }
        });
        btnRemoveSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSubjectActionPerformed(evt);
            }
        });

        lblSubList.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblSubList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubList.setText("Subjects");

        lblMarkList.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblMarkList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMarkList.setText("Marks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldGender)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fldBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fldBDM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fldBDY, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fldName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblBD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnUpdateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnEditMark, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemoveMark, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddMark, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblTitle)
                .addGap(215, 215, 215)
                .addComponent(lblSubList, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMarkList, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarkList, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSubList))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddMark, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditMark, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveMark, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(fldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fldBDD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fldBDM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fldBDY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(btnUpdateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemoveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMarkActionPerformed
        if (lstMarks.getSelectedValue() != null)
        {
            String temp[] = lstMarks.getSelectedValue().toString().split(" ");
            String ms = "";
            for (int i = 4; i < temp.length; i++)
            {
                ms += temp[i] + " ";
            }
            ms = ms.substring(1, ms.length() - 2);
            
            Mark m = selectedSubject.getMarkByDescription(ms);
            
            selectedSubject.removeMark(m);
            lstMarks.removeAll();
            makeDefListOfMarks();
        }
    }//GEN-LAST:event_btnRemoveMarkActionPerformed

    private void btnEditMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditMarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMarkActionPerformed

    private void btnAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSubjectActionPerformed

    private void btnRemoveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSubjectActionPerformed
        if (lstSubjects.getSelectedValue() != null)
        {
            String temp[] = lstSubjects.getSelectedValue().toString().split(" ");
            String subName = temp[2].replaceAll(":", "");

            currentStudent.removeSubject(currentStudent.getSubjectByName(subName));
            lstSubjects.removeAll();
            makeDefListOfSubjects();
        }
    }//GEN-LAST:event_btnRemoveSubjectActionPerformed

    private void btnEditSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSubjectActionPerformed

    private void btnUpdateInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateInfoMouseClicked
        currentTeacher.removeStudent(originalStudent);
        currentStudent.setName(fldName.getText());
        currentStudent.setGender(fldGender.getText());
        currentStudent.setBirthday(Integer.parseInt(fldBDD.getText()), Integer.parseInt(fldBDM.getText()) - 1, Integer.parseInt(fldBDY.getText()));

        try
        {
            currentTeacher.addStudent(currentStudent);
            currentTeacher.writeStudentList(currentTeacher);

            MainFrame mf = new MainFrame(currentTeacher);
            mf.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
            mf.setVisible(true);
            
            this.setVisible(false);
            this.setEnabled(false);
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnUpdateInfoMouseClicked

    private void btnAddSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSubjectMouseClicked
        AddSubject as = new AddSubject(currentTeacher, currentStudent);
        as.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnAddSubjectMouseClicked

    private void btnEditSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditSubjectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSubjectMouseClicked

    private void btnRemoveSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveSubjectMouseClicked
        selectedSubject = currentStudent.getSubjectByName(lstSubjects.getSelectedValue().toString().split("")[2]);
        currentStudent.removeSubject(selectedSubject);
    }//GEN-LAST:event_btnRemoveSubjectMouseClicked

    private void btnAddMarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMarkMouseClicked
        AddMark am = new AddMark(currentTeacher, currentStudent, selectedSubject);
        am.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnAddMarkMouseClicked

    private void btnEditMarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMarkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditMarkMouseClicked

    private void btnRemoveMarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMarkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveMarkMouseClicked

    private void lstSubjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSubjectsMouseClicked
        String temp = lstSubjects.getSelectedValue().toString().split(" ")[2];
        temp = temp.substring(0, temp.length() - 1);
        selectedSubject = currentStudent.getSubjectByName(temp);
        makeDefListOfMarks();
    }//GEN-LAST:event_lstSubjectsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMark;
    private javax.swing.JButton btnAddSubject;
    private javax.swing.JButton btnEditMark;
    private javax.swing.JButton btnEditSubject;
    private javax.swing.JButton btnRemoveMark;
    private javax.swing.JButton btnRemoveSubject;
    private javax.swing.JButton btnUpdateInfo;
    private javax.swing.JTextField fldBDD;
    private javax.swing.JTextField fldBDM;
    private javax.swing.JTextField fldBDY;
    private javax.swing.JTextField fldGender;
    private javax.swing.JTextField fldName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBD;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMarkList;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSubList;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList lstMarks;
    private javax.swing.JList lstSubjects;
    // End of variables declaration//GEN-END:variables
}