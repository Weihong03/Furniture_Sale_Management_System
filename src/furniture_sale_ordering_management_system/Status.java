/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package furniture_sale_ordering_management_system;

import furniture_sale_ordering_management_system.Shared_item.glasspanepopup.GlassPanePopup;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Workstation
 */
public class Status extends javax.swing.JPanel {

    /**
     * Creates new form Status
     */
    public Status() {
        initComponents();
        setBackground(Color.WHITE);
        setOpaque(false);

        Component[] components = new Component[]{new Step(1), new Step(2), new Step(3), new Step(4)};
        panelSlider.setSliderComponent(components);
        progressIndicator.initSlider(panelSlider);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10));
        g2.dispose();
        super.paintComponent(grphcs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressIndicator = new furniture_sale_ordering_management_system.progressindicator.ProgressIndicator();
        button_Next = new furniture_sale_ordering_management_system.progressindicator.Button();
        panelSlider = new furniture_sale_ordering_management_system.progressindicator.PanelSlider();
        button_Done = new furniture_sale_ordering_management_system.progressindicator.Button();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 240, 218));
        setPreferredSize(new java.awt.Dimension(800, 260));

        progressIndicator.setBackground(new java.awt.Color(238, 240, 218));
        progressIndicator.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Assembly", "Testing", "Quality Check", "Work Done" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        progressIndicator.setOpaque(false);
        progressIndicator.setProgress(0.0F);
        progressIndicator.setProgressColor(new java.awt.Color(51, 255, 51));
        progressIndicator.setProgressColorGradient(new java.awt.Color(255, 51, 51));

        button_Next.setText("Next");
        button_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_NextActionPerformed(evt);
            }
        });

        panelSlider.setBackground(new java.awt.Color(238, 240, 218));
        panelSlider.setOpaque(false);

        javax.swing.GroupLayout panelSliderLayout = new javax.swing.GroupLayout(panelSlider);
        panelSlider.setLayout(panelSliderLayout);
        panelSliderLayout.setHorizontalGroup(
            panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelSliderLayout.setVerticalGroup(
            panelSliderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        button_Done.setText("Done");
        button_Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_DoneActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Status Changing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progressIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(button_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(button_Done, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 294, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(progressIndicator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Done, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_NextActionPerformed
        progressIndicator.next();
    }//GEN-LAST:event_button_NextActionPerformed

    private void button_DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_DoneActionPerformed
        GlassPanePopup.closePopupAll();
    }//GEN-LAST:event_button_DoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_Done;
    private furniture_sale_ordering_management_system.progressindicator.Button button_Next;
    private javax.swing.JLabel jLabel1;
    private furniture_sale_ordering_management_system.progressindicator.PanelSlider panelSlider;
    private furniture_sale_ordering_management_system.progressindicator.ProgressIndicator progressIndicator;
    // End of variables declaration//GEN-END:variables
}
