/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import table.TableCustom;

/**
 *
 * @author yuw18
 */
public class Manage_Sales_Order_Quotation extends javax.swing.JFrame {

    public static String userID;

    /**
     * Creates new form Manage_Sales_Order_Quotation
     *
     * @param userID
     */
    public Manage_Sales_Order_Quotation(String userID) {
        initComponents();
        this.userID = userID;
        
        getContentPane().setBackground(Color.WHITE);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);


        jTable_manageQuotation.getTableHeader().setFont(new java.awt.Font("", java.awt.Font.BOLD, 15));
        jTable_manageQuotation.setFont(new java.awt.Font("", java.awt.Font.BOLD, 10));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_manageQuotation = new javax.swing.JTable();
        button_Delete = new furniture_sale_ordering_management_system.progressindicator.Button();
        button_Modify = new furniture_sale_ordering_management_system.progressindicator.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1050, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Search :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

        jTable_manageQuotation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Total Amount", "Date", "Product", "Item ID", "Price", "Customer", "Salesperson", "Confirmation", "Officer", "Invoice", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_manageQuotation);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 177, 1030, 430));

        button_Delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_Delete.setText("Delete");
        button_Delete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(button_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 100, 30));

        button_Modify.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_Modify.setText("Modify");
        button_Modify.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ModifyActionPerformed(evt);
            }
        });
        jPanel1.add(button_Modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, 100, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE SALES QUOTATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        String searchText = jTextField_search.getText();
        searchSales(searchText);
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DeleteActionPerformed
          int selectedRow = jTable_manageQuotation.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        // Read the contents of the file into memory
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return; // Exit the method if an error occurs while reading the file
        }

        // Calculate the line indices of the selected row's data
        int startIndex = selectedRow * 13; // Each row has 9 lines of data
        int endIndex = startIndex + 12;

        // Check if the calculated indices are within the bounds of the list
        if (startIndex >= 0 && endIndex < lines.size()) {
            // Remove the selected row's data from the in-memory list
            lines.subList(startIndex, endIndex + 1).clear();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid row to delete.");
            return;
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/Sales_Quotation.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return; // Exit the method if an error occurs while writing to the file
        }

        JOptionPane.showMessageDialog(this, "Selected row deleted successfully.");
        // Refresh the UI
        displaySales();
    }//GEN-LAST:event_button_DeleteActionPerformed

    private void button_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ModifyActionPerformed
  int selectedRowIndex = jTable_manageQuotation.getSelectedRow();
        if (selectedRowIndex >= 0) {
            // Get the values from the selected row
            String orderID = jTable_manageQuotation.getValueAt(selectedRowIndex, 0).toString();
            String Amount = jTable_manageQuotation.getValueAt(selectedRowIndex, 1).toString();

            String dateAsString = jTable_manageQuotation.getValueAt(selectedRowIndex, 2).toString();

// Parse the date with the correct format
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            dateAsString = dateAsString.replace(",", ""); // Remove the comma
            Date date = null;  // Initialize the date to null
            try {
                date = dateFormat.parse(dateAsString);
            } catch (ParseException e) {
                e.printStackTrace(); // Handle the exception as needed
            }

            String Product = jTable_manageQuotation.getValueAt(selectedRowIndex, 3).toString();
            String ItemID = jTable_manageQuotation.getValueAt(selectedRowIndex, 4).toString();
            String Price = jTable_manageQuotation.getValueAt(selectedRowIndex, 5).toString();
            String Customer = jTable_manageQuotation.getValueAt(selectedRowIndex, 6).toString();
            String Salesperson = jTable_manageQuotation.getValueAt(selectedRowIndex, 7).toString();
            String Confirmation = jTable_manageQuotation.getValueAt(selectedRowIndex, 8).toString();
            String Officer = jTable_manageQuotation.getValueAt(selectedRowIndex, 9).toString();
            String Invoice = jTable_manageQuotation.getValueAt(selectedRowIndex, 10).toString();
            String Status = jTable_manageQuotation.getValueAt(selectedRowIndex, 11).toString();

            // Create an instance of ModifyWorkerProfile and pass the selected data
            Modify_Sales_Order_Quotation modifySalesOrderQuotation = new Modify_Sales_Order_Quotation(userID, orderID, Product, Amount, ItemID, Price, Customer, Salesperson, date);
            modifySalesOrderQuotation.setInitialValues(orderID, Amount, Product, ItemID, Price, Customer, Salesperson, date);
            modifySalesOrderQuotation.setVisible(true);
            dispose();
        } else {
            // No row selected, display an error message or perform appropriate handling
            JOptionPane.showMessageDialog(this, "Please select a row to modify.");
        }
        dispose();
    }//GEN-LAST:event_button_ModifyActionPerformed

    public void displaySales() {
        DefaultTableModel model = (DefaultTableModel) jTable_manageQuotation.getModel();
        model.setRowCount(0); // Clear existing data

        try (BufferedReader br = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("ID:")) {
                    String[] rowData = new String[12];
                    rowData[0] = line.substring(4); // Extract ID value
                    rowData[0] = line.split(": ")[1].replaceAll(",\\s*$", "").trim();
                    for (int i = 1; i < 12; i++) {
                        line = br.readLine();
                        if (line != null && line.contains(": ")) {
                            String[] parts = line.split(": ", 2);
                            if (parts.length == 2) {
                                // Clean up values by removing commas
                                String cleanedValue = parts[1].replaceAll(",", "");
                                rowData[i] = cleanedValue;
                            } else {
                                // Handle unexpected line format
                                rowData[i] = " ";
                            }
                        }
                    }
                    model.addRow(rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace to identify the issue
            JOptionPane.showMessageDialog(this, "Error reading the file: " + e.getMessage());
        }
    }

    public void searchSales(String searchText) {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable_manageQuotation.getModel());
        jTable_manageQuotation.setRowSorter(rowSorter);

        RowFilter<TableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
        rowSorter.setRowFilter(rowFilter);
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
            java.util.logging.Logger.getLogger(Manage_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Sales_Order_Quotation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Manage_Sales_Order_Quotation manageSalesOrderQuotation = new Manage_Sales_Order_Quotation(userID);
                manageSalesOrderQuotation.setVisible(true);
                manageSalesOrderQuotation.displaySales();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_Delete;
    private furniture_sale_ordering_management_system.progressindicator.Button button_Modify;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_manageQuotation;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
