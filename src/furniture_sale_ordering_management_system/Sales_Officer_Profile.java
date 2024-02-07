package furniture_sale_ordering_management_system;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Acer
 */
public class Sales_Officer_Profile extends javax.swing.JFrame {

    public static String userID;
    public static String userData;
    private String selectedFilePath;

    private static final String BOOKING_FILE_PATH = "Data/Officer_Salesperson.txt";

    public void setInitialValues(String userID) {
        jTextField_ID.setText(userID);
    }

    public void setInitialValuesFromUserID(String userID) {
        // Read the existing content from the text file
        String filePath = "Data/Officer_Salesperson.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Find the starting index of the user's information
            int startIndex = content.indexOf("ID: " + userID);

            // If the user with the specified ID is found
            if (startIndex != -1) {
                // Find the ending index of the user's information
                int endIndex = content.indexOf("ID:", startIndex + 1);
                if (endIndex == -1) {
                    endIndex = content.length();
                }

                // Extract the user's information
                userData = content.substring(startIndex, endIndex);

                // Split the user's information into lines
                String[] lines = userData.split("\n");

                // Extract and set the values
                for (String lineData : lines) {
                    String[] parts = lineData.split(": ");
                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();

                        switch (key) {
                            case "Username":
                                value = value.replaceAll(",", "");
                                jTextField_Username.setText(value);
                                break;
                            case "Password":
                                value = value.replaceAll(",", "");
                                jTextField_Password.setText(value);
                                break;
                            case "Name":
                                value = value.replaceAll(",", "");
                                jTextField_FullName.setText(value);
                                break;
                            case "Age":
                                // Check and clean up the age value
                                value = value.replaceAll(",", "");
                                try {
                                    int age = Integer.parseInt(value);
                                    jComboBox_Age.setSelectedItem(String.valueOf(age));
                                } catch (NumberFormatException e) {
                                    // Handle the exception or log an error message
                                    e.printStackTrace();
                                }
                                break;
                            case "Email":
                                value = value.replaceAll(",", "");
                                jTextField_Email.setText(value);
                                break;
                            case "Phone Number":
                                value = value.replaceAll(",", "");
                                jTextField_PhoneNumber.setText(value);
                                break;
                            case "Role":
                                value = value.replaceAll(",", "");
                                jTextField_Role.setText(value);
                                break;
                        }
                    }
                }
            } else {
                // User not found
                JOptionPane.showMessageDialog(null, "User with ID " + userID + " not found.");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your application's requirements
        }
    }

    public void setIconFromFile(String BOOKING_FILE_PATH) {
        String imagePath = readFilePathFromFile(BOOKING_FILE_PATH, userID);

        // Set the icon for jLabel1
        if (!imagePath.isEmpty()) {
            try {
                URL imageUrl = new File(imagePath).toURI().toURL();
                ImageIcon icon = new ImageIcon(imageUrl);
                Image image = icon.getImage().getScaledInstance(226, 226, Image.SCALE_DEFAULT);
                ImageIcon scaledIcon = new ImageIcon(image);
                jLabel_icon.setIcon(scaledIcon);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    private String readFilePathFromFile(String BOOKING_FILE_PATH, String userID) {
        try (BufferedReader reader = new BufferedReader(new FileReader(BOOKING_FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the line starts with the expected field
                if (line.startsWith("ID: " + userID)) {
                    // Extract filepath information
                    while ((line = reader.readLine()) != null) {
                        if (line.startsWith("Filepath: ")) {
                            String imagePath = line.substring("Filepath: ".length()).trim();
                            return imagePath;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public Sales_Officer_Profile(String userID) {
        this.userID = userID;
        initComponents();

        jComboBox_Age.setModel(new DefaultComboBoxModel<>(generateAgeOptions()));
        // For Role JComboBox

        // Set the title of the window
        setTitle("Sales_Officer_Profile");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Password = new javax.swing.JTextField();
        jTextField_FullName = new javax.swing.JTextField();
        jComboBox_Age = new javax.swing.JComboBox<>();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Role = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel_icon = new javax.swing.JLabel();
        jButton_change = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        button_Update = new furniture_sale_ordering_management_system.progressindicator.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1050, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 240, 218));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 680));

        jTextField_ID.setEditable(false);

        jTextField_Username.setEditable(false);

        jTextField_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FullNameActionPerformed(evt);
            }
        });

        jComboBox_Age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AgeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("ID :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Age :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Username :");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Phone Number :");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Password :");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Role :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Full Name :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Email :");

        jTextField_Role.setEditable(false);

        jLabel_icon.setForeground(new java.awt.Color(255, 255, 0));
        jLabel_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/profile picture1.jpg"))); // NOI18N
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

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Profile Picture");

        button_Update.setText("Update");
        button_Update.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_UpdateActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("REPORT GENERATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(70, 70, 70)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel8))
                                    .addGap(56, 56, 56)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_Password)
                                        .addComponent(jTextField_FullName)
                                        .addComponent(jComboBox_Age, 0, 290, Short.MAX_VALUE)
                                        .addComponent(jTextField_PhoneNumber)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(80, 80, 80)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel2)))
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_ID)
                                        .addComponent(jTextField_Username)))
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(368, 368, 368)))
                                    .addComponent(button_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_icon)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addGap(47, 47, 47)))
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_change)
                                .addGap(120, 120, 120))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jTextField_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(949, 949, 949)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel10))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jComboBox_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_icon)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_change))
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_Role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(button_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jComboBox_Age.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FullNameActionPerformed

    private void jComboBox_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_AgeActionPerformed

    private void jLabel_iconAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel_iconAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_iconAncestorAdded

    private void jButton_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_changeActionPerformed
        JFileChooser fileChooser = new JFileChooser("src/furniture_sale_ordering_management_system/Images");

        // Set the file filter to only allow image files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        // Show the file chooser dialog
        int result = fileChooser.showOpenDialog(this);

        // Check if the user selected a file
        if (result == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            File selectedFile = fileChooser.getSelectedFile();

            // Display the selected file path
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());

            // Save the selected file path
            selectedFilePath = selectedFile.getAbsolutePath();

            try {
                // Convert the File to URL
                URL imageUrl = selectedFile.toURI().toURL();

                // Create ImageIcon from URL
                ImageIcon icon = new ImageIcon(imageUrl);

                // Scale the image
                Image image = icon.getImage().getScaledInstance(226, 226, Image.SCALE_DEFAULT);
                ImageIcon scaledIcon = new ImageIcon(image);

                // Set the JLabel icon using the scaled ImageIcon
                jLabel_icon.setIcon(scaledIcon);

            } catch (MalformedURLException ex) {
                // Handle exception (e.g., print error message or show a dialog)
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton_changeActionPerformed

    private void button_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_UpdateActionPerformed
        if (userData == null) {
            JOptionPane.showMessageDialog(null, "User data not loaded. Call setInitialValuesFromUserID first.");
            return;
        }

        String filePath = "Data/Officer_Salesperson.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            int startIndex = content.indexOf("ID: " + userID);

            if (startIndex != -1) {
                int endIndex = content.indexOf("ID:", startIndex + 1);
                if (endIndex == -1) {
                    endIndex = content.length();
                }

                String[] lines = userData.split("\n");

                for (String lineData : lines) {
                    String[] parts = lineData.split(": ");
                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        String value = parts[1].trim();
                        switch (key) {
                            case "Username":
                                lines[1] = "Username: " + jTextField_Username.getText().trim() + ",";
                                break;
                            case "Password":
                                lines[2] = "Password: " + jTextField_Password.getText().trim() + ",";
                                break;
                            case "Name":
                                String newName = jTextField_FullName.getText().trim();
                                if (!isValidName(newName)) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid name.");
                                return;
                            }
                                lines[3] = "Name: " + jTextField_FullName.getText().trim() + ",";
                                break;
                            case "Age":
                                lines[4] = "Age: " + jComboBox_Age.getSelectedItem().toString().trim() + ",";
                                break;
                            case "Email":
                                  String newEmail = jTextField_Email.getText().trim();
                            if (!isValidEmail(newEmail)) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
                                return;
                            }
                                lines[5] = "Email: " + jTextField_Email.getText().trim() + ",";
                                break;
                            case "Phone Number":
                                  String newPhoneNumber = jTextField_PhoneNumber.getText().trim();
                            if (!isValidPhoneNumber(newPhoneNumber)) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid phone number.");
                                return;
                            }
                                lines[6] = "Phone Number: " + jTextField_PhoneNumber.getText().trim() + ",";
                                break;
                            case "Role":
                                lines[7] = "Role: " + jTextField_Role.getText().trim() + ",";
                                break;
                            case "Filepath":
                                if (selectedFilePath != null) {
                                    String relativePath = selectedFilePath.replaceFirst(".*?src", "src").replace("\\", "/");
                                    lines[8] = "Filepath: " + relativePath.trim();
                                } else {
                                    // Handle the case where selectedFilePath is null
                                    lines[8] = "Filepath: " + value; // or provide a default value
                                }
                                break;
                        }
                    }
                }

                // Update the content with modified user data
                content.insert(startIndex, "\n");
                content.insert(endIndex, "\n");
                content.replace(startIndex, endIndex, String.join("\n", lines));

                // Save the updated content to the file
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                    writer.write(content.toString());
                    JOptionPane.showMessageDialog(null, "Content successfully updated!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "User with ID " + userID + " not found.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
private boolean isValidName(String name) {
    // Use regular expression to check if the name contains only alphabetic characters
    return !name.isEmpty() && name.matches("[a-zA-Z ]+") && name.length() >= 2;
}

// Method to validate email address
private boolean isValidEmail(String email) {
    // You can implement your email validation logic here
    // For simplicity, let's assume any non-empty string with '@' is valid
    return !email.isEmpty() && email.contains("@");
}

// Method to validate phone number
private boolean isValidPhoneNumber(String phoneNumber) {
    // You can implement your phone number validation logic here
    // For simplicity, let's assume any non-empty string with digits is valid
    return !phoneNumber.isEmpty() && phoneNumber.matches("\\d+");
    }//GEN-LAST:event_button_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Sales_Officer_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Officer_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Officer_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Officer_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                Sales_Officer_Profile salesOfficerProfile = new Sales_Officer_Profile(userID);
                salesOfficerProfile.setIconFromFile(BOOKING_FILE_PATH);
                salesOfficerProfile.setVisible(true);
                salesOfficerProfile.setInitialValuesFromUserID(userID);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_Update;
    private javax.swing.JButton jButton_change;
    private javax.swing.JComboBox<String> jComboBox_Age;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FullName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private javax.swing.JTextField jTextField_Role;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables

}
