/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package furniture_sale_ordering_management_system;

/**
 *
 * @author Wei Hong
 */
public class Notification_Item extends javax.swing.JPanel {

    public Notification_Item(String name, String description, String date, String amount) {
        initComponents();
        setData(name, date, amount);
    }

    private void setData(String name, String date, String amount) {
        jLabel_name.setText(name);
        jLabel_date.setText(date);
        jLabel_amount.setText(amount);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_name = new javax.swing.JLabel();
        jLabel_date = new javax.swing.JLabel();
        jLabel_description = new javax.swing.JLabel();
        jLabel_amount = new javax.swing.JLabel();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_name)
                    .addComponent(jLabel_date))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_description)
                    .addComponent(jLabel_amount))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_name)
                    .addComponent(jLabel_description))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_date)
                    .addComponent(jLabel_amount))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_amount;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_description;
    private javax.swing.JLabel jLabel_name;
    // End of variables declaration//GEN-END:variables
}
