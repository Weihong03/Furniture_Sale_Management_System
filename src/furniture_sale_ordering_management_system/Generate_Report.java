/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.awt.BorderLayout;
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

/**
 *
 * @author Workstation
 */
public class Generate_Report extends javax.swing.JFrame {

    private static String userID;

    /**
     * Creates new form Generate_Report
     */
    public Generate_Report(String userID) {
        this.userID = userID;
        initComponents();
        // Set the title of the window
        setTitle("Report Generation");

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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Sales = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_ReportType = new javax.swing.JComboBox<>();
        button_generate = new furniture_sale_ordering_management_system.progressindicator.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1050, 680));

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Sales);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Report Generation");

        jLabel5.setText("Report Type:");

        jComboBox_ReportType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Work Done", "Approved", "Closed Sale" }));

        button_generate.setText("Generate");
        button_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_ReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(button_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(jLabel1)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_ReportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(button_generate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
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

    private void button_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_generateActionPerformed
        String selectedReportType = jComboBox_ReportType.getSelectedItem().toString();
        generateAndDisplayChart(selectedReportType);
    }//GEN-LAST:event_button_generateActionPerformed

    private void generateAndDisplayChart(String reportType) {
        DefaultCategoryDataset barChartDataset = createDataset(reportType);
        DefaultCategoryDataset lineChartDataset = createLineChartDataset(reportType);

        JFreeChart barChart = createChart(barChartDataset, reportType);
        JFreeChart lineChart = createLineChart(lineChartDataset, reportType);

        // Create separate panels for bar chart and line chart
        ChartPanel barChartPanel = new ChartPanel(barChart);
        ChartPanel lineChartPanel = new ChartPanel(lineChart);

        // Create a new JFrame to display the charts
        JFrame chartFrame = new JFrame(reportType + " Report");
        chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Set layout manager to BorderLayout
        chartFrame.setLayout(new BorderLayout());

        // Add the chart panels to the JPanel
        chartFrame.add(barChartPanel, BorderLayout.WEST);
        chartFrame.add(lineChartPanel, BorderLayout.EAST);

        // Pack and center the frame on the screen
        chartFrame.pack();
        chartFrame.setLocationRelativeTo(null);
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

    private DefaultCategoryDataset createLineChartDataset(String reportType) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        int rowCount = jTable_Sales.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            String confirmation = jTable_Sales.getValueAt(i, 8).toString(); // Confirmation column index is 8
            String status = jTable_Sales.getValueAt(i, 11).toString(); // Status column index is 11

            if ("Work Done".equals(reportType) && "Approved".equals(confirmation) && "Closed Sale".equals(status)) {
                // For work done report, add data where confirmation is approved and status is closed sale
                String date = jTable_Sales.getValueAt(i, 2).toString(); // Date column index is 2
                double amount = parseAmount(jTable_Sales.getValueAt(i, 1).toString()); // Amount column index is 1
                dataset.addValue(amount, "Amount", date);
            } else if ("Approved".equals(reportType) && "Approved".equals(confirmation) && "In Progress".equals(status)) {
                // For approved report, add data where confirmation is approved and status is in progress
                String date = jTable_Sales.getValueAt(i, 2).toString(); // Date column index is 2
                double amount = parseAmount(jTable_Sales.getValueAt(i, 1).toString()); // Amount column index is 1
                dataset.addValue(amount, "Amount", date);
            } else if ("Closed Sale".equals(reportType) && "Rejected".equals(confirmation) && "Closed Sale".equals(status)) {
                // For closed sale report, add data where confirmation is rejected and status is closed sale
                String date = jTable_Sales.getValueAt(i, 2).toString(); // Date column index is 2
                double amount = parseAmount(jTable_Sales.getValueAt(i, 1).toString()); // Amount column index is 1
                dataset.addValue(amount, "Amount", date);
            }
        }

        return dataset;
    }

    private double parseAmount(String amountString) {
        // Remove "RM" prefix and parse the amount
        return Double.parseDouble(amountString.replace("RM", "").trim());
    }

    private JFreeChart createChart(DefaultCategoryDataset dataset, String reportType) {
        // Create Bar Chart for all report types
        JFreeChart chart = ChartFactory.createBarChart(
                reportType + " Bar Chart",
                "Product",
                "Amount Sold",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        return chart;
    }

    private JFreeChart createLineChart(DefaultCategoryDataset dataset, String reportType) {
        // Create Line Chart for all report types
        JFreeChart chart = ChartFactory.createLineChart(
                reportType + " Line Chart",
                "Date",
                "Sales Amount",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        return chart;
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
                Generate_Report generate = new Generate_Report(userID);
                generate.setVisible(true);
                generate.displaySales();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_generate;
    private javax.swing.JComboBox<String> jComboBox_ReportType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Sales;
    // End of variables declaration//GEN-END:variables
}
