package reportcardpro;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
/**
 * The main frame of the program that deals with the setup of the login screen and the frame where the report card functions.
 */
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
    
    public MainFrame(Teacher t)
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
        menReportView = new javax.swing.JMenuItem();
        menReportPrint = new javax.swing.JMenuItem();
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
        lblTeacherName.setBounds(30, 60, 190, 30);

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

        menReportView.setText("View Report");
        menReportView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewReportMosue(evt);
            }
        });
        menReport.add(menReportView);

        menReportPrint.setText("Print Report");
        menReportPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintReportMouse(evt);
            }
        });
        menReportPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menReportPrintActionPerformed(evt);
            }
        });
        menReport.add(menReportPrint);

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
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menSettingsLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSettingsLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menSettingsLogOutActionPerformed

    private void menSettingsChangeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSettingsChangeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menSettingsChangeUserActionPerformed

    private void menReportPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menReportPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menReportPrintActionPerformed

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
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStudentMouse

    private void ViewReportMosue(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewReportMosue
        if (selectedStudent != null)
        {
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
        }
    }//GEN-LAST:event_ViewReportMosue

    private void PrintReportMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintReportMouse
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintReportMouse

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
        for (Subject s: student.subjects)
        {
            dmTempSubjectList.addElement(" • " + s.subjectName + ": " + s.subjectDescription);
        }
    }
    
    public void makeDefListOfMarks(Subject subject)
    {
        dmTempMarksList.clear();
        for (Mark m: subject.marks)
        {
            dmTempMarksList.addElement(" • " + m.getMarkType() + ": " + m.mark + "% [" + m.markDescription + "]");
        }
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
    private javax.swing.JMenuItem menReportPrint;
    private javax.swing.JMenuItem menReportView;
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