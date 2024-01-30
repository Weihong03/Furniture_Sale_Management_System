/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import furniture_sale_ordering_management_system.Shared_item.glasspanepopup.DefaultLayoutCallBack;
import furniture_sale_ordering_management_system.Shared_item.glasspanepopup.GlassPanePopup;
import java.awt.Component;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
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

        jLabel11.setText(userID);

        // Set the title of the window
        setTitle("Officer Home");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Officer_Home() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_dashboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_managePersonalProfile = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_salesApproval = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_checkSaleStatus = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_generateInvoice = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel_generateReport = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        button_notification = new furniture_sale_ordering_management_system.Shared_item.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 750));
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

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/logout.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("O001");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 763, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");

        javax.swing.GroupLayout jPanel_dashboardLayout = new javax.swing.GroupLayout(jPanel_dashboard);
        jPanel_dashboard.setLayout(jPanel_dashboardLayout);
        jPanel_dashboardLayout.setHorizontalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel_dashboardLayout.setVerticalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
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

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Personal Profile");

        javax.swing.GroupLayout jPanel_managePersonalProfileLayout = new javax.swing.GroupLayout(jPanel_managePersonalProfile);
        jPanel_managePersonalProfile.setLayout(jPanel_managePersonalProfileLayout);
        jPanel_managePersonalProfileLayout.setHorizontalGroup(
            jPanel_managePersonalProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_managePersonalProfileLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_managePersonalProfileLayout.setVerticalGroup(
            jPanel_managePersonalProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_managePersonalProfileLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_managePersonalProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 100));

        jPanel_salesApproval.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_salesApproval.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_salesApproval.setOpaque(false);
        jPanel_salesApproval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_salesApprovalMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sales Approval");

        javax.swing.GroupLayout jPanel_salesApprovalLayout = new javax.swing.GroupLayout(jPanel_salesApproval);
        jPanel_salesApproval.setLayout(jPanel_salesApprovalLayout);
        jPanel_salesApprovalLayout.setHorizontalGroup(
            jPanel_salesApprovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_salesApprovalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel_salesApprovalLayout.setVerticalGroup(
            jPanel_salesApprovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_salesApprovalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_salesApproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 100));

        jPanel_checkSaleStatus.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_checkSaleStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_checkSaleStatus.setOpaque(false);
        jPanel_checkSaleStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_checkSaleStatusMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Check Sale Status");

        javax.swing.GroupLayout jPanel_checkSaleStatusLayout = new javax.swing.GroupLayout(jPanel_checkSaleStatus);
        jPanel_checkSaleStatus.setLayout(jPanel_checkSaleStatusLayout);
        jPanel_checkSaleStatusLayout.setHorizontalGroup(
            jPanel_checkSaleStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_checkSaleStatusLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel_checkSaleStatusLayout.setVerticalGroup(
            jPanel_checkSaleStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_checkSaleStatusLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_checkSaleStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 100));

        jPanel_generateInvoice.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_generateInvoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_generateInvoice.setOpaque(false);
        jPanel_generateInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_generateInvoiceMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Generate Invoice");

        javax.swing.GroupLayout jPanel_generateInvoiceLayout = new javax.swing.GroupLayout(jPanel_generateInvoice);
        jPanel_generateInvoice.setLayout(jPanel_generateInvoiceLayout);
        jPanel_generateInvoiceLayout.setHorizontalGroup(
            jPanel_generateInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_generateInvoiceLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel_generateInvoiceLayout.setVerticalGroup(
            jPanel_generateInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_generateInvoiceLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_generateInvoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 100));

        jPanel_generateReport.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_generateReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_generateReport.setOpaque(false);
        jPanel_generateReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_generateReportMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Generate Report");

        javax.swing.GroupLayout jPanel_generateReportLayout = new javax.swing.GroupLayout(jPanel_generateReport);
        jPanel_generateReport.setLayout(jPanel_generateReportLayout);
        jPanel_generateReportLayout.setHorizontalGroup(
            jPanel_generateReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_generateReportLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_generateReportLayout.setVerticalGroup(
            jPanel_generateReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_generateReportLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_generateReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 680));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1050, 650));

        button_notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/icon.png"))); // NOI18N
        button_notification.setOpaque(true);
        button_notification.setPreferredSize(new java.awt.Dimension(35, 35));
        button_notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_notificationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(994, Short.MAX_VALUE)
                .addComponent(button_notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(button_notification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(630, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 1050, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirm Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Open Login JFrame
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_dashboardMouseClicked
        jPanel_dashboard.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_salesApproval.setOpaque(false);
        jPanel_checkSaleStatus.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_generateInvoice.setOpaque(false);
        jPanel_generateReport.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_salesApproval.repaint();
        jPanel_checkSaleStatus.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_generateInvoice.repaint();
        jPanel_generateReport.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jPanel_dashboardMouseClicked

    private void jPanel_managePersonalProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_managePersonalProfileMouseClicked
        jPanel_managePersonalProfile.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_salesApproval.setOpaque(false);
        jPanel_checkSaleStatus.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_generateInvoice.setOpaque(false);
        jPanel_generateReport.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_salesApproval.repaint();
        jPanel_checkSaleStatus.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_generateInvoice.repaint();
        jPanel_generateReport.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        Sales_Officer_Profile salesPerson = new Sales_Officer_Profile(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(salesPerson.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        salesPerson.setInitialValues(userID);
        salesPerson.setInitialValuesFromUserID(userID);
    }//GEN-LAST:event_jPanel_managePersonalProfileMouseClicked

    private void jPanel_salesApprovalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_salesApprovalMouseClicked
        jPanel_salesApproval.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_dashboard.setOpaque(false);
        jPanel_checkSaleStatus.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_generateInvoice.setOpaque(false);
        jPanel_generateReport.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_salesApproval.repaint();
        jPanel_checkSaleStatus.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_generateInvoice.repaint();
        jPanel_generateReport.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        Sale_Approval approval = new Sale_Approval(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(approval.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        approval.displaySales();
    }//GEN-LAST:event_jPanel_salesApprovalMouseClicked

    private void jPanel_checkSaleStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_checkSaleStatusMouseClicked
        jPanel_checkSaleStatus.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_salesApproval.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_generateInvoice.setOpaque(false);
        jPanel_generateReport.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_salesApproval.repaint();
        jPanel_checkSaleStatus.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_generateInvoice.repaint();
        jPanel_generateReport.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        Check_Sales_Status check = new Check_Sales_Status(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(check.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        check.displaySales();
    }//GEN-LAST:event_jPanel_checkSaleStatusMouseClicked

    private void jPanel_generateInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_generateInvoiceMouseClicked
        jPanel_generateInvoice.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_salesApproval.setOpaque(false);
        jPanel_checkSaleStatus.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_generateReport.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_salesApproval.repaint();
        jPanel_checkSaleStatus.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_generateInvoice.repaint();
        jPanel_generateReport.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        Generate_Invoice invoice = new Generate_Invoice(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(invoice.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        invoice.displaySales();
    }//GEN-LAST:event_jPanel_generateInvoiceMouseClicked

    private void jPanel_generateReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_generateReportMouseClicked
        jPanel_generateReport.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_salesApproval.setOpaque(false);
        jPanel_checkSaleStatus.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);
        jPanel_generateInvoice.setOpaque(false);
        jPanel_dashboard.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_salesApproval.repaint();
        jPanel_checkSaleStatus.repaint();
        jPanel_managePersonalProfile.repaint();
        jPanel_generateInvoice.repaint();
        jPanel_generateReport.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_checkSaleStatus;
    private javax.swing.JPanel jPanel_dashboard;
    private javax.swing.JPanel jPanel_generateInvoice;
    private javax.swing.JPanel jPanel_generateReport;
    private javax.swing.JPanel jPanel_managePersonalProfile;
    private javax.swing.JPanel jPanel_salesApproval;
    // End of variables declaration//GEN-END:variables
}
