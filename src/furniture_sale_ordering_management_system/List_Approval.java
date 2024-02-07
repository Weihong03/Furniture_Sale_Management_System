/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        
        getContentPane().setBackground(Color.WHITE);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);


        jTable_listApproval.getTableHeader().setFont(new java.awt.Font("", java.awt.Font.BOLD, 15));
        jTable_listApproval.setFont(new java.awt.Font("", java.awt.Font.BOLD, 10));

    }

    private void loadSalesPersonData() {
        salesPersonData = getUsername(userID);
        if (salesPersonData != null) {
            salesPersonData = salesPersonData.replace(",", "");
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
                                    value = value.replaceAll(",", "");
                                    rowData[0] = value;
                                    break;
                                case "Amount":
                                    value = value.replaceAll(",", "");
                                    rowData[1] = value;
                                    break;
                                case "Date":
                                    value = value.replaceAll(",", "");
                                    rowData[2] = value;
                                    break;
                                case "Product":
                                    value = value.replaceAll(",", "");
                                    rowData[3] = value;
                                    break;
                                case "Item ID":
                                    value = value.replaceAll(",", "");
                                    rowData[4] = value;
                                    break;
                                case "Price":
                                    value = value.replaceAll(",", "");
                                    rowData[5] = value;
                                    break;
                                case "Confirmation":
                                    value = value.replaceAll(",", "");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_userid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_listApproval = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_salesperson = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_filter = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1050, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("User ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 174, -1, -1));

        jTextField_userid.setEditable(false);
        jTextField_userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_useridActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 171, 120, -1));

        jTable_listApproval.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Total Amount", "Date", "Product", "Item ID", "Price", "Confirmation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, 1010, 450));

        jLabel2.setText("Sales Person :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 174, -1, -1));

        jTextField_salesperson.setEditable(false);
        jPanel1.add(jTextField_salesperson, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 171, 120, -1));

        jLabel3.setText("Filter :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 174, 37, -1));

        jTextField_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_filterActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 171, 120, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("APPROVAL LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_listApproval;
    private javax.swing.JTextField jTextField_filter;
    private javax.swing.JTextField jTextField_salesperson;
    private javax.swing.JTextField jTextField_userid;
    // End of variables declaration//GEN-END:variables
}
