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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

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
        jButton_Generate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_ReportType = new javax.swing.JComboBox<>();

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

        jButton_Generate.setText("Generate");
        jButton_Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerateActionPerformed(evt);
            }
        });

        jLabel5.setText("Report Type:");

        jComboBox_ReportType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Work Done", "Approved", "Closed Sale" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(407, 407, 407))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_ReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jButton_Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_ReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton_Generate))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerateActionPerformed
        String selectedReportType = jComboBox_ReportType.getSelectedItem().toString();
        generateAndDisplayChart(selectedReportType);
    }//GEN-LAST:event_jButton_GenerateActionPerformed

    private void generateAndDisplayChart(String reportType) {
        DefaultCategoryDataset dataset = createDataset(reportType);
        JFreeChart chart = createChart(dataset, reportType);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 300));

        JFrame chartFrame = new JFrame(reportType + " Report Chart");
        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chartFrame.getContentPane().add(chartPanel);
        chartFrame.pack();
        chartFrame.setVisible(true);
    }
   
private DefaultCategoryDataset createDataset(String reportType) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    int rowCount = jTable_Sales.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        String confirmation = jTable_Sales.getValueAt(i, 8).toString(); // Confirmation column index is 8
        String status = jTable_Sales.getValueAt(i, 11).toString(); // Status column index is 11

        if ("Work Done".equals(reportType) && "Approved".equals(confirmation) && "Closed Sale".equals(status)) {
            // For work done report, add data where confirmation is approved and status is closed sale
            String product = jTable_Sales.getValueAt(i, 3).toString(); // Product column index is 3
            double amount = parseAmount(jTable_Sales.getValueAt(i, 1).toString()); // Amount column index is 1
            dataset.addValue(amount, "Amount", product);
        } else if ("Approved".equals(reportType) && "Approved".equals(confirmation) && "In Progress".equals(status)) {
            // For approved report, add data where confirmation is approved and status is in progress
            String product = jTable_Sales.getValueAt(i, 3).toString(); // Product column index is 3
            double amount = parseAmount(jTable_Sales.getValueAt(i, 1).toString()); // Amount column index is 1
            dataset.addValue(amount, "Amount", product);
        } else if ("Closed Sale".equals(reportType) && "Rejected".equals(confirmation) && "Closed Sale".equals(status)) {
            // For closed sale report, add data where confirmation is rejected and status is closed sale
            String product = jTable_Sales.getValueAt(i, 3).toString(); // Product column index is 3
            double amount = parseAmount(jTable_Sales.getValueAt(i, 1).toString()); // Amount column index is 1
            dataset.addValue(amount, "Amount", product);
        }
    }

    return dataset;
}

private double parseAmount(String amountString) {
    // Remove "RM" prefix and parse the amount
    return Double.parseDouble(amountString.replace("RM", "").trim());
}

    
private JFreeChart createChart(DefaultCategoryDataset dataset, String reportType) {
    JFreeChart chart = null;

    if ("Work Done".equals(reportType)) {
        // Bar Chart for Work Done
        chart = ChartFactory.createBarChart(
            reportType + " Report",
            "Product",
            "Amount Sold",
            dataset
        );
    } else if ("Approved".equals(reportType)) {
        // Line Chart for Approved
        chart = ChartFactory.createLineChart(
            reportType + " Report",
            "Product",
            "Amount Sold",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );
    } else {
        // Pie Chart for Closed Sale
        DefaultPieDataset pieDataset = createPieDataset(dataset);
        chart = ChartFactory.createPieChart(
            reportType + " Report",
            pieDataset,
            true, // include legend
            true,
            false
        );
    }

    return chart;
}
  
private DefaultPieDataset createPieDataset(DefaultCategoryDataset dataset) {
    DefaultPieDataset pieDataset = new DefaultPieDataset();

    int rowCount = dataset.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        String product = dataset.getRowKey(i).toString();
        double amount = (double) dataset.getValue(0, i);
        pieDataset.setValue(product, amount);
    }

    return pieDataset;
}
    public void displaySales() {
        DefaultTableModel model = (DefaultTableModel) jTable_Sales.getModel();
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
                generate.displaySales();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Generate;
    private javax.swing.JComboBox<String> jComboBox_ReportType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Sales;
    // End of variables declaration//GEN-END:variables
}
