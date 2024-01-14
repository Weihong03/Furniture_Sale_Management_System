/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Workstation
 */
public class Generate_Report extends javax.swing.JFrame {

    /**
     * Creates new form Generate_Report
     */
    public Generate_Report() {
        initComponents();
        // Set the title of the window
        setTitle("Report Generation");

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jComboBox_Salesperson = new javax.swing.JComboBox<>();
        jComboBox_Confirmation = new javax.swing.JComboBox<>();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_Generate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Report Generation");

        jTable_Sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amount", "Date", "Product", "Item ID", "Price", "Customer", "Salesperson", "Confirmation", "Officer", "Invoice", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable_Sales);

        jComboBox_Confirmation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Approved", "Rejected" }));

        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Progress", "Closed Sale" }));

        jLabel2.setText("Work Done Report:");

        jLabel3.setText("Approved Report:");

        jLabel4.setText("Closed Sale Report:");

        jButton_Generate.setText("Generate");
        jButton_Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Salesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox_Salesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Generate)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerateActionPerformed
        // Determine the selected report type
    String selectedReportType = "";
    if (jComboBox_Salesperson.getSelectedItem() != null) {
        selectedReportType = jComboBox_Salesperson.getSelectedItem().toString();
    } else if (jComboBox_Confirmation.getSelectedItem() != null) {
        selectedReportType = jComboBox_Confirmation.getSelectedItem().toString();
    } else if (jComboBox_Status.getSelectedItem() != null) {
        selectedReportType = jComboBox_Status.getSelectedItem().toString();
    }

    // Perform actions based on the selected report type
    switch (selectedReportType) {
        case "Work Done":
            // Call a method to display work done report for the selected salesperson
            displayWorkDoneReport(jComboBox_Salesperson.getSelectedItem().toString());
            break;
        case "Approved":
            // Call a method to display approved report based on confirmation status
            displayApprovedReport(jComboBox_Confirmation.getSelectedItem().toString());
            break;
        case "Closed Sale":
            // Call a method to display closed sale report based on status
            displayClosedSaleReport(jComboBox_Status.getSelectedItem().toString());
            break;
        default:
            JOptionPane.showMessageDialog(this, "Please select a valid report type.");
    }
    }//GEN-LAST:event_jButton_GenerateActionPerformed

    // Method to refresh the Salesperson JComboBox
    private void refreshSalespersonComboBox() {
        // Assuming jComboBox_Salesperson is the name of your JComboBox
        jComboBox_Salesperson.removeAllItems(); // Clear existing items

        // Read Sales_Quotation.txt and extract Salesperson names
        Set<String> salespersons = readSalespersonsFromFile("Data/Sales_Quotation.txt");

        // Update the JComboBox with Salesperson names
        for (String salesperson : salespersons) {
            jComboBox_Salesperson.addItem(salesperson);
        }
    }

    // Method to read Salesperson names from Sales_Quotation.txt
    private Set<String> readSalespersonsFromFile(String filePath) {
        Set<String> salespersons = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Salesperson:")) {
                    // Extract Salesperson name from the line and remove trailing comma if it exists
                    String salesperson = line.substring("Salesperson:".length()).trim().replaceAll(",$", "");
                    salespersons.add(salesperson);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }

        return salespersons;
    }

    public void displaySales() {
        DefaultTableModel model = (DefaultTableModel) jTable_Sales.getModel();
        model.setRowCount(0); // Clear existing data

        try (BufferedReader br = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("ID:")) {
                    String[] rowData = new String[12];
                    rowData[0] = line.substring(4); // Extract ID value

                    for (int i = 1; i < 12; i++) {
                        line = br.readLine();
                        if (line != null && line.contains(": ")) {
                            String[] parts = line.split(": ", 2);
                            if (parts.length == 2) {
                                rowData[i] = parts[1];
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

    // Method to display work done report for the selected salesperson
private void displayWorkDoneReport(String selectedSalesperson) {
    // Your logic to filter and display work done report for the selected salesperson
    // You may use the existing displaySales() method as a starting point
    // and modify it to filter the data based on the selected salesperson
    // For example, you can create a new method to filter the data by salesperson
}

// Method to display approved report based on confirmation status
private void displayApprovedReport(String selectedConfirmation) {
    // Your logic to filter and display approved report based on confirmation status
    // You may use the existing displaySales() method as a starting point
    // and modify it to filter the data based on the selected confirmation status
}

// Method to display closed sale report based on status
private void displayClosedSaleReport(String selectedStatus) {
    // Your logic to filter and display closed sale report based on status
    // You may use the existing displaySales() method as a starting point
    // and modify it to filter the data based on the selected status
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
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generate_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Generate_Report generate = new Generate_Report();
                generate.setVisible(true);
                generate.refreshSalespersonComboBox();
                generate.displaySales();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Generate;
    private javax.swing.JComboBox<String> jComboBox_Confirmation;
    private javax.swing.JComboBox<String> jComboBox_Salesperson;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Sales;
    // End of variables declaration//GEN-END:variables
}
