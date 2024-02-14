/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author yuw18
 */
public class CreateSalesOrderQuotation extends javax.swing.JFrame {

    public static String userID;
    public static List<String> selectedProducts;
    public static List<String> selectedItemIDs;
    public static List<String> selectedPrices;
    public static String amount;

    private String formatListAsString(List<String> values) {
        StringBuilder formattedString = new StringBuilder();
        for (String value : values) {
            formattedString.append(value).append("\n");
        }
        return formattedString.toString().trim(); // Remove trailing newline
    }

    public void setInitialValues(List<String> selectedProducts, List<String> selectedItemIDs, List<String> selectedPrices, String amount) {
        String productsText = formatListAsString(selectedProducts);
        String itemIDsText = formatListAsString(selectedItemIDs);
        String pricesText = formatListAsString(selectedPrices);

        jTextArea_product.setText(productsText);
        jTextArea_itemid.setText(itemIDsText);
        jTextArea_price.setText(pricesText);
        jTextField_amount.setText(amount);
    }

    public CreateSalesOrderQuotation(String userID, List<String> selectedProducts, List<String> selectedItemIDs, List<String> selectedPrices, String amount) {
        this.userID = userID;
        this.selectedProducts = selectedProducts;
        this.selectedItemIDs = selectedItemIDs;
        this.selectedPrices = selectedPrices;
        this.amount = amount;

        initComponents();

        loadSalesPersonData();

        setTitle("Create Sales Order Quotation");

    }

    private void loadSalesPersonData() {
        String salesPersonData = getUsername(userID);

        if (salesPersonData != null) {
            // Remove commas from salesPersonData
            salesPersonData = salesPersonData.replace(",", "");

            jTextField_salesPerson.setText(salesPersonData);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to retrieve Sales Person data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static String getUsername(String userID) {
        String filePath = "Data/Officer_Salesperson.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Find the starting and ending index of the user's information
            int startIndex = content.indexOf("ID: " + userID);
            if (startIndex != -1) {
                int endIndex = content.indexOf("ID:", startIndex + 1);
                endIndex = (endIndex != -1) ? endIndex : content.length();

                // Extract the user's information
                String userData = content.substring(startIndex, endIndex);

                // Split the user's information into lines
                String[] lines = userData.split("\n");

                // Extract and return the username
                for (String lineData : lines) {
                    String[] parts = lineData.split(": ");
                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();

                        // Return the username if the key is "Username"
                        if ("Username".equals(key)) {
                            return value;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed (e.g., logging, showing an error message)
        }

        // Return null if the username is not found
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_amount = new javax.swing.JTextField();
        jTextField_salesPerson = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_itemid = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_product = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_price = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTextField_customer = new javax.swing.JTextField();
        button_Create = new furniture_sale_ordering_management_system.progressindicator.Button();
        button_Back = new furniture_sale_ordering_management_system.progressindicator.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jLabel10.setText("Category:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Total Amount :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 462, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Date :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Sales Person :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        jTextField_amount.setEditable(false);
        jTextField_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_amountActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 234, -1));

        jTextField_salesPerson.setEditable(false);
        jTextField_salesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_salesPersonActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_salesPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 234, -1));

        jDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserPropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 234, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Product :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Item ID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 171, 43, -1));

