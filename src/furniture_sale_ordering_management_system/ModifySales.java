package furniture_sale_ordering_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Wei Hong
 */
public class ModifySales extends javax.swing.JFrame {

    public static String ID;
    public static String Amount;
    public static String Date;
    public static String Product;
    public static String ItemID;
    public static String Price;
    public static String Customer;
    public static String Salesperson;
    private String userID;

    private static final String BOOKING_FILE_PATH = "Data/Sales_Quotation.txt";

    private ModifySales(String ID, String Amount, String Date, String Product, String ItemID, String Price, String Customer, String Salesperson) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ModifySales(String ID, String Amount, String Date, String Product, String ItemID, String Price, String Customer, String Salesperson, String userID) {
        this.userID = userID;
        this.ID = ID;
        this.Amount = Amount;
        this.Date = Date;
        this.Product = Product;
        this.ItemID = ItemID;
        this.Price = Price;
        this.Customer = Customer;
        this.Salesperson = Salesperson;

        initComponents();
        // Set the title of the window
        setTitle("Modify Sales Quotation");

        // Set the values in the appropriate fields
        jTextField_ID.setText(ID);
        jTextField_Amount.setText(Amount);
        jTextField_Salesperson.setText(Salesperson);
        jTextField_product.setText(Product);
        jTextField_itemid.setText(ItemID);
        jTextField_price.setText(Price);
        jTextField_customer.setText(Customer);
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        try {
            Date date = sdf.parse(Date);
            jDateChooser1.setDate(date);
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the ParseException appropriately
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Amount = new javax.swing.JTextField();
        jTextField_Salesperson = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_product = new javax.swing.JTextField();
        jTextField_itemid = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jTextField_customer = new javax.swing.JTextField();
        button_Modify = new furniture_sale_ordering_management_system.progressindicator.Button();
        button_Back = new furniture_sale_ordering_management_system.progressindicator.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setForeground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("MODIFY SALES QUOTATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Amount:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Date:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Salesperson:");

        jTextField_Amount.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AmountActionPerformed(evt);
            }
        });

        jTextField_Salesperson.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_Salesperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SalespersonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("ID:");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Price:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Product:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Customer:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Item ID:");

        jTextField_product.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField_itemid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField_price.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTextField_customer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_customerActionPerformed(evt);
            }
        });

        button_Modify.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_Modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/edit.png"))); // NOI18N
        button_Modify.setText("Modify");
        button_Modify.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ModifyActionPerformed(evt);
            }
        });

        button_Back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/back.png"))); // NOI18N
        button_Back.setText("Back");
        button_Back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(button_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_Amount, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jTextField_ID)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Salesperson)
                    .addComponent(jTextField_product)
                    .addComponent(jTextField_itemid)
                    .addComponent(jTextField_price)
                    .addComponent(jTextField_customer))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_itemid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_Salesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AmountActionPerformed

    private void jTextField_SalespersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SalespersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SalespersonActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_customerActionPerformed

    private void button_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ModifyActionPerformed
          String ID = jTextField_ID.getText();
        String Amount = jTextField_Amount.getText();
        Date selectedDate = jDateChooser1.getDate();
        String Date = "";  // Declare the variable here

        // Check if a date is selected
        if (selectedDate != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
            Date = sdf.format(selectedDate);  // Assign the formatted date to the variable
        } else {
            JOptionPane.showMessageDialog(this, "No date is selected.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String Product = jTextField_product.getText();
        String ItemID = jTextField_itemid.getText();
        String Price = jTextField_price.getText();
        String Customer = jTextField_customer.getText();
        String Salesperson = jTextField_Salesperson.getText();

        // Get the selected room
        // Validate input fields
        if (ID.isEmpty() || Amount.isEmpty() || Date.isEmpty() || Product.isEmpty() || ItemID.isEmpty() || Price.isEmpty() || Customer.isEmpty() || Salesperson.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Perform the modify
        boolean isModified = modifySales(ID, Amount, Date, Product, ItemID, Price, Customer, Salesperson);

        if (isModified) {
            JOptionPane.showMessageDialog(this, "Quotation modified successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Failed to modify the quotation. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button_ModifyActionPerformed

    private void button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BackActionPerformed
dispose();
    }//GEN-LAST:event_button_BackActionPerformed

    private boolean modifySales(String ID, String Amount, String Date, String Product, String ItemID, String Price, String Customer, String Salesperson) {
        try {
            Path inputFile = Path.of(BOOKING_FILE_PATH);

            List<String> lines = Files.readAllLines(inputFile, StandardCharsets.UTF_8);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.startsWith("ID: " + ID + ",")) {
                    lines.set(i + 1, "Amount: RM" + Amount + ",");
                    lines.set(i + 2, "Date: " + Date + ",");
                    lines.set(i + 3, "Product: " + Product + ",");
                    lines.set(i + 4, "Item ID: " + ItemID + ",");
                    lines.set(i + 5, "Price: " + Price + ",");
                    lines.set(i + 6, "Customer: " + Customer + ",");
                    lines.set(i + 7, "Salesperson: " + Salesperson + ",");
                    Files.write(inputFile, lines, StandardCharsets.UTF_8);
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

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
            java.util.logging.Logger.getLogger(ModifySales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifySales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifySales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifySales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifySales modifySales = new ModifySales(ID, Amount, Date, Product, ItemID, Price, Customer, Salesperson);
                modifySales.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_Back;
    private furniture_sale_ordering_management_system.progressindicator.Button button_Modify;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField_Amount;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Salesperson;
    private javax.swing.JTextField jTextField_customer;
    private javax.swing.JTextField jTextField_itemid;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_product;
    // End of variables declaration//GEN-END:variables

}
