/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author yuw18
 */
public class Modify_Sales_Order_Quotation extends javax.swing.JFrame {

    public static String userID;
    public static String orderID;
    public static String Amount;
    public static String ItemID;
    public static String Product;
    public static String Price;
    public static String Customer;
    public static String Salesperson;
    public static Date date;

    /**
     * Creates new form Modify_Sales_Order_Quotation
     *
     * @param orderID
     * @param Amount
     * @param ItemID
     * @param Product
     * @param date
     * @param Customer
     * @param Salesperson
     * @param Price
     *
     */
    public void setInitialValues(String orderID, String Amount, String Product, String ItemID, String Price, String Customer, String Salesperson, Date date) {
        jTextField_id.setText(orderID);
        jTextField_amount.setText(Amount);
        jTextField_product.setText(Product);
        jTextField_itemid.setText(ItemID);
        jTextField_price.setText(Price);
        jTextField_customer.setText(Customer);
        jTextField_salesperson.setText(Salesperson);
        jDateChooser.setDate(date); // Set the date in the date chooser
    }

    public Modify_Sales_Order_Quotation(String userID, String orderID, String Product, String Amount, String ItemID, String Price, String Customer, String Salesperson, Date date) {
        initComponents();

        jTextField_id.setEditable(false);

        this.userID = userID;
        this.orderID = orderID;
        this.Amount = Amount;
        this.Product = Product;
        this.Price = Price;
        this.ItemID = ItemID;
        this.Customer = Customer;
        this.Salesperson = Salesperson;
        this.date = date;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_amount = new javax.swing.JTextField();
        jTextField_salesperson = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jButton_modify = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_itemid = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jTextField_product = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_customer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("MODIFY SALES ORDER QUOTATION");

        jLabel2.setText("ID：");

        jLabel3.setText("Amount :");

        jLabel4.setText("Date :");

        jLabel5.setText("Sales Person :");

        jButton_modify.setText("Modify");
        jButton_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifyActionPerformed(evt);
            }
        });

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jLabel10.setText("Product :");

        jLabel11.setText("Item ID :");

        jLabel13.setText("Price :");

        jTextField_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_productActionPerformed(evt);
            }
        });

        jLabel12.setText("Customer :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_id)
                                    .addComponent(jTextField_amount)
                                    .addComponent(jTextField_salesperson)))
                            .addComponent(jButton_back))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_itemid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_product, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_modify))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_itemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_salesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_modify)
                    .addComponent(jButton_back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      private boolean modifySalesQuotation(String orderID, String Amount, String Product, String ItemID, String Price, String Customer, String Salesperson, Date date) {
        try {
            Path inputFile = Path.of("Data/Sales_Quotation.txt");

            List<String> lines = Files.readAllLines(inputFile, StandardCharsets.UTF_8);

            boolean found = false;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            String formattedDate = dateFormat.format(date); // Format the date

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.equals("ID: " + orderID)) {
                    // Modify the existing booking
                    lines.set(i, "ID: " + orderID);
                    lines.set(i + 1, "Amount: " + Amount);
                    lines.set(i + 2, "Date: " + formattedDate + ",");
                    lines.set(i + 3, "Product: " + Product);
                    lines.set(i + 4, "Item ID: " + ItemID);
                    lines.set(i + 5, "Price: " + Price);
                    lines.set(i + 6, "Customer: " + Customer);
                    lines.set(i + 7, "Salesperson: " + Salesperson);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Profile not found.");
                return false;
            }

            Files.write(inputFile, lines, StandardCharsets.UTF_8, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    private void jButton_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifyActionPerformed
        String orderID = jTextField_id.getText();
        String Amount = jTextField_amount.getText();
        Date date = jDateChooser.getDate();
        String Product = jTextField_product.getText();
        String ItemID = jTextField_itemid.getText();
        String Price = jTextField_price.getText();
        String Customer = jTextField_customer.getText();
        String Salesperson = jTextField_salesperson.getText();

        // Validate input fields
        if (orderID.isEmpty() || Amount.isEmpty() || Salesperson.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform the booking
        boolean isModified = modifySalesQuotation(orderID, Amount, Product, ItemID, Price, Customer, Salesperson, date);

        if (isModified) {
            JOptionPane.showMessageDialog(this, "Sales Order Quotation modified successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to modify the Sales Order Quotation. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_modifyActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Manage_Sales_Order_Quotation manage_sales_order_quotation = new Manage_Sales_Order_Quotation(userID);
        manage_sales_order_quotation.displaySales();
        manage_sales_order_quotation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jTextField_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_productActionPerformed

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
            java.util.logging.Logger.getLogger(Modify_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modify_Sales_Order_Quotation modifySalesOrderQuotation = new Modify_Sales_Order_Quotation(userID, orderID, Product, Amount, ItemID, Price, Customer, Salesperson, date);
                modifySalesOrderQuotation.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_modify;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextField jTextField_customer;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_itemid;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_product;
    private javax.swing.JTextField jTextField_salesperson;
    // End of variables declaration//GEN-END:variables
}
