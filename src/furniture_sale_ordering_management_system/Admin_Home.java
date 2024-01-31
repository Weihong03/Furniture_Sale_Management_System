/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
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

        jLabel9.setText(userID);

        // Set the title of the window
        setTitle("Admin Home");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Admin_Home() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_managePersonalProfile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_manageWorkerProfile = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_generateReport = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_logbook = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1250, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1250, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 180, 72));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/profile.png"))); // NOI18N
        jLabel2.setText("Hello, ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/Companylogo_1.png"))); // NOI18N
        jLabel10.setText("FURNIHUB SOLUTION");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/logout.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("A001");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 732, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 73));

        jPanel2.setBackground(new java.awt.Color(58, 107, 53));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dashboard.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_dashboardMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_dashboardLayout = new javax.swing.GroupLayout(jPanel_dashboard);
        jPanel_dashboard.setLayout(jPanel_dashboardLayout);
        jPanel_dashboardLayout.setHorizontalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel_dashboardLayout.setVerticalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jPanel_managePersonalProfile.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_managePersonalProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_managePersonalProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_managePersonalProfileMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Personal Profile");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel_managePersonalProfileLayout = new javax.swing.GroupLayout(jPanel_managePersonalProfile);
        jPanel_managePersonalProfile.setLayout(jPanel_managePersonalProfileLayout);
        jPanel_managePersonalProfileLayout.setHorizontalGroup(
            jPanel_managePersonalProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_managePersonalProfileLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel_managePersonalProfileLayout.setVerticalGroup(
            jPanel_managePersonalProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_managePersonalProfileLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_managePersonalProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 100));

        jPanel_manageWorkerProfile.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_manageWorkerProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_manageWorkerProfile.setOpaque(false);
        jPanel_manageWorkerProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_manageWorkerProfileMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Worker Profile");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel_manageWorkerProfileLayout = new javax.swing.GroupLayout(jPanel_manageWorkerProfile);
        jPanel_manageWorkerProfile.setLayout(jPanel_manageWorkerProfileLayout);
        jPanel_manageWorkerProfileLayout.setHorizontalGroup(
            jPanel_manageWorkerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_manageWorkerProfileLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel_manageWorkerProfileLayout.setVerticalGroup(
            jPanel_manageWorkerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_manageWorkerProfileLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_manageWorkerProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 100));

        jPanel_generateReport.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_generateReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_generateReport.setOpaque(false);
        jPanel_generateReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_generateReportMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Generate Report");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel_generateReportLayout = new javax.swing.GroupLayout(jPanel_generateReport);
        jPanel_generateReport.setLayout(jPanel_generateReportLayout);
        jPanel_generateReportLayout.setHorizontalGroup(
            jPanel_generateReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_generateReportLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel_generateReportLayout.setVerticalGroup(
            jPanel_generateReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_generateReportLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_generateReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 100));

        jPanel_logbook.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_logbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_logbook.setOpaque(false);
        jPanel_logbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_logbookMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logbook");

        javax.swing.GroupLayout jPanel_logbookLayout = new javax.swing.GroupLayout(jPanel_logbook);
        jPanel_logbook.setLayout(jPanel_logbookLayout);
        jPanel_logbookLayout.setHorizontalGroup(
            jPanel_logbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logbookLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel_logbookLayout.setVerticalGroup(
            jPanel_logbookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_logbookLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_logbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 1050, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_dashboardMouseClicked
        // Set opaque to true for jPanel6
        jPanel_dashboard.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageWorkerProfile.setOpaque(false);
        jPanel_generateReport.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_logbook.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageWorkerProfile.repaint();
        jPanel_generateReport.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_logbook.repaint();
        
        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jPanel_dashboardMouseClicked

    private void jPanel_managePersonalProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_managePersonalProfileMouseClicked
        // Set opaque to true for jPanel6
        jPanel_managePersonalProfile.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageWorkerProfile.setOpaque(false);
        jPanel_generateReport.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_logbook.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageWorkerProfile.repaint();
        jPanel_generateReport.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_logbook.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        // Create and set up the new Generate_Report internalFrame
        Admin_Profile administratorprofile = new Admin_Profile(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(administratorprofile.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        administratorprofile.setInitialValues(userID);
        administratorprofile.setInitialValuesFromUserID(userID);
    }//GEN-LAST:event_jPanel_managePersonalProfileMouseClicked

    private void jPanel_manageWorkerProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_manageWorkerProfileMouseClicked
        // Set opaque to true for jPanel6
        jPanel_manageWorkerProfile.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_generateReport.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_logbook.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageWorkerProfile.repaint();
        jPanel_generateReport.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_logbook.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        // Create and set up the new Generate_Report internalFrame
        ManageWorkerProfile manageworkerprofile = new ManageWorkerProfile(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(manageworkerprofile.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        manageworkerprofile.displayBookings();
    }//GEN-LAST:event_jPanel_manageWorkerProfileMouseClicked

    private void jPanel_generateReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_generateReportMouseClicked
        // Set opaque to true for jPanel6
        jPanel_generateReport.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageWorkerProfile.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_logbook.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageWorkerProfile.repaint();
        jPanel_generateReport.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_logbook.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        // Create and set up the new Generate_Report internalFrame
        Generate_Report generate = new Generate_Report(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(generate.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        generate.displaySales();
    }//GEN-LAST:event_jPanel_generateReportMouseClicked

    private void jPanel_logbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_logbookMouseClicked
        // Set opaque to true for jPanel6
        jPanel_logbook.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageWorkerProfile.setOpaque(false);
        jPanel_generateReport.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageWorkerProfile.repaint();
        jPanel_generateReport.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_logbook.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        // Create and set up the new Generate_Report internalFrame
        Admin_Logbook adminLogbook = new Admin_Logbook(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(adminLogbook.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        adminLogbook.loadLogEntriesFromFile();
    }//GEN-LAST:event_jPanel_logbookMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        String event = "Logout";
        if (choice == JOptionPane.YES_OPTION) {
            // Open Login JFrame
            Admin_Logbook adminLogbook = new Admin_Logbook(userID);
            adminLogbook.addLogEntry(userID, event);
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_dashboard;
    private javax.swing.JPanel jPanel_generateReport;
    private javax.swing.JPanel jPanel_logbook;
    private javax.swing.JPanel jPanel_managePersonalProfile;
    private javax.swing.JPanel jPanel_manageWorkerProfile;
    // End of variables declaration//GEN-END:variables
}
