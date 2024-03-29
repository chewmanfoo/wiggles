/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.mainuijframe;

import java.awt.AWTException; 
import java.awt.Robot; 
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.MouseInfo;
import java.awt.event.KeyEvent; 
/**
 *
 * @author Jason
 */
public class MainUIJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainUIJFrame
     */
    public MainUIJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        state_label = new javax.swing.JLabel();
        toggle_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sleep_secondsField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 204));
        jLabel1.setText("Wiggler");

        state_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        state_label.setText("----------");

        toggle_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        toggle_button.setText("click");
        toggle_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggle_buttonActionPerformed(evt);
            }
        });

        jLabel2.setText("wait:");

        sleep_secondsField.setText((sleep_seconds).toString());
        sleep_secondsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleep_secondsFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("s");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toggle_button, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(state_label, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sleep_secondsField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(sleep_secondsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(state_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toggle_button, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toggle_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggle_buttonActionPerformed
        String current = state_label.getText();
        
        switch (current) {
            case "----------":
                state_label.setText("resting");
                break;
            case "resting":
                state_label.setText("wiggling!");
                do_wiggle = true;
                break;
            case "wiggling":
                state_label.setText("resting");
                do_wiggle = false;
                break;
        }
    }//GEN-LAST:event_toggle_buttonActionPerformed

    private void sleep_secondsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleep_secondsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sleep_secondsFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUIJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUIJFrame().setVisible(true);
                t = new Thread(new WiggleLoop());
                t.start();
            }
        });
    }

    private static class WiggleLoop
        implements Runnable {
        public void run() {
            System.out.println("getting ready...  do_wiggle is " + do_wiggle);
            try {
                while (true) {
                    if (do_wiggle == true) {
                        System.out.println("wiggling!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        
                        try {
                            Robot robot = new Robot();
                            PointerInfo a = MouseInfo.getPointerInfo();
                            Point b = a.getLocation();
                           // int x = (int) b.getX();
                           // int y = (int) b.getY();
                            int x = 1000;
                            int y = 1000;
                            robot.mouseMove(x+5, y+5);
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.delay(1000);
                            robot.keyPress(KeyEvent.VK_SHIFT);
                            robot.mouseMove(x, y);
                        } catch (AWTException e) {
                            e.printStackTrace();
                        }
                        
                    }
                    // Pause for n seconds
                    System.out.println("about to sleep...");
                    int sleep_s = Integer.parseInt(sleep_secondsField.getText());
                    Thread.sleep(sleep_seconds*1000);
                    System.out.println("running... do_wiggle is " + do_wiggle);
                    
                }
            } catch (InterruptedException e) {
                //don't wiggle
                System.out.println("not running... do_wiggle is " + do_wiggle);
                
            }
        }
    }
    
    private static final Integer sleep_seconds=1200;
    private static Thread t;
    private static boolean do_wiggle = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JTextField sleep_secondsField;
    private javax.swing.JLabel state_label;
    private javax.swing.JButton toggle_button;
    // End of variables declaration//GEN-END:variables
}
