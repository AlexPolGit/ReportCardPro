package reportcardpro;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

public class PrintableReport extends javax.swing.JFrame
{
    private final Student toCopy;
    public DecimalFormat df = new DecimalFormat("#.##");
    
    public PrintableReport(Student s)
    {
        this.toCopy = s;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentInfo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1100, 850));
        setPreferredSize(new java.awt.Dimension(1100, 850));

        tblStudentInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tblStudentInfo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tblStudentInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Student", "Age", "Gender", "Mean Average", "Median Average"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudentInfo.setRowHeight (50);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblStudentInfo.setDefaultRenderer(String.class, centerRenderer);
        tblStudentInfo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblStudentInfo);
        tblStudentInfo.getColumnModel().getColumn(0).setResizable(false);
        tblStudentInfo.getColumnModel().getColumn(0).setHeaderValue("Student");
        tblStudentInfo.getColumnModel().getColumn(1).setResizable(false);
        tblStudentInfo.getColumnModel().getColumn(1).setHeaderValue("Age");
        tblStudentInfo.getColumnModel().getColumn(2).setHeaderValue("Gender");
        tblStudentInfo.getColumnModel().getColumn(3).setHeaderValue("Mean Average");
        tblStudentInfo.getColumnModel().getColumn(4).setHeaderValue("Median Average");
        tblStudentInfo.setValueAt (toCopy.name, 0, 0);
        tblStudentInfo.setValueAt (Integer.toString(toCopy.getAge()), 0, 1);
        tblStudentInfo.setValueAt (toCopy.gender, 0, 2);
        tblStudentInfo.setValueAt (df.format(toCopy.getOverallMeanAverage()), 0, 3);
        tblStudentInfo.setValueAt (df.format(toCopy.getOverallMedianAverage()), 0, 4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(764, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudentInfo;
    // End of variables declaration//GEN-END:variables
}
