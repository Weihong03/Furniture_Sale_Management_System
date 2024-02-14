/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package furniture_sale_ordering_management_system;

import furniture_sale_ordering_management_system.Shared_item.ModernScrollBarUI;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Wei Hong
 */
public class Notification extends javax.swing.JPanel {

    public Notification() {
        initComponents();
        setOpaque(false);
        initScrollBar();
    }

    private void initScrollBar() {
        JScrollBar sb = jScrollPane_scroll.getVerticalScrollBar();
        sb.setOpaque(false);
        sb.setForeground(new Color(33, 140, 206));
        sb.setPreferredSize(new java.awt.Dimension(8, 8));
        sb.setUI(new ModernScrollBarUI());
        jScrollPane_scroll.getViewport().setOpaque(false);
        jScrollPane_scroll.setViewportBorder(null);
        jPanel1.setLayout(new MigLayout("inset 0, fillx, wrap", "[fill]"));
        loadNoti("Data/Sales_Quotation.txt");
    }

    private void loadNoti(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Amount:")) {
                    String amount = line.substring(line.indexOf("RM")).replace(",", "");

                    // Move to the next line for Date
                    line = br.readLine();
                    String date = line.substring(line.indexOf(":") + 1).trim().replace(",", "");

                    // Skip the next four lines
                    for (int i = 0; i < 4; i++) {
                        br.readLine();
                    }

                    // Read the line for Salesperson
                    line = br.readLine();
                    String salesperson = line.substring(line.indexOf(":") + 1).trim().replace(",", "");

                    // Read the line for Confirmation status
                    line = br.readLine();
                    String confirmationStatus = line.substring(line.indexOf(":") + 1).trim().replace(",", "");

                    if ("Default".equals(confirmationStatus)) {
                        // Create Notification_Item and add it to jPanel1 with the ImageIcon
                        jPanel1.add(new Notification_Item(new ImageIcon(getClass().getResource("Images/no photo.jpg")), salesperson, "made a Sales Quotation!", date, amount));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your needs
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        int header = 10;
        AffineTransform tran = new AffineTransform();
        tran.translate(getWidth() - 25, 5);
        tran.rotate(Math.toRadians(45));
        Path2D p = new Path2D.Double(new RoundRectangle2D.Double(0, 0, 20, 20, 5, 5), tran);
        Area area = new Area(p);
        area.add(new Area(new RoundRectangle2D.Double(0, header, getWidth(), getHeight() - header, 10, 10)));
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane_scroll = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 10, 10, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 112, 112));
        jLabel1.setText("Notifications");

        jScrollPane_scroll.setBorder(null);
        jScrollPane_scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane_scroll.setPreferredSize(new java.awt.Dimension(308, 290));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jScrollPane_scroll.setViewportView(jPanel1);

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(35, 140, 206));
        jButton1.setText("Show All");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane_scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane_scroll;
    // End of variables declaration//GEN-END:variables
}
