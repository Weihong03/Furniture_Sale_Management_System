/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import static furniture_sale_ordering_management_system.Officer_Home.userID;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Wei Hong
 */
public class Sales_Home extends javax.swing.JFrame {

    public static String userID;

    public Sales_Home(String userID) {
        this.userID = userID;
        initComponents();

        jLabel11.setText(userID);

        // Set the title of the window
        setTitle("Home");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Sales_Home() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_dashboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel_managePersonalProfile = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel_createSalesQuotation = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_manageSalesQuotation = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_viewProductListing = new javax.swing.JLabel();
        jPanel_viewListApproval = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

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

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/Companylogo_1.png"))); // NOI18N
        jLabel8.setText("FURNIHUB SOLUTION");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/logout.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("S001");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 712, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(55, 55, 55)
                .addComponent(jLabel9)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dashboard");

        javax.swing.GroupLayout jPanel_dashboardLayout = new javax.swing.GroupLayout(jPanel_dashboard);
        jPanel_dashboard.setLayout(jPanel_dashboardLayout);
        jPanel_dashboardLayout.setHorizontalGroup(
            jPanel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_dashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(107, Short.MAX_VALUE))
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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Manage Personal Profile");

        javax.swing.GroupLayout jPanel_managePersonalProfileLayout = new javax.swing.GroupLayout(jPanel_managePersonalProfile);
        jPanel_managePersonalProfile.setLayout(jPanel_managePersonalProfileLayout);
        jPanel_managePersonalProfileLayout.setHorizontalGroup(
            jPanel_managePersonalProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_managePersonalProfileLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_managePersonalProfileLayout.setVerticalGroup(
            jPanel_managePersonalProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_managePersonalProfileLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_managePersonalProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 100));

        jPanel_createSalesQuotation.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_createSalesQuotation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_createSalesQuotation.setOpaque(false);
        jPanel_createSalesQuotation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_createSalesQuotationMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Create Sales Quotation");

        javax.swing.GroupLayout jPanel_createSalesQuotationLayout = new javax.swing.GroupLayout(jPanel_createSalesQuotation);
        jPanel_createSalesQuotation.setLayout(jPanel_createSalesQuotationLayout);
        jPanel_createSalesQuotationLayout.setHorizontalGroup(
            jPanel_createSalesQuotationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_createSalesQuotationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_createSalesQuotationLayout.setVerticalGroup(
            jPanel_createSalesQuotationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_createSalesQuotationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_createSalesQuotation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, 100));

        jPanel_manageSalesQuotation.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_manageSalesQuotation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_manageSalesQuotation.setOpaque(false);
        jPanel_manageSalesQuotation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_manageSalesQuotationMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Sales Quotation");

        javax.swing.GroupLayout jPanel_manageSalesQuotationLayout = new javax.swing.GroupLayout(jPanel_manageSalesQuotation);
        jPanel_manageSalesQuotation.setLayout(jPanel_manageSalesQuotationLayout);
        jPanel_manageSalesQuotationLayout.setHorizontalGroup(
            jPanel_manageSalesQuotationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_manageSalesQuotationLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_manageSalesQuotationLayout.setVerticalGroup(
            jPanel_manageSalesQuotationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_manageSalesQuotationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_manageSalesQuotation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 100));

        jPanel5.setBackground(new java.awt.Color(203, 209, 143));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setOpaque(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel_viewProductListing.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_viewProductListing.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_viewProductListing.setText("View Product Listing");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel_viewProductListing)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel_viewProductListing)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 200, 100));

        jPanel_viewListApproval.setBackground(new java.awt.Color(203, 209, 143));
        jPanel_viewListApproval.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel_viewListApproval.setOpaque(false);
        jPanel_viewListApproval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_viewListApprovalMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("View List Approval");

        javax.swing.GroupLayout jPanel_viewListApprovalLayout = new javax.swing.GroupLayout(jPanel_viewListApproval);
        jPanel_viewListApproval.setLayout(jPanel_viewListApprovalLayout);
        jPanel_viewListApprovalLayout.setHorizontalGroup(
            jPanel_viewListApprovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_viewListApprovalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel_viewListApprovalLayout.setVerticalGroup(
            jPanel_viewListApprovalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_viewListApprovalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel_viewListApproval, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 200, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 680));

        jPanel3.setBackground(new java.awt.Color(238, 240, 218));

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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Confirm Logout", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            // Open Login JFrame
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_dashboardMouseClicked
        // Set opaque to true for jPanel6
        jPanel_dashboard.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageSalesQuotation.setOpaque(false);
        jPanel5.setOpaque(false);
        jPanel_createSalesQuotation.setOpaque(false);
        jPanel_viewListApproval.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageSalesQuotation.repaint();
        jPanel5.repaint();
        jPanel_createSalesQuotation.repaint();
        jPanel_viewListApproval.repaint();
        jPanel_managePersonalProfile.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jPanel_dashboardMouseClicked

    private void jPanel_createSalesQuotationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_createSalesQuotationMouseClicked
        // Set opaque to true for jPanel6
        jPanel_createSalesQuotation.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageSalesQuotation.setOpaque(false);
        jPanel5.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_viewListApproval.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageSalesQuotation.repaint();
        jPanel5.repaint();
        jPanel_createSalesQuotation.repaint();
        jPanel_viewListApproval.repaint();
        jPanel_managePersonalProfile.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        Choose_Product chooseproduct = new Choose_Product(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(chooseproduct.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
    }//GEN-LAST:event_jPanel_createSalesQuotationMouseClicked

    private void jPanel_manageSalesQuotationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_manageSalesQuotationMouseClicked
        // Set opaque to true for jPanel6
        jPanel_manageSalesQuotation.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_dashboard.setOpaque(false);
        jPanel5.setOpaque(false);
        jPanel_createSalesQuotation.setOpaque(false);
        jPanel_viewListApproval.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageSalesQuotation.repaint();
        jPanel5.repaint();
        jPanel_createSalesQuotation.repaint();
        jPanel_viewListApproval.repaint();
        jPanel_managePersonalProfile.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        Manage_Sales_Order_Quotation manage_sales_order_quotation = new Manage_Sales_Order_Quotation(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(manage_sales_order_quotation.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        manage_sales_order_quotation.displaySales();
    }//GEN-LAST:event_jPanel_manageSalesQuotationMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // Set opaque to true for jPanel6
        jPanel5.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageSalesQuotation.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_createSalesQuotation.setOpaque(false);
        jPanel_viewListApproval.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageSalesQuotation.repaint();
        jPanel5.repaint();
        jPanel_createSalesQuotation.repaint();
        jPanel_viewListApproval.repaint();
        jPanel_managePersonalProfile.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        ViewProduct viewproduct = new ViewProduct(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(viewproduct.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        viewproduct.displayProduct();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel_viewListApprovalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_viewListApprovalMouseClicked
        // Set opaque to true for jPanel6
        jPanel_viewListApproval.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageSalesQuotation.setOpaque(false);
        jPanel5.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_createSalesQuotation.setOpaque(false);
        jPanel_managePersonalProfile.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageSalesQuotation.repaint();
        jPanel5.repaint();
        jPanel_createSalesQuotation.repaint();
        jPanel_viewListApproval.repaint();
        jPanel_managePersonalProfile.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        List_Approval listApproval = new List_Approval(userID);
        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(listApproval.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        listApproval.setInitialValues(userID);
    }//GEN-LAST:event_jPanel_viewListApprovalMouseClicked

    private void jPanel_managePersonalProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_managePersonalProfileMouseClicked
        // Set opaque to true for jPanel6
        jPanel_managePersonalProfile.setOpaque(true);

        // Set opaque to false for other JPanels
        jPanel_manageSalesQuotation.setOpaque(false);
        jPanel5.setOpaque(false);
        jPanel_dashboard.setOpaque(false);
        jPanel_createSalesQuotation.setOpaque(false);
        jPanel_viewListApproval.setOpaque(false);

        // Repaint the JPanels to reflect the changes
        jPanel_dashboard.repaint();
        jPanel_manageSalesQuotation.repaint();
        jPanel5.repaint();
        jPanel_createSalesQuotation.repaint();
        jPanel_viewListApproval.repaint();
        jPanel_managePersonalProfile.repaint();

        // Clear existing components from jPanel3
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();

        Sales_Officer_Profile sales_officer_Profile = new Sales_Officer_Profile(userID);


        JInternalFrame internalFrame = new JInternalFrame();
        internalFrame.setContentPane(sales_officer_Profile.getContentPane());
        internalFrame.setSize(1050, 680);
        internalFrame.setResizable(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) internalFrame.getUI()).setNorthPane(null);
        internalFrame.setBorder(BorderFactory.createEmptyBorder());

        // Add the new internalFrame to jPanel3
        jPanel3.add(internalFrame);
        internalFrame.setVisible(true);
        sales_officer_Profile.setInitialValues(userID);
        sales_officer_Profile.setInitialValuesFromUserID(userID);
    }//GEN-LAST:event_jPanel_managePersonalProfileMouseClicked

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
            java.util.logging.Logger.getLogger(Sales_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sales_Home salesHome = new Sales_Home(userID);
                salesHome.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_viewProductListing;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_createSalesQuotation;
    private javax.swing.JPanel jPanel_dashboard;
    private javax.swing.JPanel jPanel_managePersonalProfile;
    private javax.swing.JPanel jPanel_manageSalesQuotation;
    private javax.swing.JPanel jPanel_viewListApproval;
    // End of variables declaration//GEN-END:variables
}
