/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yuw18
 */
public class List_Approval extends javax.swing.JFrame {

    public static String userID;
    public static String salesPersonData;
    // constructor and other methods

    /**
     * Creates new form List_Approval
     */
    public void setInitialValues(String userID) {
        jTextField_userid.setText(userID);
    }

    public List_Approval(String userID) {
        this.userID = userID;
        initComponents();
        loadSalesPersonData();
        displaySalesOrdersForSalesperson(salesPersonData);

    }

    private void loadSalesPersonData() {
        salesPersonData = getUsername(userID);
        if (salesPersonData != null) {
            jTextField_salesperson.setText(salesPersonData);

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

    private void displaySalesOrdersForSalesperson(String salesPersonName) {
        DefaultTableModel model = (DefaultTableModel) jTable_listApproval.getModel();
        model.setRowCount(0); // Clear existing rows in the table

        String filePath = "Data/Sales_Quotation.txt";
        String salesOrderData;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Split the content into individual sales orders based on empty lines
            String[] salesOrders = content.toString().split("\\n\\n");

            // Iterate through each sales order
            for (String orderData : salesOrders) {
                // Check if the salesperson's name is present in the sales order data
                if (orderData.contains("Salesperson: " + salesPersonName)) {
                    // Split the sales order data into lines
                    String[] lines = orderData.split("\n");

                    // Extract relevant information and add it to the table
                    Object[] rowData = new Object[7];
                    for (String lineData : lines) {
                        String[] parts = lineData.split(": ");
                        if (parts.length == 2) {
                            String key = parts[0].trim();
                            String value = parts[1].trim();

                            switch (key) {
                                case "ID":
                                    rowData[0] = value;
                                    break;
                                case "Amount":
                                    rowData[1] = value;
                                    break;
                                case "Date":
                                    rowData[2] = value;
                                    break;
                                case "Product":
                                    rowData[3] = value;
                                    break;
                                case "Item ID":
                                    rowData[4] = value;
                                    break;
                                case "Price":
                                    rowData[5] = value;
                                    break;
                                case "Confirmation":
                                    rowData[6] = value;
                                    break;
                                // Add more cases if needed for other fields
                            }
                        }
                    }
                    model.addRow(rowData); // Add the row to the table
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed (e.g., logging, showing an error message)
        }
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
        jTextField_userid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_listApproval = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_salesperson = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_filter = new javax.swing.JTextField();
        jButton_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("User ID :");

        jTextField_userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_useridActionPerformed(evt);
            }
        });

        jTable_listApproval.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Total Amount", "Date", "Product", "Item ID", "Price", "Confirmation"
            }
        ));
        jScrollPane1.setViewportView(jTable_listApproval);
        if (jTable_listApproval.getColumnModel().getColumnCount() > 0) {
            jTable_listApproval.getColumnModel().getColumn(0).setResizable(false);
            jTable_listApproval.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable_listApproval.getColumnModel().getColumn(1).setResizable(false);
            jTable_listApproval.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTable_listApproval.getColumnModel().getColumn(2).setPreferredWidth(15);
            jTable_listApproval.getColumnModel().getColumn(3).setResizable(false);
            jTable_listApproval.getColumnModel().getColumn(5).setResizable(false);
            jTable_listApproval.getColumnModel().getColumn(6).setResizable(false);
            jTable_listApproval.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        jLabel2.setText("Sales Person :");

        jLabel3.setText("Filter :");

        jTextField_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_filterActionPerformed(evt);
            }
        });

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_salesperson, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton_back)))
                        .addGap(0, 181, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_salesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_back)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_useridActionPerformed

    private void jTextField_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_filterActionPerformed
        String searchText = jTextField_filter.getText();
        searchSales(searchText);
    }//GEN-LAST:event_jTextField_filterActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Sales_Home salesPersonHome = new Sales_Home(userID);
        salesPersonHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_backActionPerformed
    public void searchSales(String searchText) {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable_listApproval.getModel());
        jTable_listApproval.setRowSorter(rowSorter);

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
            java.util.logging.Logger.getLogger(List_Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                List_Approval listApproval = new List_Approval(userID);
                listApproval.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_listApproval;
    private javax.swing.JTextField jTextField_filter;
    private javax.swing.JTextField jTextField_salesperson;
    private javax.swing.JTextField jTextField_userid;
    // End of variables declaration//GEN-END:variables
}