        jTextArea_itemid.setEditable(false);
        jTextArea_itemid.setColumns(20);
        jTextArea_itemid.setRows(5);
        jScrollPane2.setViewportView(jTextArea_itemid);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jTextArea_product.setEditable(false);
        jTextArea_product.setColumns(20);
        jTextArea_product.setRows(5);
        jScrollPane3.setViewportView(jTextArea_product);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Price :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jTextArea_price.setEditable(false);
        jTextArea_price.setColumns(20);
        jTextArea_price.setRows(5);
        jScrollPane1.setViewportView(jTextArea_price);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Customer Name :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 425, -1, -1));
        jPanel1.add(jTextField_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 234, -1));

        button_Create.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_Create.setText("Create");
        button_Create.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CreateActionPerformed(evt);
            }
        });
        jPanel1.add(button_Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 97, 30));

        button_Back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_Back.setText("Back");
        button_Back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BackActionPerformed(evt);
            }
        });
        jPanel1.add(button_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 80, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 204, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CREATE SALES QUOTATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String generateOrderID() {
        String orderIDPrefix = "Q";
        int latestID = getLatestOrderID(orderIDPrefix);
        latestID++;
        return String.format("%s%03d", orderIDPrefix, latestID);
    }

    private int getLatestOrderID(String orderIDPrefix) {
        int latestID = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("ID: " + orderIDPrefix)) {
                    // Extract the numeric part of the ID
                    int idNumber = Integer.parseInt(line.substring(4 + orderIDPrefix.length(), line.indexOf(',')));
                    latestID = Math.max(latestID, idNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return latestID;
    }

    private void saveSalesOrderQuotation(String orderID, String amount, String customer, List<String> products, List<String> itemIDs, List<String> prices, Date date, String salesPerson) {
        String filePath = "Data/Sales_Quotation.txt";

        // Format the date (you can customize the format)
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String formattedDate = dateFormat.format(date);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write("ID: " + orderID + ",");
            writer.newLine();
            writer.write("Amount: " + amount + ",");
            writer.newLine();
            writer.write("Date: " + formattedDate + ",");
            writer.newLine();

            // Format and append products, item IDs, and prices
            appendFormattedField(writer, "Product", products);
            appendFormattedField(writer, "Item ID", itemIDs);
            appendFormattedField(writer, "Price", prices);

            writer.write("Customer: " + customer + ",");
            writer.newLine();
            writer.write("Salesperson: " + salesPerson + ",");
            writer.newLine();
            writer.write("Confirmation: Default, ");
            writer.newLine();
            writer.write("Officer: Default,");
            writer.newLine();
            writer.write("Invoice: No,");
            writer.newLine();
            writer.write("Status: In Progress,");
            writer.newLine();
            writer.write(System.lineSeparator());  // Add a newline between entries

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to save Sales Order Quotation.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void appendFormattedField(BufferedWriter writer, String fieldName, List<String> values) throws IOException {
        writer.write(fieldName + ": ");
        for (int i = 0; i < values.size(); i++) {
            writer.write(values.get(i));
            if (i < values.size() - 1) {
                writer.write(" / ");
            } else {
                writer.write(",");  // Add comma at the end
            }
        }
        writer.newLine();
    }

    private void jTextField_salesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_salesPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_salesPersonActionPerformed

    private void jDateChooserPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserPropertyChange

    private void jTextField_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_amountActionPerformed

    private void button_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CreateActionPerformed
        String id = generateOrderID(); // Assuming ID is the order ID
        Date date = jDateChooser.getDate(); // Get the selected date
        String salesPerson = jTextField_salesPerson.getText();
        String Amount = jTextField_amount.getText();
        String customer = jTextField_customer.getText();
        String productsText = jTextArea_product.getText();
        String itemIDsText = jTextArea_itemid.getText();
        String pricesText = jTextArea_price.getText();

        // Split the content into lists
        List<String> products = Arrays.asList(productsText.split("\n"));
        List<String> itemIDs = Arrays.asList(itemIDsText.split("\n"));
        List<String> prices = Arrays.asList(pricesText.split("\n"));

        // Save the data to the file
        saveSalesOrderQuotation(id, Amount, customer, products, itemIDs, prices, date, salesPerson);

        JOptionPane.showMessageDialog(this, "Sales Order Quotation created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

        this.dispose();
    }//GEN-LAST:event_button_CreateActionPerformed

    private void button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BackActionPerformed
        this.dispose();
    }//GEN-LAST:event_button_BackActionPerformed

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
            java.util.logging.Logger.getLogger(CreateSalesOrderQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSalesOrderQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSalesOrderQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSalesOrderQuotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateSalesOrderQuotation create_sales_order_quotation = new CreateSalesOrderQuotation(userID, selectedProducts, selectedItemIDs, selectedPrices, amount);
                create_sales_order_quotation.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_Back;
    private furniture_sale_ordering_management_system.progressindicator.Button button_Create;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_itemid;
    private javax.swing.JTextArea jTextArea_price;
    private javax.swing.JTextArea jTextArea_product;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextField jTextField_customer;
    private javax.swing.JTextField jTextField_salesPerson;
    // End of variables declaration//GEN-END:variables
}
