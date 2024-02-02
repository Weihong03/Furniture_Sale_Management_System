package furniture_sale_ordering_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Wei Hong
 */
public class Sale_Approval extends javax.swing.JFrame {

    private String userID;
    private static final String BOOKING_FILE_PATH = "Data/Sales_Quotation.txt";

    public Sale_Approval(String userID) {
        this.userID = userID;

        initComponents();
        // Set the title of the window
        setTitle("Sale Approval");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Sale_Approval() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Salestable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        button_modify = new furniture_sale_ordering_management_system.progressindicator.Button();
        button_delete = new furniture_sale_ordering_management_system.progressindicator.Button();
        button_approve = new furniture_sale_ordering_management_system.progressindicator.Button();
        button_reject = new furniture_sale_ordering_management_system.progressindicator.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1050, 680));

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("SALE APPROVAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(326, 326, 326))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTable_Salestable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable_Salestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amount", "Date", "Product", "Item ID", "Price", "Customer", "Salesperson", "Confirmation", "Approved by", "Invoice Generated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Salestable);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Search :");

        jTextField_search.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });

        button_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/modify.png"))); // NOI18N
        button_modify.setText("Modify");
        button_modify.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_modify.setPreferredSize(new java.awt.Dimension(122, 49));
        button_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modifyActionPerformed(evt);
            }
        });

        button_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/delete.png"))); // NOI18N
        button_delete.setText("Delete");
        button_delete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_delete.setPreferredSize(new java.awt.Dimension(102, 49));
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_approve.setText("Approve");
        button_approve.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_approve.setPreferredSize(new java.awt.Dimension(70, 31));
        button_approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_approveActionPerformed(evt);
            }
        });

        button_reject.setText("Reject");
        button_reject.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_reject.setPreferredSize(new java.awt.Dimension(70, 31));
        button_reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(button_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(button_approve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_reject, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(149, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_approve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_reject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
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


    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        String searchText = jTextField_search.getText();
        searchSales(searchText);
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void button_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modifyActionPerformed
        int selectedRowIndex = jTable_Salestable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            // Get the values from the selected row
            String ID = jTable_Salestable.getValueAt(selectedRowIndex, 0).toString();
            // Remove "RM" from the string before parsing
            String Amount = jTable_Salestable.getValueAt(selectedRowIndex, 1).toString().replace("RM", "");
            String Date = jTable_Salestable.getValueAt(selectedRowIndex, 2).toString();
            String Product = jTable_Salestable.getValueAt(selectedRowIndex, 3).toString();
            String ItemID = jTable_Salestable.getValueAt(selectedRowIndex, 4).toString();
            String Price = jTable_Salestable.getValueAt(selectedRowIndex, 5).toString().replace("RM", "");
            String Customer = jTable_Salestable.getValueAt(selectedRowIndex, 6).toString();
            String Salesperson = jTable_Salestable.getValueAt(selectedRowIndex, 7).toString();

            // Create an instance of ModifyBooking and pass the selected data
            ModifySales modifySales = new ModifySales(ID, Amount, Date, Product, ItemID, Price, Customer, Salesperson, userID);
            modifySales.setVisible(true);
            displaySales();
        } else {
            // No row selected, display an error message or perform appropriate handling
            JOptionPane.showMessageDialog(this, "Please select a Sales to modify.");
        }
        
    }//GEN-LAST:event_button_modifyActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        // Get the selected row from your table or list
        int selectedRow = jTable_Salestable.getSelectedRow();

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
        int startIndex = selectedRow * 13; // Each data block has 9 lines
        int endIndex = Math.min(startIndex + 12, lines.size() - 1);

        // Check if the selected row is within the bounds of the file
        if (startIndex >= 0 && endIndex < lines.size()) {
            // Remove the selected row's data from the in-memory list
            lines.subList(startIndex, endIndex + 1).clear();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid selected row.");
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
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_approveActionPerformed
        int selectedRow = jTable_Salestable.getSelectedRow();

        if (selectedRow != -1) {
            String ID = jTable_Salestable.getValueAt(selectedRow, 0).toString();
            modifyConfirmation(ID, "Approved");
            JOptionPane.showMessageDialog(this, "Confirmation Status updated successfully.");
            // Refresh the UI
            displaySales();
        }
    }//GEN-LAST:event_button_approveActionPerformed

    private void button_rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_rejectActionPerformed
                int selectedRow = jTable_Salestable.getSelectedRow();

        if (selectedRow != -1) {
            String ID = jTable_Salestable.getValueAt(selectedRow, 0).toString();
            modifyConfirmation(ID, "Rejected");
            JOptionPane.showMessageDialog(this, "Confirmation Status updated successfully.");
            // Refresh the UI
            displaySales();
        }
    }//GEN-LAST:event_button_rejectActionPerformed

    private String getUsernameFromID(String userID) {
        try {
            Path inputFile = Path.of("Data/Officer_Salesperson.txt");

            List<String> lines = Files.readAllLines(inputFile, StandardCharsets.UTF_8);

            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).startsWith("ID: " + userID + ",")) {
                    String usernameLine = lines.get(i + 1);
                    String username = usernameLine.trim().substring("Username: ".length());
                    // Remove trailing comma if present
                    if (username.endsWith(",")) {
                        username = username.substring(0, username.length() - 1);
                    }
                    return username;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null; // Return null if not found
    }

    private boolean modifyConfirmation(String ID, String Confirmation) {
        try {
            Path inputFile = Path.of(BOOKING_FILE_PATH);

            List<String> lines = Files.readAllLines(inputFile, StandardCharsets.UTF_8);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.startsWith("ID: " + ID + ",")) {
                    String username = getUsernameFromID(userID);
                    lines.set(i + 8, "Confirmation: " + Confirmation + ",");
                    lines.set(i + 9, "Officer: " + username + ",");
                    Files.write(inputFile, lines, StandardCharsets.UTF_8);
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public void displaySales() {
        DefaultTableModel model = (DefaultTableModel) jTable_Salestable.getModel();
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
            // Set cell alignment to center
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            for (int i = 0; i < jTable_Salestable.getColumnCount(); i++) {
                jTable_Salestable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
            // Set header alignment to center
            ((DefaultTableCellRenderer) jTable_Salestable.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(JLabel.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchSales(String searchText) {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable_Salestable.getModel());
        jTable_Salestable.setRowSorter(rowSorter);

        RowFilter<TableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
        rowSorter.setRowFilter(rowFilter);
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
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sale_Approval approval = new Sale_Approval();
                approval.setVisible(true);
                approval.displaySales();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_approve;
    private furniture_sale_ordering_management_system.progressindicator.Button button_delete;
    private furniture_sale_ordering_management_system.progressindicator.Button button_modify;
    private furniture_sale_ordering_management_system.progressindicator.Button button_reject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Salestable;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
