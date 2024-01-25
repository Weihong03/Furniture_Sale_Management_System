package furniture_sale_ordering_management_system;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Wei Hong
 */
public class Build_Profile extends javax.swing.JFrame {

    private String username;
    private final String password;

    public Build_Profile(String username, String password) {
        this.username = username;
        this.password = password;

        initComponents();

        // Set the received username and password in the UI
        jTextField_username.setText(username);
        jPasswordField_password.setText(password);

        // Make username and password fields uneditable
        jTextField_username.setEditable(false);
        jPasswordField_password.setEditable(false);

        // For Age JComboBox
        jComboBox_age.setModel(new DefaultComboBoxModel<>(generateAgeOptions()));
        // For Role JComboBox
        jComboBox_role.setModel(new DefaultComboBoxModel<>(new String[]{"Officer", "Salesperson"}));

        // Set the title of the window
        setTitle("Build Your Profile");

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

    private Build_Profile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

// Method to generate age options from 18 to 60
    private String[] generateAgeOptions() {
        int startAge = 18;
        int endAge = 60;
        int numberOfOptions = endAge - startAge + 1;

        String[] ageOptions = new String[numberOfOptions];

        for (int i = 0; i < numberOfOptions; i++) {
            ageOptions[i] = String.valueOf(startAge + i);
        }
        return ageOptions;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_name = new javax.swing.JLabel();
        jLabel_age = new javax.swing.JLabel();
        jLabel_phonenumber = new javax.swing.JLabel();
        jLabel_role = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextField_phonenumber = new javax.swing.JTextField();
        jLabel_email = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jButton_proceed = new javax.swing.JButton();
        jComboBox_role = new javax.swing.JComboBox<>();
        jComboBox_age = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel_icon = new javax.swing.JLabel();
        jButton_change = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_name.setText("Name :");

        jLabel_age.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_age.setText("Age :");

        jLabel_phonenumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_phonenumber.setText("Phone Number :");

        jLabel_role.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_role.setText("Role :");

        jTextField_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });

        jTextField_phonenumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_phonenumberActionPerformed(evt);
            }
        });

        jLabel_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_email.setText("Email :");

        jTextField_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });

        jButton_proceed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_proceed.setText("Proceed");
        jButton_proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_proceedActionPerformed(evt);
            }
        });

        jComboBox_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_roleActionPerformed(evt);
            }
        });

        jComboBox_age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Password :");

        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        jPasswordField_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passwordActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Profile Picture");

        jLabel_icon.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/no photo.jpg"))); // NOI18N
        jLabel_icon.setToolTipText("");
        jLabel_icon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_icon.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel_iconAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton_change.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/change profile.png"))); // NOI18N
        jButton_change.setText("Change");
        jButton_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_changeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_name)
                            .addComponent(jLabel_age)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_name)
                            .addComponent(jTextField_username)
                            .addComponent(jPasswordField_password)
                            .addComponent(jComboBox_age, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_phonenumber)
                                    .addComponent(jLabel_email, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_role))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_phonenumber)
                                    .addComponent(jTextField_email)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBox_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jButton_proceed)))
                        .addGap(81, 81, 81)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton_change)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_icon)
                                .addGap(61, 61, 61))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_change))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_name)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_age)
                            .addComponent(jComboBox_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_email)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_phonenumber)
                            .addComponent(jTextField_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_role)
                            .addComponent(jComboBox_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_proceed)))
                .addContainerGap(187, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jTextField_phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_phonenumberActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jButton_proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_proceedActionPerformed
        // Validate and get user inputs
        String idPrefix = (jComboBox_role.getSelectedItem().toString().equals("Officer")) ? "O" : "S";
        String id = generateUserID(idPrefix);
        String name = jTextField_name.getText();
        String age = jComboBox_age.getSelectedItem().toString();
        String email = jTextField_email.getText();
        String phoneNumber = jTextField_phonenumber.getText();
        String role = jComboBox_role.getSelectedItem().toString();

        // Validate and save to file
        if (validateInputs(name, email, phoneNumber)) {
            // Validate and save image to file
            ImageIcon icon = (ImageIcon) jLabel_icon.getIcon();
            if (icon != null) {
                String imagePath = saveImageToFile(icon, id);
                saveToFile(id, username, password, name, age, email, phoneNumber, role, imagePath);

                // Display a success message
                JOptionPane.showMessageDialog(this, "Profile successfully created!", "Success", JOptionPane.INFORMATION_MESSAGE);
                Login login = new Login();
                login.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Please select an image.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_proceedActionPerformed
    private String saveImageToFile(ImageIcon icon, String id) {
        String imageFileName = id + "_profile_image.png";
        String imagePath = "src/furniture_sale_ordering_management_system/Images/" + imageFileName;

        // Save image to the specified location
        try {
            Files.copy(iconToInputStream(icon), new File(imagePath).toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving image.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return imagePath;
    }

    // Convert ImageIcon to InputStream
    private InputStream iconToInputStream(ImageIcon icon) {
        BufferedImage bufferedImage = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB
        );

        Graphics2D g = bufferedImage.createGraphics();
        g.drawImage(icon.getImage(), 0, 0, null);
        g.dispose();

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ImageIO.write(bufferedImage, "png", os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ByteArrayInputStream(os.toByteArray());
    }
    private void jComboBox_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_roleActionPerformed

    }//GEN-LAST:event_jComboBox_roleActionPerformed

    private void jComboBox_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_ageActionPerformed

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jPasswordField_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passwordActionPerformed

    private void jLabel_iconAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel_iconAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_iconAncestorAdded

    private void jButton_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_changeActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Set the file filter to only allow image files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

            // Scale the image
            Image image = icon.getImage().getScaledInstance(226, 226, Image.SCALE_DEFAULT);
            ImageIcon scaledIcon = new ImageIcon(image);
            jLabel_icon.setIcon(scaledIcon);
        }

    }//GEN-LAST:event_jButton_changeActionPerformed

    private String generateUserID(String idPrefix) {
        int latestID = getLatestUserID(idPrefix);
        latestID++;
        return String.format("%s%03d", idPrefix, latestID);
    }

    // Additional method to get the latest user ID for a given role
    private int getLatestUserID(String idPrefix) {
        int latestID = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("Data/Officer_Salesperson.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("ID: " + idPrefix)) {
                    // Extract the numeric part of the ID
                    int idNumber = Integer.parseInt(line.substring(4 + idPrefix.length(), line.indexOf(',')));
                    latestID = Math.max(latestID, idNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return latestID;
    }

    // Validate user inputs
    private boolean validateInputs(String name, String email, String phoneNumber) {
        if (name.isEmpty() || email.isEmpty() || phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Save details into file
    private void saveToFile(String id, String username, String password, String name, String age, String email, String phoneNumber, String role, String imagePath) {
        try (FileWriter writer = new FileWriter("Data/Officer_Salesperson.txt", true)) {
            // Format the details and write to the file
            String userDetails = String.format("\nID: %s,\nUsername: %s,\nPassword: %s,\nName: %s,\nAge: %s,\nEmail: %s,\nPhone Number: %s,\nRole: %s,\nFilepath: %s%n",
                    id, username, password, name, age, email, phoneNumber, role, imagePath);

            writer.write(userDetails);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving user details.", "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Build_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Build_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Build_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Build_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Build_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_change;
    private javax.swing.JButton jButton_proceed;
    private javax.swing.JComboBox<String> jComboBox_age;
    private javax.swing.JComboBox<String> jComboBox_role;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_age;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_phonenumber;
    private javax.swing.JLabel jLabel_role;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_phonenumber;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
