package reportcardpro;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;

public class MainFrame extends javax.swing.JFrame
{

    public DefaultListModel dmTempStudentsList = new DefaultListModel();
    public DefaultListModel dmTempSubjectList = new DefaultListModel();
    public DefaultListModel dmTempMarksList = new DefaultListModel();
    public Report rep = new Report();
    
    public Teacher selectedTeacher;
    public Student selectedStudent;
    public Subject selectedSubject;
    public Mark selectedMark;
    
    public DecimalFormat df = new DecimalFormat("#.##");
    
    public DebugConsole debug = new DebugConsole();
    
    public MainFrame(Teacher t) throws IOException
    {
        this.selectedTeacher = t;   
        makeDefListOfStudents();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblSignedInAs = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMarks = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstSubjects = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstStudents = new javax.swing.JList();
        lblStudentNameText = new javax.swing.JLabel();
        lblAgeText = new javax.swing.JLabel();
        lblGenderText = new javax.swing.JLabel();
        lblStudents = new javax.swing.JLabel();
        lblTeacherName = new javax.swing.JLabel();
        lblSubjectText = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblSubjectAverageText = new javax.swing.JLabel();
        lblSubjectAverage = new javax.swing.JLabel();
        LblSelectedMark = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblStudentName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        picStudentPicture = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menSettings = new javax.swing.JMenu();
        menSettingsChangeUser = new javax.swing.JMenuItem();
        menSettingsChangePassword = new javax.swing.JMenuItem();
        menSettingsLogOut = new javax.swing.JMenuItem();
        menStudents = new javax.swing.JMenu();
        menStudentsAdd = new javax.swing.JMenuItem();
        menStudentsRemove = new javax.swing.JMenuItem();
        menStudentsEdit = new javax.swing.JMenuItem();
        menReport = new javax.swing.JMenu();
        menHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        lblSignedInAs.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSignedInAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignedInAs.setText("Signed in as:");
        jDesktopPane1.add(lblSignedInAs);
        lblSignedInAs.setBounds(60, 20, 110, 40);

        lstMarks.setModel(dmTempMarksList);
        jScrollPane3.setViewportView(lstMarks);

        jDesktopPane1.add(jScrollPane3);
        jScrollPane3.setBounds(510, 140, 200, 300);

        lstSubjects.setModel(dmTempSubjectList);
        lstSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstSubjectsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(lstSubjects);

        jDesktopPane1.add(jScrollPane4);
        jScrollPane4.setBounds(240, 280, 260, 160);

        lstStudents.setModel(dmTempStudentsList);
        lstStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstStudentsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(lstStudents);

        jDesktopPane1.add(jScrollPane5);
        jScrollPane5.setBounds(10, 190, 220, 250);

        lblStudentNameText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblStudentNameText.setText("Student Name:");
        jDesktopPane1.add(lblStudentNameText);
        lblStudentNameText.setBounds(320, 20, 120, 30);

        lblAgeText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAgeText.setText("Age:");
        jDesktopPane1.add(lblAgeText);
        lblAgeText.setBounds(320, 100, 40, 30);

        lblGenderText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblGenderText.setText("Gender:");
        jDesktopPane1.add(lblGenderText);
        lblGenderText.setBounds(320, 60, 57, 30);

        lblStudents.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudents.setText("Students");
        jDesktopPane1.add(lblStudents);
        lblStudents.setBounds(80, 160, 70, 30);

        lblTeacherName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTeacherName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeacherName.setText(this.selectedTeacher.name);
        jDesktopPane1.add(lblTeacherName);
        lblTeacherName.setBounds(20, 60, 200, 30);

        lblSubjectText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSubjectText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubjectText.setText("Subject:");
        jDesktopPane1.add(lblSubjectText);
        lblSubjectText.setBounds(580, 20, 70, 20);

        lblSubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSubject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubject.setText("[none]");
        jDesktopPane1.add(lblSubject);
        lblSubject.setBounds(530, 50, 160, 20);

        lblSubjectAverageText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSubjectAverageText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubjectAverageText.setText("Subject Average:");
        jDesktopPane1.add(lblSubjectAverageText);
        lblSubjectAverageText.setBounds(550, 80, 130, 20);

        lblSubjectAverage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSubjectAverage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubjectAverage.setText("[none]");
        jDesktopPane1.add(lblSubjectAverage);
        lblSubjectAverage.setBounds(530, 110, 160, 20);

        LblSelectedMark.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDesktopPane1.add(LblSelectedMark);
        LblSelectedMark.setBounds(590, 100, 50, 0);

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("[none]");
        jDesktopPane1.add(lblAge);
        lblAge.setBounds(360, 100, 100, 30);

        lblStudentName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStudentName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStudentName.setText("[none]");
        jDesktopPane1.add(lblStudentName);
        lblStudentName.setBounds(430, 14, 120, 40);

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGender.setText("[none]");
        jDesktopPane1.add(lblGender);
        lblGender.setBounds(380, 60, 130, 30);

        picStudentPicture.setText("pic");
        picStudentPicture.setToolTipText("");
        jDesktopPane1.add(picStudentPicture);
        picStudentPicture.setBounds(250, 80, 20, 14);

        menSettings.setText("Settings");

        menSettingsChangeUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menSettingsChangeUser.setText("Change Username");
        menSettingsChangeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeUsernameMouse(evt);
            }
        });
        menSettingsChangeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSettingsChangeUserActionPerformed(evt);
            }
        });
        menSettings.add(menSettingsChangeUser);

        menSettingsChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menSettingsChangePassword.setText("Change Password");
        menSettingsChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePasswordMouse(evt);
            }
        });
        menSettings.add(menSettingsChangePassword);

        menSettingsLogOut.setText("Log Out");
        menSettingsLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouse(evt);
            }
        });
        menSettingsLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSettingsLogOutActionPerformed(evt);
            }
        });
        menSettings.add(menSettingsLogOut);

        jMenuBar1.add(menSettings);

        menStudents.setText("Students");

        menStudentsAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menStudentsAdd.setText("Add Student");
        menStudentsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStudentMouse(evt);
            }
        });
        menStudentsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menStudentsAddActionPerformed(evt);
            }
        });
        menStudents.add(menStudentsAdd);

        menStudentsRemove.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menStudentsRemove.setText("Remove Student");
        menStudentsRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveStudentMouse(evt);
            }
        });
        menStudents.add(menStudentsRemove);

        menStudentsEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menStudentsEdit.setText("Edit Student");
        menStudentsEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditStudentMouse(evt);
            }
        });
        menStudentsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menStudentsEditActionPerformed(evt);
            }
        });
        menStudents.add(menStudentsEdit);

        jMenuBar1.add(menStudents);

        menReport.setText("Report");
        menReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menReportMouseClicked(evt);
            }
        });
        jMenuBar1.add(menReport);

        menHelp.setText("Help");
        menHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menHelpMouseClicked(evt);
            }
        });
        menHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menHelpActionPerformed(evt);
            }
        });
        jMenuBar1.add(menHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menSettingsLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSettingsLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menSettingsLogOutActionPerformed

    private void menSettingsChangeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSettingsChangeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menSettingsChangeUserActionPerformed

    private void menHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menHelpActionPerformed

    private void menHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menHelpMouseClicked
        new HelpMenu().setVisible(true);
    }//GEN-LAST:event_menHelpMouseClicked

    private void ChangeUsernameMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeUsernameMouse
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeUsernameMouse

    private void ChangePasswordMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordMouse
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangePasswordMouse

    private void LogOutMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouse
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutMouse

    private void menStudentsEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menStudentsEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menStudentsEditActionPerformed

    private void RemoveStudentMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveStudentMouse
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveStudentMouse

    private void EditStudentMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStudentMouse
        // TODO add your handling code here:
    }//GEN-LAST:event_EditStudentMouse

    private void AddStudentMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStudentMouse

    }//GEN-LAST:event_AddStudentMouse

    private void lstStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstStudentsMouseClicked
        lblStudentName.setText("");
        lblGender.setText("");
        lblAge.setText("");
        lblSubject.setText("[none]");
        lblSubjectAverage.setText("[none]");
        
        dmTempMarksList.clear();
        
        String temp[] = lstStudents.getSelectedValue().toString().split(" ");
        String n = temp[2];
        String g = temp[3].substring(1, temp[3].length() - 2);
        int a = Integer.parseInt(temp[5]);

        selectedStudent = selectedTeacher.getStudent(n, g, a);
        makeDefListOfSubjects(selectedStudent);
        
        lblStudentName.setText(selectedStudent.name);
        lblGender.setText(selectedStudent.gender);
        lblAge.setText(Integer.toString(selectedStudent.getAge()));
    }//GEN-LAST:event_lstStudentsMouseClicked

    private void lstSubjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstSubjectsMouseClicked
        String temp = lstSubjects.getSelectedValue().toString().split(" ")[2];
        temp = temp.substring(0, temp.length() - 1);
        selectedSubject = selectedStudent.getSubjectByName(temp);
        makeDefListOfMarks(selectedSubject);
        lblSubject.setText(selectedSubject.subjectName);
        lblSubjectAverage.setText(df.format(selectedSubject.getMeanAverage()) + "%");
    }//GEN-LAST:event_lstSubjectsMouseClicked

    private void menReportMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_menReportMouseClicked
    {//GEN-HEADEREND:event_menReportMouseClicked
        PrintableReport pr = new PrintableReport(selectedStudent);

        try
        {
            pr.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }

        pr.setVisible(true);
    }//GEN-LAST:event_menReportMouseClicked

    private void menStudentsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menStudentsAddActionPerformed
        AddStudent as = new AddStudent(selectedTeacher);
        as.setVisible(true);
        
        this.setVisible(false);
        this.setEnabled(false);
    }//GEN-LAST:event_menStudentsAddActionPerformed

    public void makeDefListOfStudents()
    {
        dmTempStudentsList.clear();
        for (Student s: selectedTeacher.students)
        {
            dmTempStudentsList.addElement(" • " + s.name + " (" + s.gender + "), Age " + s.getAge());
        }
    }
    
    public void makeDefListOfSubjects(Student student)
    {
        dmTempSubjectList.clear();
        for (Subject s: selectedStudent.subjects)
        {
            dmTempSubjectList.addElement(" • " + s.subjectName + ": " + s.subjectDescription);
        }
    }
    
    public void makeDefListOfMarks(Subject subject)
    {
        dmTempMarksList.clear();
        for (Mark m: selectedSubject.marks)
        {
            dmTempMarksList.addElement(" • " + m.getMarkType() + ": " + m.mark + "% [" + m.markDescription + "]");
        }
    }
    
    public void addStudentToTeacher(Student s)
    {
        selectedTeacher.addStudent(s);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblSelectedMark;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeText;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGenderText;
    private javax.swing.JLabel lblSignedInAs;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblStudentNameText;
    private javax.swing.JLabel lblStudents;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblSubjectAverage;
    private javax.swing.JLabel lblSubjectAverageText;
    private javax.swing.JLabel lblSubjectText;
    private javax.swing.JLabel lblTeacherName;
    private javax.swing.JList lstMarks;
    private javax.swing.JList lstStudents;
    private javax.swing.JList lstSubjects;
    private javax.swing.JMenu menHelp;
    private javax.swing.JMenu menReport;
    private javax.swing.JMenu menSettings;
    private javax.swing.JMenuItem menSettingsChangePassword;
    private javax.swing.JMenuItem menSettingsChangeUser;
    private javax.swing.JMenuItem menSettingsLogOut;
    private javax.swing.JMenu menStudents;
    private javax.swing.JMenuItem menStudentsAdd;
    private javax.swing.JMenuItem menStudentsEdit;
    private javax.swing.JMenuItem menStudentsRemove;
    private javax.swing.JLabel picStudentPicture;
    // End of variables declaration//GEN-END:variables
}

