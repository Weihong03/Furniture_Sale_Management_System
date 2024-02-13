package furniture_sale_ordering_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import table.TableCustom;

/**
 *
 * @author Wei Hong
 */
public class Generate_Invoice extends javax.swing.JFrame {

    private String userID;

    public Generate_Invoice(String userID) {
        this.userID = userID;

        initComponents();
        // Set the title of the window
        setTitle("Generate Invoice");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.WHITE);
        TableCustom.apply(jScrollPane1, TableCustom.TableType.MULTI_LINE);

        jTable_Salestable.getTableHeader().setFont(new java.awt.Font("", java.awt.Font.BOLD, 15));
        jTable_Salestable.setFont(new java.awt.Font("", java.awt.Font.BOLD, 10));

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Salestable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        button1 = new furniture_sale_ordering_management_system.progressindicator.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 680));

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("GENERATE INVOICE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(300, 300, 300))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
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

        button1.setText("Generate");
        button1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button1.setPreferredSize(new java.awt.Dimension(105, 36));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        String searchText = jTextField_search.getText();
        searchSales(searchText);
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        int[] selectedRows = jTable_Salestable.getSelectedRows();
        if (selectedRows.length > 0) {
            for (int selectedRowIndex : selectedRows) {
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
            }
        } else {
            // No row selected, display an error message or perform appropriate handling
            JOptionPane.showMessageDialog(this, "Please select at least one Sales to generate an invoice.");
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void generatePDFInvoice(String ID, String Amount, String Date, String Product,
            String ItemID, String Price, String Customer, String Salesperson, String Officer) {
        Document document = new Document();
        String fileName = "PDF/" + ID + "_Invoice.pdf"; // Include quotation ID in the file name

        try {
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
            // Add image logo
            try {
                Image logo = Image.getInstance("src/furniture_sale_ordering_management_system/Images/Companylogo.jpg");
                logo.scaleAbsolute(80, 80);
                document.add(logo);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error loading image.");
                return; // Return to avoid further processing if image loading fails
            }

            Font titleFont = new Font(Font.FontFamily.HELVETICA, 19, Font.BOLD);
            Font subtitleFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            Paragraph companyNameTitle = new Paragraph(" FurniHub Solutions", titleFont);
            document.add(companyNameTitle);
            // Add headertable
            try {
                PdfPTable headerTable = new PdfPTable(2); // 2 columns for image, company info, and date
                headerTable.setWidthPercentage(100);

                // Set the percentage widths for the columns
                float[] columnWidths = {65f, 45f};
                headerTable.setWidths(columnWidths);

                PdfPCell companyInfoCell = new PdfPCell();
                companyInfoCell.addElement(new Paragraph("""
                                           Endah Valley, Lot F99, Ground Floor,
                                           Leng Small, 1, Jalan 2/158e 
                                           Bandar Baru Sri Petaling, 57000 Kuala Lumpur
                                           019-547 8899 or furnihub123@gmail.com"""));
                companyInfoCell.setBorder(Rectangle.NO_BORDER);

                PdfPCell dateCell = new PdfPCell();
                dateCell.addElement(new Paragraph("Date: " + java.util.Calendar.getInstance().getTime()));
                dateCell.addElement(new Paragraph("Invoice: INV0001"));
                dateCell.setBorder(Rectangle.NO_BORDER);
                dateCell.setHorizontalAlignment(Element.ALIGN_LEFT);

                headerTable.addCell(companyInfoCell);
                headerTable.addCell(dateCell);

                document.add(headerTable);

                // Add a line separator
                document.add(new Paragraph(" "));
                document.add(new LineSeparator());
                document.add(new Paragraph(" "));

            } catch (DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error adding header to the invoice.");
                return;
            }

            Paragraph invoiceTitle = new Paragraph("INVOICE", titleFont);
            invoiceTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(invoiceTitle);
            document.add(new Paragraph(" "));

            // Add subheadertable
            try {
                PdfPTable subheaderTable = new PdfPTable(2); // 2 columns for subheader
                subheaderTable.setWidthPercentage(100);

                // Set the percentage widths for the columns
                float[] columnWidths = {70f, 30f};
                subheaderTable.setWidths(columnWidths);

                PdfPCell BilltoCell = new PdfPCell();
                Paragraph BilltoTitle = new Paragraph("Bill to: ", subtitleFont);
                BilltoCell.addElement(BilltoTitle);
                BilltoCell.addElement(new Paragraph("""
                                       Yoyo Furniture
                                       No. 1986, Jalan Sungai Besi Batu 13
                                       Kampung Baru Balakan
                                       57000 Cheras"""));
                BilltoCell.setBorder(Rectangle.NO_BORDER);

                PdfPCell ShiptoCell = new PdfPCell();
                Paragraph ShiptoTitle = new Paragraph("Ship to: ", subtitleFont);
                ShiptoCell.addElement(ShiptoTitle);
                ShiptoCell.addElement(new Paragraph("Customer: " + Customer));
                ShiptoCell.setBorder(Rectangle.NO_BORDER);
                ShiptoCell.setHorizontalAlignment(Element.ALIGN_LEFT);

                subheaderTable.addCell(BilltoCell);
                subheaderTable.addCell(ShiptoCell);

                document.add(subheaderTable);

            } catch (DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error adding header to the invoice.");
                return;
            }

            // Add details to the PDF
            document.add(new Paragraph(" "));
            Paragraph QuotationTitle = new Paragraph("Quotation", subtitleFont);
            document.add(QuotationTitle);

            // Add quotation table
            try {
                PdfPTable quoTitleTable = new PdfPTable(2); // 2 columns for subheader
                quoTitleTable.setWidthPercentage(100);

                // Set the percentage widths for the columns
                float[] columnWidths = {68f, 32f};
                quoTitleTable.setWidths(columnWidths);

                PdfPCell QuoIDCell = new PdfPCell();
                QuoIDCell.addElement(new Paragraph("Quotation ID: " + ID));
                QuoIDCell.setBorder(Rectangle.NO_BORDER);

                PdfPCell QuoDateCell = new PdfPCell();
                QuoDateCell.addElement(new Paragraph("Quotation Date: " + Date));
                QuoDateCell.setBorder(Rectangle.NO_BORDER);
                QuoDateCell.setHorizontalAlignment(Element.ALIGN_RIGHT);

                quoTitleTable.addCell(QuoIDCell);
                quoTitleTable.addCell(QuoDateCell);

                document.add(quoTitleTable);

            } catch (DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error adding header to the invoice.");
                return;
            }

            document.add(new Paragraph(" "));
            // Create a table for product details
            PdfPTable productTable = new PdfPTable(3);
            productTable.setWidthPercentage(100);

            // Set the percentage widths for the columns
            float[] columnWidths = {40f, 30f, 30f};
            productTable.setWidths(columnWidths);

            // Add table header
            Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.BLACK);

            PdfPCell headerCell1 = new PdfPCell(new Phrase("PRODUCT", headerFont));
            headerCell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell1.setBackgroundColor(new BaseColor(0xDD, 0xDD, 0xE5));
            headerCell1.setBorder(Rectangle.NO_BORDER);
            productTable.addCell(headerCell1);

            PdfPCell headerCell2 = new PdfPCell(new Phrase("ITEM ID", headerFont));
            headerCell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell2.setBackgroundColor(new BaseColor(0xDD, 0xDD, 0xE5));
            headerCell2.setBorder(Rectangle.NO_BORDER);
            productTable.addCell(headerCell2);

            PdfPCell headerCell3 = new PdfPCell(new Phrase("PRICE", headerFont));
            headerCell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            headerCell3.setBackgroundColor(new BaseColor(0xDD, 0xDD, 0xE5));
            headerCell3.setBorder(Rectangle.NO_BORDER);
            productTable.addCell(headerCell3);

            // Add table columns
            String[] productParts = Product.split("/");
            String[] itemIDParts = ItemID.split("/");
            String[] priceParts = Price.split("/");

            // Find the maximum number of parts among the three
            int maxParts = Math.max(Math.max(productParts.length, itemIDParts.length), priceParts.length);

            // Add cells for each part in the table
            for (int i = 0; i < maxParts; i++) {
                PdfPCell productCell = new PdfPCell(i < productParts.length ? new Phrase(productParts[i]) : new Phrase(" "));
                productCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                productCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                productCell.setBorder(Rectangle.NO_BORDER);
                productTable.addCell(productCell);

                PdfPCell itemIDCell = new PdfPCell(i < itemIDParts.length ? new Phrase(itemIDParts[i]) : new Phrase(" "));
                itemIDCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                itemIDCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                itemIDCell.setBorder(Rectangle.NO_BORDER);
                productTable.addCell(itemIDCell);

                PdfPCell priceCell = new PdfPCell(i < priceParts.length ? new Phrase(priceParts[i]) : new Phrase(" "));
                priceCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                priceCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                priceCell.setBorder(Rectangle.NO_BORDER);
                productTable.addCell(priceCell);
            }

            document.add(productTable);

            // Add a dashed line separator
            DottedLineSeparator dottedLine = new DottedLineSeparator();
            dottedLine.setOffset(-2); // Adjust the offset to control the gap between the dots
            document.add(new Chunk(dottedLine));
            document.add(new Paragraph(" "));

            // Add total amount row
            PdfPTable totalTable = new PdfPTable(3);
            totalTable.setWidthPercentage(100);
            totalTable.setWidths(columnWidths);

            // Add empty cells for PRODUCT and ITEM ID columns
            PdfPCell emptyCell = new PdfPCell(new Phrase(" "));
            emptyCell.setBorder(PdfPCell.NO_BORDER);
            totalTable.addCell(emptyCell);

            PdfPCell emptyCell2 = new PdfPCell(new Phrase(" "));
            emptyCell2.setBorder(PdfPCell.NO_BORDER);
            totalTable.addCell(emptyCell2);

            // Add the total amount in the PRICE column
            PdfPCell totalCell = new PdfPCell(new Phrase("Total: " + Amount));
            totalCell.setBorder(Rectangle.BOTTOM);
            totalCell.setBorderColorBottom(BaseColor.BLACK);  // Set color to black for visibility
            totalCell.setBorderWidthBottom(0.5f);
            totalTable.addCell(totalCell);

            document.add(totalTable);

            try {
                PdfPTable approveTable = new PdfPTable(2); // 2 columns for subheader
                approveTable.setWidthPercentage(100);

                // Set the percentage widths for the columns
                float[] columnsWidths = {68f, 32f};
                approveTable.setWidths(columnsWidths);

                PdfPCell SalesCell = new PdfPCell();
                SalesCell.addElement(new Paragraph("Quotation created by: " + Salesperson));
                SalesCell.setBorder(Rectangle.NO_BORDER);

                PdfPCell OfficerCell = new PdfPCell();
                OfficerCell.addElement(new Paragraph("Approved by: " + Officer));
                OfficerCell.setBorder(Rectangle.NO_BORDER);
                OfficerCell.setHorizontalAlignment(Element.ALIGN_RIGHT);

                approveTable.addCell(SalesCell);
                approveTable.addCell(OfficerCell);

                document.add(approveTable);

            } catch (DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error adding header to the invoice.");
                return;
            }

            // Add a thank you message
            document.newPage();
            document.add(new Paragraph("Terms and Conditions:", new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD)));
            document.add(new Paragraph("Payment is due within 7 days from the invoice date.", new Font(Font.FontFamily.HELVETICA, 12)));
            document.add(new Paragraph("Late payment may incur a 10% late fee.", new Font(Font.FontFamily.HELVETICA, 12)));
            document.add(new Paragraph("Please include the invoice number in your payment reference.", new Font(Font.FontFamily.HELVETICA, 12)));
            document.add(Chunk.NEWLINE); // Add a blank line

            document.add(new Paragraph("Disclaimer:", new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD)));
            document.add(new Paragraph("All services and products provided by Yoyo Furniture are subject to the terms and conditions outlined in our agreements and contracts.", new Font(Font.FontFamily.HELVETICA, 12)));
            document.add(new Paragraph("While we make every effort to ensure the accuracy and completeness of the information presented in this invoice, Yoyo Furniture disclaims any liability for errors or omissions.", new Font(Font.FontFamily.HELVETICA, 12)));
            document.add(Chunk.NEWLINE);

            document.add(new Paragraph("Any views or opinions presented in this communication are solely those of Yoyo Furniture and do not necessarily represent those of any third party.", new Font(Font.FontFamily.HELVETICA, 12)));
            document.add(new Paragraph("Yoyo Furniture is not responsible for any damage or loss arising from reliance on information contained in this invoice.", new Font(Font.FontFamily.HELVETICA, 12)));
            document.add(Chunk.NEWLINE);

            document.add(new Paragraph("Thank you for your understanding and cooperation.", new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD)));
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);

            Paragraph thankYou = new Paragraph("""
                                                THANK YOU FOR CHOOSING YOYO FURNITURE
                                                WE APPRECIATE YOUR BUSINESS""", new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD));
            thankYou.setAlignment(Element.ALIGN_CENTER);
            document.add(thankYou);

            document.close();

            // Update the invoice status to "Yes" in the text file
            updateInvoiceStatus(ID);
            displaySales();

            JOptionPane.showMessageDialog(this, "Invoice generated successfully.");
            // Open the generated PDF
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(new File(fileName));
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error opening the generated PDF.");
                }
            }
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error generating or creating invoice file. Please check the file path.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error writing to the file.");
        }
    }

    private void updateInvoiceStatus(String invoiceID) throws IOException {
        // Read the content of the text file
        Path filePath = Paths.get("Data/Sales_Quotation.txt");
        List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);

        // Iterate through the lines to find and update the status for the given invoice ID
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.startsWith("ID: " + invoiceID)) {
                // Replace the existing "Invoice: Default" line with "Invoice: Yes"
                lines.set(i + 10, "Invoice: Yes,");
                break;
            }
        }

        // Write the updated content back to the text file
        Files.write(filePath, lines, StandardCharsets.UTF_8);
    }

    public void searchSales(String searchText) {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable_Salestable.getModel());
        jTable_Salestable.setRowSorter(rowSorter);

        RowFilter<TableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
        rowSorter.setRowFilter(rowFilter);
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
    private furniture_sale_ordering_management_system.progressindicator.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Salestable;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
