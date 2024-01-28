/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package furniture_sale_ordering_management_system;

import javax.swing.Icon;

/**
 *
 * @author Wei Hong
 */
public class Notification_Item extends javax.swing.JPanel {

    public Notification_Item(Icon icon, String name, String description, String date, String amount) {
        initComponents();
        imageAvatar1.setIcon(icon);
        jLabel_name.setText(name);
        jLabel_date.setText(date);
        jLabel_description.setText(description);
        jLabel_amount.setText(amount);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_name = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel_description = new javax.swing.JLabel();
        jLabel_amount = new javax.swing.JLabel();
        imageAvatar1 = new furniture_sale_ordering_management_system.Shared_item.ImageAvatar();

        setOpaque(false);

        jLabel_name.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(106, 106, 106));
        jLabel_name.setText("Name");

        jLabel_date.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel_date.setForeground(new java.awt.Color(134, 134, 134));
        jLabel_date.setText("Date");

        jLabel_description.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel_description.setForeground(new java.awt.Color(134, 134, 134));
        jLabel_description.setText("made a Sales Quotation!");

        jLabel_amount.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel_amount.setForeground(new java.awt.Color(134, 134, 134));
        jLabel_amount.setText("Amount");

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/O006_profile_image.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_name)
                    .addComponent(jLabel_date))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_amount)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_description)
                        .addGap(0, 33, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_name)
                            .addComponent(jLabel_description))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_amount)
                            .addComponent(jLabel_date)))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.Shared_item.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel_amount;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_description;
    private javax.swing.JLabel jLabel_name;
    // End of variables declaration//GEN-END:variables
}
