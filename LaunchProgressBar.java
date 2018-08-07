
package studentinfomationsystem;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JProgressBar;
import javax.swing.plaf.PanelUI;


public class LaunchProgressBar extends javax.swing.JDialog {

    /** Creates new form LaunchProgressBar */
    public LaunchProgressBar() {
        setUndecorated(true);
        initComponents();
        this.setAlwaysOnTop(true);
        SplashPanel.setUI(new BgSplash());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dim.width-getWidth())/2;
        int y = (dim.height-getHeight())/2;
        setLocation(x, y);
        ProgressBar.setStringPainted(true);
    }
    
    public JProgressBar getProgressBar() {
        return ProgressBar;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplashPanel = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        SplashPanel.setBackground(new java.awt.Color(255, 255, 255));
        SplashPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        ProgressBar.setForeground(new java.awt.Color(153, 0, 0));
        ProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Loading . . .");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/dice.jpg"))); // NOI18N

        javax.swing.GroupLayout SplashPanelLayout = new javax.swing.GroupLayout(SplashPanel);
        SplashPanel.setLayout(SplashPanelLayout);
        SplashPanelLayout.setHorizontalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SplashPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SplashPanelLayout.setVerticalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(SplashPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JPanel SplashPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
class BgSplash extends PanelUI {
    ImageIcon background = new ImageIcon(getClass().getResource("/Gambar/dice.jpg"));
    @Override
    public void paint(Graphics g, JComponent c) {
         g.drawImage(background.getImage(), 0, 0, null);
    }
}