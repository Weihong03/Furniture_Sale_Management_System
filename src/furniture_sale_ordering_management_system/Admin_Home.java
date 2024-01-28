/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Wei Hong
 */
public class Admin_Home extends javax.swing.JFrame {

    private String userID;

    public Admin_Home(String userID) {
        this.userID = userID;
        
        initComponents();
        
        jTextField_ID.setText(userID);
        jTextField_ID.setEditable(false);
        
        // Set the title of the window
        setTitle("Login");

        // Get the dimension of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the center coordinates
        int centerX = (screenSize.width - getWidth()) / 2;
        int centerY = (screenSize.height - getHeight()) / 2;

        // Set the location of the window
        setLocation(centerX, centerY);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Admin_Home() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_ManageProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_logout = new javax.swing.JButton();
        jButton_ManagePsnProfile = new javax.swing.JButton();
        jTextField_ID = new javax.swing.JTextField();
        jButton_logbook = new javax.swing.JButton();
        jButton_GenerateReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));

        jButton_ManageProfile.setText("Manage Profile");
        jButton_ManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageProfileActionPerformed(evt);
            }
        });

        jLabel1.setText("Admin Home");

        jButton_logout.setText("Log Out");
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });

        jButton_ManagePsnProfile.setText("Manage Personal Profile");
        jButton_ManagePsnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManagePsnProfileActionPerformed(evt);
            }
        });

        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jButton_logbook.setText("Logbook");
        jButton_logbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logbookActionPerformed(evt);
            }
        });

        jButton_GenerateReport.setText("Generate Report");
        jButton_GenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerateReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_GenerateReport)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_ManagePsnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_ManageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_logout)
                                    .addComponent(jButton_logbook))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton_GenerateReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ManagePsnProfile)
                    .addComponent(jButton_logbook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ManageProfile)
                    .addComponent(jButton_logout))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        String userID = jTextField_ID.getText();
        String event = "Logout";
        if (choice == JOptionPane.YES_OPTION) {
            // Open Login JFrame
             Admin_Logbook adminLogbook = new Admin_Logbook(userID);
             adminLogbook.addLogEntry(userID,event);
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton_logoutActionPerformed

    private void jButton_ManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageProfileActionPerformed
        ManageWorkerProfile manageworkerprofile = new ManageWorkerProfile(userID);
        manageworkerprofile.setVisible(true);
        manageworkerprofile.displayBookings();
        this.dispose();
    }//GEN-LAST:event_jButton_ManageProfileActionPerformed

    private void jButton_ManagePsnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManagePsnProfileActionPerformed
        Admin_Profile administratorprofile = new Admin_Profile(userID);
        administratorprofile.setInitialValues(userID);
        administratorprofile.setInitialValuesFromUserID(userID);
        administratorprofile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ManagePsnProfileActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton_logbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logbookActionPerformed
              Admin_Logbook adminLogbook = new Admin_Logbook(userID);
              adminLogbook.loadLogEntriesFromFile();
              adminLogbook.setVisible(true);
              this.dispose();
    }//GEN-LAST:event_jButton_logbookActionPerformed

    private void jButton_GenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerateReportActionPerformed
        Generate_Report generate = new Generate_Report(userID);
        generate.setVisible(true);
        generate.displaySales();
        this.dispose();
    }//GEN-LAST:event_jButton_GenerateReportActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Home().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GenerateReport;
    private javax.swing.JButton jButton_ManageProfile;
    private javax.swing.JButton jButton_ManagePsnProfile;
    private javax.swing.JButton jButton_logbook;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}
