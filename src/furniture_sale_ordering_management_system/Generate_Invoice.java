package furniture_sale_ordering_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Wei Hong
 */
public class Generate_Invoice extends javax.swing.JFrame {

    private String userID;

    /**
     * Creates new form ManageBooking
     */
    public Generate_Invoice(String userID) {
        this.userID = userID;

        initComponents();
        // Set the title of the window
        setTitle("Generate Invoice");

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

    private Generate_Invoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Salestable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jButton_generate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 224, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("GENERATE INVOICE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(167, 167, 167))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jButton_back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/back.png"))); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jTable_Salestable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable_Salestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amount", "Date", "Product", "Item ID", "Price", "Customer", "Salesperson", "Confirmation", "Confirmed by", "Invoice Generated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        jButton_generate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_generate.setText("Generate");
        jButton_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_back)
                        .addGap(0, 686, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 545, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jButton_generate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_generate)
                .addGap(12, 12, 12)
                .addComponent(jButton_back)
                .addGap(186, 186, 186))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Officer_Home home = new Officer_Home(userID);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        String searchText = jTextField_search.getText();
        searchSales(searchText);
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void jButton_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_generateActionPerformed
        int selectedRowIndex = jTable_Salestable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            // Get the values from the selected row
            String ID = jTable_Salestable.getValueAt(selectedRowIndex, 0).toString();
            String Amount = jTable_Salestable.getValueAt(selectedRowIndex, 1).toString();
            String Date = jTable_Salestable.getValueAt(selectedRowIndex, 2).toString();
            String Product = jTable_Salestable.getValueAt(selectedRowIndex, 3).toString();
            String ItemID = jTable_Salestable.getValueAt(selectedRowIndex, 4).toString();
            String Price = jTable_Salestable.getValueAt(selectedRowIndex, 5).toString();
            String Customer = jTable_Salestable.getValueAt(selectedRowIndex, 6).toString();
            String Salesperson = jTable_Salestable.getValueAt(selectedRowIndex, 7).toString();
            String Officer = jTable_Salestable.getValueAt(selectedRowIndex, 9).toString();

            // Generate PDF invoice
            generatePDFInvoice(ID, Amount, Date, Product, ItemID, Price, Customer, Salesperson, Officer);
        } else {
            // No row selected, display an error message or perform appropriate handling
            JOptionPane.showMessageDialog(this, "Please select a Sales to modify.");
        }
    }//GEN-LAST:event_jButton_generateActionPerformed

    private void generatePDFInvoice(String ID, String Amount, String Date, String Product,
            String ItemID, String Price, String Customer, String Salesperson, String Officer) {
        Document document = new Document();

        try {
            String fileName = "PDF/" + ID + "_Invoice.pdf"; // Include quotation ID in the file name
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            // Add image logo
            try {
                Image logo = Image.getInstance("src/furniture_sale_ordering_management_system/Images/Companylogo.jpg");
                logo.scaleAbsolute(100, 100);
                document.add(logo);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading image.");
                return; // Return to avoid further processing if image loading fails
            }

            // Add details to the PDF
            document.add(new Paragraph("FurniHub Solutions"));
            document.add(new Paragraph("""
                                       
                                       Endah Valley, Lot F99, Ground Floor, Leng Small, 1, Jalan 2/158e
                                       Bandar Baru Sri Petaling, 57000 Kuala Lumpur
                                       019-547 8899, furnihub123@gmail.com"""));
            document.add(new Paragraph("Date: " + java.util.Calendar.getInstance().getTime()));
            document.add(new Paragraph("Invoice: INV0001"));

            // Add a line separator
            document.add(new LineSeparator());

            document.add(new Paragraph("INVOICE"));
            document.add(new Paragraph("""
                                       Bill to:
                                       
                                       Yoyo Furniture
                                       No. 1986, Jalan Sungai Besi Batu 13
                                       Kampung Baru Balakan
                                       57000 Cheras"""));
            document.add(new Paragraph("""
                                       Ship to:
                                       
                                       Customer: """ + Customer));
            document.add(new Paragraph("""
                                       Quotation
                                       
                                       Quotation ID: """ + ID));
            document.add(new Paragraph("Quotation Date: " + Date));
            document.add(new Paragraph("PRODUCT"));
            document.add(new Paragraph("ITEM ID"));
            document.add(new Paragraph("PRICE"));
            document.add(new Paragraph(Product));
            document.add(new Paragraph(ItemID));
            document.add(new Paragraph(Price));
            document.add(new Paragraph("Total: " + Amount));
            document.add(new Paragraph("Quotation created by: " + Salesperson));
            document.add(new Paragraph("Approved by: " + Officer));
            // Add more details based on your requirements

            // Add a line separator
            document.add(new LineSeparator());

            // Add a thank you message
            document.add(new Paragraph("""
                                       Terms and Conditions:
                                       
                                       - Payment is due within 7 days from the invoice date.
                                       - Late payment may incur a 10% late fee.
                                       - Please include the invoice number in your payment reference."""));
            document.add(new Paragraph("""
                                       Disclaimer:
                                       
                                       All services and products provided by Yoyo Furniture are subject to the terms and conditions outlined in our agreements and contracts. 
                                       While we make every effort to ensure the accuracy and completeness of the information presented in this invoice, Yoyo Furniture disclaims any liability for errors or omissions.
        
                                       Any views or opinions presented in this communication are solely those of Yoyo Furniture and do not necessarily represent those of any third party. Yoyo Furniture is not responsible for any damage or loss arising from reliance on information contained in this invoice.
                                                                              
                                       Thank you for your understanding and cooperation."""));
            document.add(new Paragraph("""
                                       THANK YOU FOR CHOOSING YOYO FURNITURE
                                       WE APPRECIATE YOUR BUSINESS"""));

            document.close();

            JOptionPane.showMessageDialog(this, "Invoice generated successfully.");
            // Open the generated PDF
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error opening the generated PDF.");
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error generating invoice.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error creating file. Please check the file path.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error writing to the file.");
        }
    }

    public void searchSales(String searchText) {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable_Salestable.getModel());
        jTable_Salestable.setRowSorter(rowSorter);

        RowFilter<TableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
        rowSorter.setRowFilter(rowFilter);
    }

    private void refreshTable() {
        // Clear the existing data from the table
        DefaultTableModel model = (DefaultTableModel) jTable_Salestable.getModel();
        model.setRowCount(0);

        dispose();
        Sale_Approval saleApproval = new Sale_Approval(userID);
        saleApproval.setVisible(true);
        saleApproval.displaySales(); // Call the method to display the Sales

        jTable_Salestable.revalidate();
        jTable_Salestable.repaint();
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
            java.util.logging.Logger.getLogger(Generate_Invoice.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generate_Invoice.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generate_Invoice.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generate_Invoice.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Generate_Invoice invoice = new Generate_Invoice();
                invoice.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Salestable;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
