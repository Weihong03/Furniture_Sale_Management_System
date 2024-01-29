package furniture_sale_ordering_management_system;

import static furniture_sale_ordering_management_system.Choose_Product.userID;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yuw18
 */
public class Choose_Product extends javax.swing.JFrame {
    public double totalPrice = 0.0;
    public static String userID;
    public static String selectedProduct;  // Make static
    public static String itemID;
    public static String price;
    public List<String> selectedProducts = new ArrayList<>();
    public List<String> selectedItemIDs = new ArrayList<>();
    public List<String> selectedPrices = new ArrayList<>();   
    public static String Amount;
    /**
     * Creates new form Choose_Product1
     * @param userID
     */
    public Choose_Product(String userID) {
        this.userID = userID;
        initComponents();
        List<String> furnitureNames = readFurnitureNamesFromCSV();
        jComboBox_product.setModel(new DefaultComboBoxModel<>(furnitureNames.toArray(new String[0])));
    }
    
    private List<String> readFurnitureNamesFromCSV() {
        List<String> furnitureNames = new ArrayList<>();

        String csvFile = "Data/Yoyo-Furniture.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Assuming that the furniture name is in the first column
                String[] data = line.split(",");
                if (data.length > 0) {
                    furnitureNames.add(data[0].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed (e.g., logging, showing an error message)
        }

        return furnitureNames;
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
        jComboBox_product = new javax.swing.JComboBox<>();
        jButton_add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_totalamount = new javax.swing.JTextArea();
        jButton_proceed = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_product = new javax.swing.JTable();
        jButton_back = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Product :");

        jComboBox_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });

        jTextArea_totalamount.setColumns(20);
        jTextArea_totalamount.setRows(5);
        jScrollPane2.setViewportView(jTextArea_totalamount);

        jButton_proceed.setText("Proceed");
        jButton_proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_proceedActionPerformed(evt);
            }
        });

        jTable_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Name", "Price", "Category", "Short Description", "Designer", "Height", "Width"
            }
        ));
        jScrollPane3.setViewportView(jTable_product);

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_delete)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_proceed)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_add))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(jButton_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_proceed)
                    .addComponent(jButton_back)
                    .addComponent(jButton_delete))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_proceedActionPerformed
     int[] selectedRows = jTable_product.getSelectedRows();

        if (selectedRows.length > 0) {
            for (int selectedRow : selectedRows) {
                itemID = jTable_product.getValueAt(selectedRow, 0).toString();
                selectedProduct = jTable_product.getValueAt(selectedRow, 1).toString();
                price = jTable_product.getValueAt(selectedRow, 2).toString();

                // Add the selected product and item ID to the lists
                selectedProducts.add(selectedProduct);
                selectedItemIDs.add(itemID);
                selectedPrices.add(price);
            }

            // Extract total amount details from jTextArea_totalamount
            String totalAmountDetails = jTextArea_totalamount.getText();

            // Extract the amount from totalAmountDetails
            String amount = extractAmount(totalAmountDetails);

            // Create an instance of CreateSalesOrderQuotation
            CreateSalesOrderQuotation create_sales_order_quotation = new CreateSalesOrderQuotation(userID, selectedProducts, selectedItemIDs, selectedPrices,amount);

            // Pass the data to CreateSalesOrderQuotation
            create_sales_order_quotation.setInitialValues(selectedProducts, selectedItemIDs,selectedPrices, amount);

            // Make CreateSalesOrderQuotation visible
            create_sales_order_quotation.setVisible(true);

            // Close the current window
            dispose();
        } else {
            // No row selected, display an error message or perform appropriate handling
            JOptionPane.showMessageDialog(this, "Please add a product before proceeding.");
        }
        }//GEN-LAST:event_jButton_proceedActionPerformed
  private String extractAmount(String input) {
    // Assuming the amount is always after "RM" in the text
    String rmPrefix = "RM";
    int rmIndex = input.indexOf(rmPrefix);
    if (rmIndex != -1) {
        // Find the next occurrence of "\n" or use the length of the string
        int endIndex = input.indexOf("\n", rmIndex);
        if (endIndex == -1) {
            endIndex = input.length();
        }
        return input.substring(rmIndex, endIndex).trim();
    } else {
        // If "RM" is not found, you may need additional logic based on your actual data format
        return input.trim();
    }
}
    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
          String selectedProduct = (String) jComboBox_product.getSelectedItem();

    // Read additional data (item ID, category, and price) based on the selected product
    String csvFile = "Data/Yoyo-Furniture.csv";
    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line, ",");
            List<String> dataList = new ArrayList<>();

            while (tokenizer.hasMoreTokens()) {
                dataList.add(tokenizer.nextToken());
            }

            if (!dataList.isEmpty() && dataList.get(0).trim().equals(selectedProduct)) {
                // Assuming item ID is in the second column, category in the third, and price in the fourth
                String itemID = getSafeValue(dataList, 1);
                String priceStr = getSafeValue(dataList, 2);
                String category = getSafeValue(dataList, 3);
                String shortDescription = getSafeValue(dataList, 4);
                String designer = getSafeValue(dataList, 5);
                String height = getSafeValue(dataList, 6);
                String width = getSafeValue(dataList, 7);

                // Convert price to double and add it to the total
                double price = Double.parseDouble(priceStr);
                totalPrice += price;

                // Append additional data to jTable_product
                DefaultTableModel model = (DefaultTableModel) jTable_product.getModel();
                model.addRow(new Object[]{itemID, selectedProduct, "RM" + price, category, shortDescription, designer, height, width});

                // Update the total amount in jTextArea_totalamount
                jTextArea_totalamount.setText("Total Price: RM" + totalPrice + "\n");

                break; // No need to continue reading once the data is found
            }
        }
    } catch (IOException | NumberFormatException e) {
        e.printStackTrace();
        // Handle the exception as needed (e.g., logging, showing an error message)
    }

    // Optionally, you can clear the selection in the jComboBox_product
    jComboBox_product.setSelectedIndex(-1);
    }//GEN-LAST:event_jButton_addActionPerformed
    private String getSafeValue(List<String> dataList, int index) {
    return (index >= 0 && index < dataList.size()) ? dataList.get(index).trim() : "";
}
    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
 Sales_Home salesPersonHome = new Sales_Home(userID);
                    salesPersonHome.setVisible(true);
                    this.setVisible(false);    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
    deleteSelectedRows();
    }//GEN-LAST:event_jButton_deleteActionPerformed
    private void deleteSelectedRows() {
    DefaultTableModel model = (DefaultTableModel) jTable_product.getModel();
    int[] selectedRows = jTable_product.getSelectedRows();

    // Delete rows in reverse order to avoid issues with indices
    for (int i = selectedRows.length - 1; i >= 0; i--) {
        model.removeRow(selectedRows[i]);
    }

    // Recalculate the total price based on the remaining rows
    totalPrice = 0.0;
    for (int i = 0; i < model.getRowCount(); i++) {
        String priceStr = model.getValueAt(i, 2).toString().replace("RM", "").trim();
        double price = Double.parseDouble(priceStr);
        totalPrice += price;
    }

    // Update the total amount in jTextArea_totalamount
    jTextArea_totalamount.setText("Total Price: RM" + totalPrice + "\n");
}

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
            java.util.logging.Logger.getLogger(Choose_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Choose_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Choose_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Choose_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Choose_Product chooseproduct = new Choose_Product(userID);
                chooseproduct.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_proceed;
    private javax.swing.JComboBox<String> jComboBox_product;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_product;
    private javax.swing.JTextArea jTextArea_totalamount;
    // End of variables declaration//GEN-END:variables
}
