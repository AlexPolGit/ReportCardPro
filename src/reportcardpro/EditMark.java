package reportcardpro;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class EditMark extends javax.swing.JFrame
{
    public Teacher currentTeacher;
    public Student currentStudent;
    public Subject currentSubject;
    public Mark currentMark;
    
    public EditMark(Teacher teach, Student stu, Subject sub, Mark mar)
    {
        try
        {
            this.setIconImage(ImageIO.read(new File("src\\reportcardpro\\img\\rcpA.png")));
        }
        catch(IOException ex)
        {
            System.err.println(ex.toString());
        }
        
        this.currentTeacher = teach;
        this.currentStudent = stu;
        this.currentSubject = sub;
        this.currentMark = mar;
        
        System.out.println("EDITING MARK: " + currentMark.markDescription);
        System.out.println(currentMark.mark);
        System.out.println(currentMark.markWeight);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMark = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        fldDesc = new javax.swing.JTextField();
        fldMark = new javax.swing.JTextField();
        btnUpdateMark = new javax.swing.JButton();
        fldWeight = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstWeights = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPrevType = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(512, 512));
        jPanel1.setMinimumSize(new java.awt.Dimension(512, 512));
        jPanel1.setName(""); // NOI18N

        lblMark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMark.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMark.setText("Mark (%):");

        lblWeight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWeight.setText("Weight:");

        lblDesc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesc.setText("Description:");

        fldDesc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fldDesc.setText(currentMark.markDescription);

        fldMark.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fldMark.setText(Double.toString(currentMark.mark));

        btnUpdateMark.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdateMark.setText("Update Mark");
        btnUpdateMark.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateMark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMarkActionPerformed(evt);
            }
        });

        fldWeight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fldWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lstWeights.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstWeights.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Quiz (1.0)", "Test (2.0)", "Quest (1.5)", "Assignment (0.5)", "Project (3.0)", "Exam (10.0)" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstWeights.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(lstWeights);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Custom Weight:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Editing Mark: " + currentMark.markDescription + " from " + currentSubject.subjectName);

        lblPrevType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrevType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrevType.setText("Was: " + currentMark.getMarkType() + " (" + Double.toString(currentMark.markWeight) + ")");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnUpdateMark, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(lblMark, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrevType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(fldWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fldMark)
                                    .addComponent(fldDesc)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMark, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldMark, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblPrevType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldWeight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnUpdateMark, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

    private void btnUpdateMarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMarkActionPerformed
        
        currentTeacher.removeStudent(currentStudent);
        currentStudent.removeSubject(currentSubject);
        currentSubject.removeMark(currentMark);
        
        String d = fldDesc.getText();
        Double m = Double.parseDouble(fldMark.getText());
        String weight = "";
        
        if (lstWeights.getSelectedIndex() > -1)
        {
            weight = lstWeights.getSelectedValue().toString().split(" ")[1];
            weight = weight.substring(1, weight.length() - 1);
        }
        else
        {
            weight = "1.0";
            if (!fldWeight.toString().isEmpty())
            {
                weight = fldWeight.getText();
            }
        }
        
        System.out.println("WEIGHT: " + weight);

        currentMark.setMark(m);
        currentMark.setMarkWeight(Double.parseDouble(weight));
        currentMark.setMarkType(d);

        try
        {
            currentSubject.addMark(currentMark);
            currentStudent.addSubject(currentSubject);
            currentTeacher.addStudent(currentStudent);
            
            EditStudent es = new EditStudent(currentTeacher, currentStudent);
            es.setVisible(true);
            
            this.setVisible(false);
            this.setEnabled(false);
        }
        catch (IOException ex)
        {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnUpdateMarkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateMark;
    private javax.swing.JTextField fldDesc;
    private javax.swing.JTextField fldMark;
    private javax.swing.JTextField fldWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblMark;
    private javax.swing.JLabel lblPrevType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JList lstWeights;
    // End of variables declaration//GEN-END:variables
}