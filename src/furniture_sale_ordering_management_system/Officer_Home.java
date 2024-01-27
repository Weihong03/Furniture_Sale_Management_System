/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import static furniture_sale_ordering_management_system.Sales_Home.userID;
import furniture_sale_ordering_management_system.Shared_item.glasspanepopup.DefaultLayoutCallBack;
import furniture_sale_ordering_management_system.Shared_item.glasspanepopup.GlassPanePopup;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.miginfocom.layout.ComponentWrapper;
import net.miginfocom.layout.LayoutCallback;

/**
 *
 * @author Wei Hong
 */
public class Officer_Home extends javax.swing.JFrame {

     public static String userID;

    public Officer_Home(String userID) {
        this.userID = userID;

        initComponents();
        GlassPanePopup.install(this);

        jTextField_ID.setText(userID);
        jTextField_ID.setEditable(false);

        // Set the title of the window
        setTitle("Officer Home");

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

    private Officer_Home() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton_ManageProfile = new javax.swing.JButton();
        jButton_logout = new javax.swing.JButton();
        jTextField_ID = new javax.swing.JTextField();
        jButton_saleapproval = new javax.swing.JButton();
        jButton_invoice = new javax.swing.JButton();
        button_notification = new furniture_sale_ordering_management_system.Shared_item.Button();
        jButton_CheckSaleStatus = new javax.swing.JButton();
        jButton_GenerateReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Officer Home");

        jButton_ManageProfile.setText("Manage Profile");
        jButton_ManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManageProfileActionPerformed(evt);
            }
        });

        jButton_logout.setText("Log Out");
        jButton_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logoutActionPerformed(evt);
            }
        });

        jButton_saleapproval.setText("Sale Approval");
        jButton_saleapproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saleapprovalActionPerformed(evt);
            }
        });

        jButton_invoice.setText("Generate Invoice");
        jButton_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_invoiceActionPerformed(evt);
            }
        });

        button_notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/icon.png"))); // NOI18N
        button_notification.setOpaque(true);
        button_notification.setPreferredSize(new java.awt.Dimension(35, 35));
        button_notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_notificationActionPerformed(evt);
            }
        });

        jButton_CheckSaleStatus.setText("Check Sale Status ");
        jButton_CheckSaleStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CheckSaleStatusActionPerformed(evt);
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
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_saleapproval)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jButton_logout)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_ManageProfile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_GenerateReport))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_invoice)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_CheckSaleStatus)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_invoice)
                    .addComponent(jButton_CheckSaleStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ManageProfile)
                    .addComponent(jButton_GenerateReport))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_saleapproval)
                    .addComponent(jButton_logout))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageProfileActionPerformed
        Sales_Officer_Profile salesPerson = new Sales_Officer_Profile(userID);
        salesPerson.setInitialValues(userID);
        salesPerson.setInitialValuesFromUserID(userID);
        salesPerson.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_ManageProfileActionPerformed

    private void jButton_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirm Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Open Login JFrame
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton_logoutActionPerformed

    private void jButton_saleapprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saleapprovalActionPerformed
        Sale_Approval approval = new Sale_Approval(userID);
        approval.setVisible(true);
        approval.displaySales();
        this.dispose();
    }//GEN-LAST:event_jButton_saleapprovalActionPerformed

    private void jButton_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_invoiceActionPerformed
        Generate_Invoice invoice = new Generate_Invoice(userID);
        invoice.setVisible(true);
        invoice.displaySales();
        this.dispose();
    }//GEN-LAST:event_jButton_invoiceActionPerformed

    private void button_notificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_notificationActionPerformed
        GlassPanePopup.showPopup(new Notification() {

            public float opacity() {
                return 0;
            }

            public LayoutCallback getLayoutCallBack(Component parent) {
                return new DefaultLayoutCallBack(parent) {
                    @Override
                    public void correctBounds(ComponentWrapper cw) {
                        if (parent.isVisible()) {
                            Point pl = parent.getLocationOnScreen();
                            Point bl = button_notification.getLocationOnScreen();
                            int x = bl.x - pl.x;
                            int y = bl.y - pl.y;

                            cw.setBounds(x - cw.getWidth() + button_notification.getWidth(), y + button_notification.getHeight(), cw.getWidth(), cw.getHeight());
                        } else {
                            super.correctBounds(cw);
                        }
                    }
                };
            }

            public String getLayout(Component parent, float animate) {
                return null;
            }
        });
    }//GEN-LAST:event_button_notificationActionPerformed

    private void jButton_CheckSaleStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CheckSaleStatusActionPerformed
        Check_Sales_Status check = new Check_Sales_Status(userID);
        check.setVisible(true);
        check.displaySales();
        this.dispose();
    }//GEN-LAST:event_jButton_CheckSaleStatusActionPerformed

    private void jButton_GenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerateReportActionPerformed
        Generate_Report generate = new Generate_Report(userID);
        generate.setVisible(true);
        generate.displaySales();
        this.dispose();
    }//GEN-LAST:event_jButton_GenerateReportActionPerformed


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
            java.util.logging.Logger.getLogger(Officer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Officer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Officer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Officer_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Officer_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.Shared_item.Button button_notification;
    private javax.swing.JButton jButton_CheckSaleStatus;
    private javax.swing.JButton jButton_GenerateReport;
    private javax.swing.JButton jButton_ManageProfile;
    private javax.swing.JButton jButton_invoice;
    private javax.swing.JButton jButton_logout;
    private javax.swing.JButton jButton_saleapproval;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField_ID;
    // End of variables declaration//GEN-END:variables
}
