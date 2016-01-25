package reportcardpro;
/**
 * The class debugs any errors within the Report Card Pro console.
 */
public class DebugConsole extends javax.swing.JFrame
{
    public String consoleText = "Report Card Pro Console:\n";
    
    public void println(String in)
    {
        consoleText += in + "\n";
        lblConsole.setText(consoleText);
    }
    
    public DebugConsole()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBlack = new javax.swing.JPanel();
        lblConsole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 400));

        bgBlack.setBackground(new java.awt.Color(0, 0, 0));

        lblConsole.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblConsole.setForeground(new java.awt.Color(0, 255, 51));
        lblConsole.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConsole.setText("Report Card Pro Console:");
        lblConsole.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout bgBlackLayout = new javax.swing.GroupLayout(bgBlack);
        bgBlack.setLayout(bgBlackLayout);
        bgBlackLayout.setHorizontalGroup(
            bgBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBlackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsole, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgBlackLayout.setVerticalGroup(
            bgBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBlackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsole, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgBlack;
    private javax.swing.JLabel lblConsole;
    // End of variables declaration//GEN-END:variables
}
