/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package furniture_sale_ordering_management_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author yuw18
 */
public class Admin_Logbook extends javax.swing.JFrame {

    private DefaultTableModel logbookTableModel;
    public static String event;
    public static String userID;

    /**
     * Creates new form Admin_Logbook
     */
    public Admin_Logbook(String userID) {
        this.userID = userID;
        initComponents();
        initLogbookTable();
    }

    private void initLogbookTable() {
        // Initialize the table model
        logbookTableModel = new DefaultTableModel();
        logbookTableModel.addColumn("Admin");
        logbookTableModel.addColumn("Timestamp");
        logbookTableModel.addColumn("Event");
        // Set the table model to the jTable_logbook
        jTable_logbook.setModel(logbookTableModel);
        TableColumnModel columnModel = jTable_logbook.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30); // Adjust the value as needed
        columnModel.getColumn(1).setPreferredWidth(70); // Adjust the value as needed
        columnModel.getColumn(2).setPreferredWidth(400); // Adjust the value as needed

        loadLogEntriesFromFile();
    }

    // Function to add log entries to the admin logbook
    // Function to add log entries to the admin logbook
    public void addLogEntry(String userID, String event) {
        // Get the current timestamp
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        // Write log entry to file
        writeLogEntryToFile(userID, timestamp, event);
    }

    public void loadLogEntriesFromFile() {
        DefaultTableModel model = (DefaultTableModel) jTable_logbook.getModel();
        model.setRowCount(0); // Clear existing data

        try (BufferedReader br = new BufferedReader(new FileReader("Data/logbook.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replace(";", " ");
                if (line.startsWith("User ID: ")) {
                    String[] rowData = new String[3];
                    rowData[0] = line.substring(9); // Extract username value

                    line = br.readLine();
                    line = line.replace(";", " ");                    
                    if (line != null && line.startsWith("Timestamp: ")) {
                        String[] timestampParts = line.split(": ", 2);
                        if (timestampParts.length == 2) {
                            rowData[1] = timestampParts[1].trim();
                        } else {
                            // Handle unexpected timestamp line format
                            rowData[1] = " ";
                        }

                        line = br.readLine();
                        line = line.replace(";", " "); 
                        if (line != null && line.startsWith("Event: ")) {
                            String[] eventParts = line.split(": ", 2);
                            if (eventParts.length == 2) {
                                rowData[2] = eventParts[1].trim();
                            } else {
                                // Handle unexpected event line format
                                rowData[2] = " ";
                            }

                            model.addRow(rowData);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace to identify the issue
            JOptionPane.showMessageDialog(this, "Error reading the file: " + e.getMessage());
        }
    }

    private void writeLogEntryToFile(String userID, String timestamp, String event) {
        if (userID != null && event != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/logbook.txt", true))) {
                // Append the log entry to the file in the specified format
                writer.write("User ID: " + userID + ";\n");
                writer.write("Timestamp: " + timestamp + ";\n");
                writer.write("Event: " + event + ";\n\n"); // Add extra line for separation between entries
            } catch (IOException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_logbook = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(1050, 680));
        setPreferredSize(new java.awt.Dimension(1050, 680));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 680));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));

        jTable_logbook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_logbook);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Admin_Logbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Logbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Logbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Logbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin_Logbook adminLogbook = new Admin_Logbook(userID);
                adminLogbook.addLogEntry(userID, event);
                adminLogbook.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_logbook;
    // End of variables declaration//GEN-END:variables
}