class AddStudent extends javax.swing.JFrame
{
    
    public Teacher selectedTeacher;
    
    public AddStudent(Teacher t)
    {
        initComponents();
        this.selectedTeacher = t;
    }

    @SuppressWarnings("unchecked")                      
    private void initComponents()
    {
        pnlBG = new javax.swing.JPanel();
        fldName = new javax.swing.JTextField();
        fldGender = new javax.swing.JTextField();
        fldAgeDay = new javax.swing.JTextField();
        fldAgeMonth = new javax.swing.JTextField();
        fldAgeYear = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBG.setBackground(new java.awt.Color(255, 255, 255));

        lblGender.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGender.setText("Gender:");

        lblName.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Name:");

        lblAge.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setText("Age (D/M/Y):");

        btnAddStudent.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                try
                {
                    btnAddStudentMouseClicked(evt);
                } catch (IOException ex)
                {
                    System.err.println(ex.toString());
                }
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("Enter Student Info Below");

        javax.swing.GroupLayout pnlBGLayout = new javax.swing.GroupLayout(pnlBG);
        pnlBG.setLayout(pnlBGLayout);
        pnlBGLayout.setHorizontalGroup(
            pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fldGender)
                    .addComponent(fldName)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBGLayout.createSequentialGroup()
                        .addComponent(fldAgeDay, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fldAgeMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fldAgeYear, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(pnlBGLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(76, 76, 76))
        );
        pnlBGLayout.setVerticalGroup(
            pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBGLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitle)
                .addGap(31, 31, 31)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldAgeDay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldAgeMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldAgeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                        

    private void btnAddStudentMouseClicked(java.awt.event.MouseEvent evt) throws IOException                                           
    {      
        if (!fldName.getText().isEmpty() && !fldGender.getText().isEmpty() && !fldAgeDay.getText().isEmpty() && !fldAgeMonth.getText().isEmpty() && !fldAgeYear.getText().isEmpty())
        {
            String n = fldName.getText();
            String g = fldGender.getText();
            int d = Integer.parseInt(fldAgeDay.getText());
            int m = Integer.parseInt(fldAgeMonth.getText());
            int y = Integer.parseInt(fldAgeYear.getText());
            Student temp = new Student(UUID.randomUUID(), n, g, d, m, y);
            
            System.out.println("Created: " + temp.name + ", " + temp.gender + ", " + temp.getAge());
            
            selectedTeacher.addStudent(temp);
            selectedTeacher.sortStudents();
            selectedTeacher.writeStudentList();
            
            MainFrame mf = new MainFrame(selectedTeacher);
            
            try
            {
                mf.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
            }
            catch(IOException ex)
            {
                System.err.println(ex.toString());
            }
            
            mf.setVisible(true);
            
            this.setVisible(false);
            this.setEnabled(false);
        }
        
        if (fldName.getText().isEmpty())
        {
            lblName.setForeground(new Color(255, 0, 0));
        }
        
        if (fldGender.getText().isEmpty())
        {
            lblGender.setForeground(new Color(255, 0, 0));
        }
        
        if (fldAgeDay.getText().isEmpty())
        {
            lblAge.setForeground(new Color(255, 0, 0));
        }
        
        if (fldAgeMonth.getText().isEmpty())
        {
            lblAge.setForeground(new Color(255, 0, 0));
        }
        
        if (fldAgeYear.getText().isEmpty())
        {
            lblAge.setForeground(new Color(255, 0, 0));
        }
    }
    
    public void sleep(long ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            System.err.println(ex.toString());
        }
    }
     
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JTextField fldAgeDay;
    private javax.swing.JTextField fldAgeMonth;
    private javax.swing.JTextField fldAgeYear;
    private javax.swing.JTextField fldGender;
    private javax.swing.JTextField fldName;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBG;                  
}