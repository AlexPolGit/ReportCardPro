package reportcardpro;

import javax.swing.DefaultListModel;

public class TestGUIMain extends javax.swing.JFrame
{
    public DefaultListModel dmTempStudentsList = new DefaultListModel();
    public DefaultListModel dmTempSubjectList = new DefaultListModel();
    public DefaultListModel dmTempMarksList = new DefaultListModel();
    public Report rep = new Report();
    
    public Teacher selectedTeacher;
    public Student selectedStudent;
    public Subject selectedSubject;
    public Mark selectedMark;
    
    public TestGUIMain()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        markList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        subjectList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentList.setModel(this.dmTempStudentsList);
        studentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        studentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentList);

        markList.setModel(this.dmTempMarksList);
        markList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        markList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(markList);

        subjectList.setModel(this.dmTempSubjectList);
        subjectList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        subjectList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(subjectList);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Current Selected Student: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Current Selected Subject: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Current Selected Mark: ");

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Password:");

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Current Teacher: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(171, 171, 171))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(169, 169, 169)))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(254, 254, 254))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(113, 113, 113))))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(220, 220, 220))
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    private void studentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMouseClicked
        dmTempSubjectList.clear();
        dmTempMarksList.clear();
 
        String temp = studentList.getSelectedValue().toString().split(" ")[2];
        Teacher t = selectedTeacher;
        selectedStudent = t.getStudentByName(temp);
        makeDefListOfSubjects(selectedStudent);
        
        jLabel1.setText("Current Selected Student: " + selectedStudent.name);
    }//GEN-LAST:event_studentListMouseClicked

    private void subjectListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectListMouseClicked
        String temp = subjectList.getSelectedValue().toString().split(" ")[2];
        temp = temp.substring(0, temp.length() - 1);
        selectedSubject = selectedStudent.getSubjectByName(temp);
        makeDefListOfMarks(selectedSubject);
        
        jLabel2.setText("Current Selected Subject: " + selectedSubject.subjectName);
    }//GEN-LAST:event_subjectListMouseClicked

    private void markListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markListMouseClicked
        String x = markList.getSelectedValue().toString();
        String temp = "";
        for (int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) == '[')
            {
                temp = x.substring(i, x.length() - 1).substring(1);
                break;
            }
        }
        
        selectedMark = selectedSubject.getMarkByDescription(temp);
        jLabel3.setText("Current Selected Mark: " + selectedMark.markDescription);
    }//GEN-LAST:event_markListMouseClicked

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed

    }//GEN-LAST:event_userFieldActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        selectedTeacher = null;
        jLabel6.setText("Current Teacher: ");
        dmTempStudentsList.clear();
        dmTempSubjectList.clear();
        dmTempMarksList.clear();
        
        String eUser = userField.getText();
        String ePass = passField.getText();
        userField.setText("");
        passField.setText("");
        
        setCurrentTeacher(eUser, ePass);
    }//GEN-LAST:event_loginButtonMouseClicked
  
    public void setCurrentTeacher(String u, String p)
    {
        boolean found = false;
        for (Teacher t: rep.teachers)
        {
            System.out.println("Checking User: " + t.username);
            System.out.println("Checking Password: " + t.password);
            if (t.username.equals(u) && t.password.equals(p))
            {
                System.out.println("FOUND\n");
                selectedTeacher = t;
                makeDefListOfStudents();
                jLabel6.setText("Current Teacher: " + t.name);
                loginButton.setText("Login");
                found = true;
                break;
            }
            System.out.println("NOT FOUND\n");
        }
        if (!found)
        {
            loginButton.setText("Login (Error)");
        }
    }
    
    public boolean credentialsAreCorrect(String u, String p)
    {
        boolean ans = false;
        for (Teacher t: rep.teachers)
        {
            System.out.println("Checking User: " + t.username);
            System.out.println("Checking Password: " + t.password);
            if (t.username.equals(u) && t.password.equals(p))
            {
                System.out.println("FOUND\n");
                ans = true;
                break;
            }
            System.out.println("NOT FOUND\n");
        }
        return ans;
    }
    
    public void makeDefListOfStudents()
    {
        dmTempStudentsList.clear();
        System.out.println(selectedTeacher.username);
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
    
    public static void main(String args[])
    {
        final TestGUIMain mainGUI = new TestGUIMain();
 
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                mainGUI.setVisible(true);
            }
        });
        
        mainGUI.rep.readTeacherList();
        mainGUI.rep.listTeachers();
        
        Teacher temp = mainGUI.rep.teachers.get(0);
        temp.listStudents();
        temp = mainGUI.rep.teachers.get(1);
        temp.listStudents();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loginButton;
    private javax.swing.JList markList;
    private javax.swing.JPasswordField passField;
    private javax.swing.JList studentList;
    private javax.swing.JList subjectList;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}