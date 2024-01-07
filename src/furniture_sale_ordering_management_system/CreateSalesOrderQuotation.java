/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import static furniture_sale_ordering_management_system.Choose_Product.userID;
import static furniture_sale_ordering_management_system.Modify_Sales_Order_Quotation.Amount;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
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
   public void setInitialValues(List<String> selectedProducts, List<String> selectedItemIDs,List<String> selectedPrices, String amount) {
    String productsText = formatListAsString(selectedProducts);
    String itemIDsText = formatListAsString(selectedItemIDs);
    String pricesText = formatListAsString(selectedPrices);

    jTextArea_product.setText(productsText);
    jTextArea_itemid.setText(itemIDsText);
    jTextArea_price.setText(pricesText);
    jTextField_amount.setText(amount);
    }

    public CreateSalesOrderQuotation(String userID, List<String> selectedProducts, List<String> selectedItemIDs,List<String> selectedPrices, String amount) {
        this.userID = userID;
        this.selectedProducts = selectedProducts;
        this.selectedItemIDs = selectedItemIDs;
        this.selectedPrices = selectedPrices;
        this.amount = amount;

        initComponents();

        
        
        loadSalesPersonData();
                
        setTitle("Create Sales Order Quotation");

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
    
   
    
    private void loadSalesPersonData() {
    String salesPersonData = getUsername(userID);

    if (salesPersonData != null) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_amount = new javax.swing.JTextField();
        jTextField_salesPerson = new javax.swing.JTextField();
        jButton_create = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
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

        jLabel10.setText("Category:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Total Amount :");

        jLabel3.setText("Date :");

        jLabel4.setText("Sales Person :");

        jTextField_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_amountActionPerformed(evt);
            }
        });

        jTextField_salesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_salesPersonActionPerformed(evt);
            }
        });

        jButton_create.setText("Create");
        jButton_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_createActionPerformed(evt);
            }
        });

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jDateChooser.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserPropertyChange(evt);
            }
        });

        jLabel1.setText("Product :");

        jLabel9.setText("Item ID:");

        jTextArea_itemid.setColumns(20);
        jTextArea_itemid.setRows(5);
        jScrollPane2.setViewportView(jTextArea_itemid);

        jTextArea_product.setColumns(20);
        jTextArea_product.setRows(5);
        jScrollPane3.setViewportView(jTextArea_product);

        jLabel5.setText("Price :");

        jTextArea_price.setColumns(20);
        jTextArea_price.setRows(5);
        jScrollPane1.setViewportView(jTextArea_price);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_salesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_back)
                        .addGap(90, 90, 90)
                        .addComponent(jButton_create))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_salesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_create)
                    .addComponent(jButton_back))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Choose_Product chooseproduct = new Choose_Product(userID);
        chooseproduct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_backActionPerformed
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
    private void jButton_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_createActionPerformed
     String id = generateOrderID(); // Assuming ID is the order ID
    Date date = jDateChooser.getDate(); // Get the selected date
    String salesPerson = jTextField_salesPerson.getText();
    String Amount = jTextField_amount.getText();
    String productsText = jTextArea_product.getText();
    String itemIDsText = jTextArea_itemid.getText();
    String pricesText = jTextArea_price.getText();

    // Split the content into lists
    List<String> products = Arrays.asList(productsText.split("\n"));
    List<String> itemIDs = Arrays.asList(itemIDsText.split("\n"));
    List<String> prices = Arrays.asList(pricesText.split("\n"));

    // Save the data to the file
    saveSalesOrderQuotation(id, Amount, products, itemIDs, prices, date, salesPerson);

    JOptionPane.showMessageDialog(this, "Sales Order Quotation created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    
    // Close the current frame or perform any navigation as needed
    // For example:
    Sales_Home sales_home = new Sales_Home(userID);
    sales_home.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_jButton_createActionPerformed
  private void saveSalesOrderQuotation(String orderID, String amount, List<String> products, List<String> itemIDs, List<String> prices, Date date, String salesPerson) {
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
                CreateSalesOrderQuotation create_sales_order_quotation = new CreateSalesOrderQuotation(userID, selectedProducts, selectedItemIDs,selectedPrices, amount);
                create_sales_order_quotation.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_create;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_itemid;
    private javax.swing.JTextArea jTextArea_price;
    private javax.swing.JTextArea jTextArea_product;
    private javax.swing.JTextField jTextField_amount;
    private javax.swing.JTextField jTextField_salesPerson;
    // End of variables declaration//GEN-END:variables
}
