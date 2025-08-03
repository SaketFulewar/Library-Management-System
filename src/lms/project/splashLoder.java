package lms.project;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author OM
 */
public class splashLoder extends javax.swing.JFrame {

    /**
     * Creates new form splashLoder
     */
    public splashLoder() {
        super("Loading");
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        loadingText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingBar.setBackground(new java.awt.Color(255, 255, 255));
        LoadingBar.setForeground(new java.awt.Color(0, 98, 56));
        LoadingBar.setBorder(null);
        LoadingBar.setOpaque(true);
        LoadingBar.setPreferredSize(new java.awt.Dimension(146, 3));
        LoadingBar.setStringPainted(true);
        jPanel1.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 700, 20));

        loadingText.setForeground(new java.awt.Color(153, 153, 153));
        loadingText.setText("Loading...");
        jPanel1.add(loadingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/project/images/bg-main.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(854, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            // handle exception
        }

        //</editor-fold>
        splashLoder sl = new splashLoder();
        sl.setVisible(true);
        /* Create and display the form */
        try {
            for (int i = 1; i <= 100; i++) {
                Thread.sleep(60);

                if (i == 10) {
                    sl.loadingText.setText("Connecting To Data Base...");
                }

                if (i == 30) {
                    sl.loadingText.setText("Fetching Details...");
                }

                if (i == 50) {
                    sl.loadingText.setText("Finding Users...");
                }

                if (i == 70) {
                    sl.loadingText.setText("Reaching Data...");
                }

                if (i == 90) {
                    sl.loadingText.setText("Module Loading...");
                }

                if (i == 100) {
                    sl.loadingText.setText("Done...");
                    sl.setVisible(false);
                    
                    signIn ob=new signIn();
                    ob.setVisible(true);
                }

                sl.LoadingBar.setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loadingText;
    // End of variables declaration//GEN-END:variables
}
