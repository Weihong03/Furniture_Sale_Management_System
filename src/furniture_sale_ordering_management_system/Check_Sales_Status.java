/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import furniture_sale_ordering_management_system.progressindicator.ProductStatusUpdater;
import furniture_sale_ordering_management_system.Shared_item.glasspanepopup.GlassPanePopup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import table.TableCustom;

/**
 *
 * @author Workstation
 */
public class Check_Sales_Status extends javax.swing.JFrame {

    private static String userID;

    /**
     * Creates new form Check_Sales_Status
     */
    public Check_Sales_Status(String userID) {
        this.userID = userID;

        initComponents();

        // Set the title of the window
        setTitle("Check Sale Product Status");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);


        jTable_SalesProduct.getTableHeader().setFont(new Font("", Font.BOLD, 15));
        jTable_SalesProduct.setFont(new Font("", Font.BOLD, 10));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_SalesProduct = new javax.swing.JTable();
        button_checkstatus = new furniture_sale_ordering_management_system.progressindicator.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_SalesProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Date", "Amount", "Product", "Item ID", "Price", "Customer", "Salesperson", "Confirmation", "Officer", "Invoice", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_SalesProduct);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, 1038, 454));

        button_checkstatus.setText("Check Status");
        button_checkstatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_checkstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_checkstatusActionPerformed(evt);
            }
        });
        jPanel1.add(button_checkstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 91, 110, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHECK SALES PRODUCT STATUS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_checkstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_checkstatusActionPerformed
        // Get the selected row index
        int selectedRowIndex = jTable_SalesProduct.getSelectedRow();
        // Check if a row is selected
        if (selectedRowIndex != -1) {
            // Get the confirmation status from the selected row (assuming it's in the 9th column)
            String confirmationStatus = (String) jTable_SalesProduct.getValueAt(selectedRowIndex, 8);
            // Check if the confirmation is approved
            if ("Approved".equalsIgnoreCase(confirmationStatus)) {
                // Show the GlassPanePopup only when the conditions are met
                GlassPanePopup.showPopup(new Status());
                // Get the sale ID from the selected row (assuming it's in the first column)
                String saleID = (String) jTable_SalesProduct.getValueAt(selectedRowIndex, 0);
                // Create a new ProductStatusUpdater and start it in a new thread
                ProductStatusUpdater statusUpdater = new ProductStatusUpdater(saleID);
                new Thread(statusUpdater).start();
                // Use a Swing Timer to wait for 6 seconds and then call displaySales
                Timer timer = new Timer(7000, (ActionEvent e) -> {
                    displaySales();
                });
                timer.setRepeats(false); // Set to false for a one-time execution
                timer.start();
            } else {
                JOptionPane.showMessageDialog(this, "Cannot check status. Sale confirmation is not approved.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a sale to check status.");
        }
    }//GEN-LAST:event_button_checkstatusActionPerformed

    public void displaySales() {
        DefaultTableModel model = (DefaultTableModel) jTable_SalesProduct.getModel();
        model.setRowCount(0); // Clear existing data

        try (BufferedReader br = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("ID: ")) {
                    String[] rowData = new String[12];
                    // Remove trailing comma if present in the ID
                    rowData[0] = line.split(": ")[1].replaceAll(",\\s*$", "").trim();
                    for (int i = 1; i < 12; i++) {
                        line = br.readLine();
                        if (line != null && line.contains(": ")) {
                            String[] parts = line.split(": ", 2);
                            if (parts.length == 2) {
                                // Remove trailing comma if present
                                String value = parts[1].replaceAll(",\\s*$", "");
                                // Check if the data is "Default" and set to empty if true
                                rowData[i] = "Default".equals(value) ? "-" : value;
                            } else {
                                // Handle unexpected line format
                                rowData[i] = " ";
                            }
                        } else {
                            // Handle unexpected line format
                            rowData[i] = " ";
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
            java.util.logging.Logger.getLogger(Check_Sales_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Sales_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Sales_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Sales_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Check_Sales_Status check = new Check_Sales_Status(userID);
                check.setVisible(true);
                check.displaySales();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_checkstatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_SalesProduct;
    // End of variables declaration//GEN-END:variables
}
