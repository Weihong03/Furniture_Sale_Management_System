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
public class Admin_Profile extends javax.swing.JFrame {

    public String userID;
    public String Username;
    public String Password;
    public String Name;
    public int Age;
    public String Email;
    public String PhoneNumber;
    public String Role;
    public static String userData;
    private String selectedFilePath;

    private static final String BOOKING_FILE_PATH = "Data/Admin.txt";

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

    public void setInitialValues(String userID) {
        jTextField_ID.setText(userID);
    }

    public void setInitialValuesFromUserID(String userID) {
        // Read the existing content from the text file
        String filePath = "Data/Admin.txt";
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
                                jTextField_role.setText(value);
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
     * Creates new form Administrator
     *
     * @param userID
     */
    public Admin_Profile(String userID) {
        this.userID = userID;
        initComponents();

        jComboBox_Age.setModel(new DefaultComboBoxModel<>(generateAgeOptions()));
        // For Role JComboBox
        jTextField_role.setEditable(false);
        jTextField_ID.setEditable(false);
        // Set the title of the window
        setTitle("Manage Personal Profile");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Admin_Profile() {
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

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Password = new javax.swing.JTextField();
        jTextField_FullName = new javax.swing.JTextField();
        jComboBox_Age = new javax.swing.JComboBox<>();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_role = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        button_update = new furniture_sale_ordering_management_system.progressindicator.Button();
        jLabel11 = new javax.swing.JLabel();
        jLabel_icon = new javax.swing.JLabel();
        jButton_change = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1050, 680));

        jPanel2.setBackground(new java.awt.Color(238, 240, 218));
        jPanel2.setMaximumSize(new java.awt.Dimension(1050, 680));
        jPanel2.setPreferredSize(new java.awt.Dimension(1050, 680));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Administrator Personal Profile");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("ID :");

        jTextField_ID.setEditable(false);
        jTextField_ID.setPreferredSize(new java.awt.Dimension(80, 25));
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_Username.setEditable(false);
        jTextField_Username.setPreferredSize(new java.awt.Dimension(80, 25));
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jTextField_Password.setPreferredSize(new java.awt.Dimension(80, 25));

        jTextField_FullName.setPreferredSize(new java.awt.Dimension(80, 25));

        jComboBox_Age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Age.setPreferredSize(new java.awt.Dimension(80, 25));
        jComboBox_Age.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_AgeItemStateChanged(evt);
            }
        });
        jComboBox_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_AgeActionPerformed(evt);
            }
        });

        jTextField_Email.setPreferredSize(new java.awt.Dimension(90, 25));

        jTextField_PhoneNumber.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Full Name :");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Age :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Email :");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Phone Number :");

        jTextField_role.setEditable(false);
        jTextField_role.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Role :");

        button_update.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_update.setText("Update");
        button_update.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Profile Picture");

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
        jButton_change.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_change.setBorderPainted(false);
        jButton_change.setDisabledIcon(null);
        jButton_change.setDisabledSelectedIcon(null);
        jButton_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_changeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 314, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(272, 272, 272))
                            .addComponent(jLabel1))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_role, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel11))
                    .addComponent(jLabel_icon)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton_change)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(472, 472, 472))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jComboBox_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_change))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_icon)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(button_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_AgeActionPerformed

    }//GEN-LAST:event_jComboBox_AgeActionPerformed

    private void jComboBox_AgeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_AgeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_AgeItemStateChanged

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed
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
    }
    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        String id = jTextField_ID.getText();
        String username = jTextField_Username.getText();
        String password = jTextField_Password.getText();
        String fullName = jTextField_FullName.getText();
        String ageString = jComboBox_Age.getSelectedItem().toString();
        String email = jTextField_Email.getText();
        String phoneNumber = jTextField_PhoneNumber.getText();
        String role = jTextField_role.getText();
        StringBuilder eventBuilder = new StringBuilder("Update Personal Profile");

        // Validate input fields
        if (!isValidName(fullName)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if name is invalid
        }

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if email is invalid
        }

        if (!isValidPhoneNumber(phoneNumber)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid phone number.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit method if phone number is invalid
        }
        // Read the existing content from the text file
        String filePath = "Data/Admin.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            updateFilePath(content, id, selectedFilePath, eventBuilder);

            // Update the information in the content and modify the event accordingly
            if (updateContent(content, "ID: ", id, id, eventBuilder)) {
                eventBuilder.append(", Update ID");
            }
            if (updateContent(content, "Username: ", id, username, eventBuilder)) {
                eventBuilder.append(", Update Username");
            }
            if (updateContent(content, "Password: ", id, password, eventBuilder)) {
                eventBuilder.append(", Update Password");
            }
            if (updateContent(content, "Name: ", id, fullName, eventBuilder)) {
                eventBuilder.append(", Update Name");
            }
            if (updateContent(content, "Age: ", id, String.valueOf(ageString), eventBuilder)) {
                eventBuilder.append(", Update Age");
            }
            if (updateContent(content, "Email: ", id, email, eventBuilder)) {
                eventBuilder.append(", Update Email");
            }
            if (updateContent(content, "Phone Number: ", id, phoneNumber, eventBuilder)) {
                eventBuilder.append(", Update Phone Number");
            }
            if (updateContent(content, "Role: ", id, role, eventBuilder)) {
                eventBuilder.append(", Update Role");
            }

            // Write the updated content back to the text file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(content.toString());
                JOptionPane.showMessageDialog(null, "Content successfully updated!");
            }

            // Add the log entry with the specific event
            Admin_Logbook adminLogbook = new Admin_Logbook(userID);
            adminLogbook.addLogEntry(userID, eventBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception according to your application's requirements
        }
    }
    // Additional code for updating filepath

    private boolean updateContent(StringBuilder content, String label, String id, String newValue, StringBuilder eventBuilder) {
        int startIndex = content.indexOf("ID: " + id);
        if (startIndex != -1) {
            // Find the end index of the current entry (marked by an empty line)
            int endIndex = content.indexOf("\n\n", startIndex);
            if (endIndex == -1) {
                // If the last entry, endIndex is the end of content
                endIndex = content.length();
            }
            // Search for the label within the range of the current entry
            int labelIndex = content.indexOf(label, startIndex);
            if (labelIndex != -1 && labelIndex < endIndex) {
                int valueIndex = labelIndex + label.length();
                // Find the end of the current line to extract the old value
                int lineEndIndex = content.indexOf("\n", valueIndex);
                String oldValue = content.substring(valueIndex, lineEndIndex).trim();
                if (!oldValue.equals(newValue)) {
                    // Update the content and modify the event
                    content.replace(valueIndex, lineEndIndex, newValue + ",");
                    eventBuilder.append(", ").append(label.trim()).append(" from '").append(oldValue).append("' to '").append(newValue).append("'");
                    return true; // Return true if the update was successful
                }
            } else {
                System.out.println("Label not found: " + label);
            }
        } else {
            System.out.println("ID not found: " + id);
        }
        return false;
    }

    private boolean updateFilePath(StringBuilder content, String userID, String selectedFilePath, StringBuilder eventBuilder) {
        int startIndex = content.indexOf("ID: " + userID);
        if (startIndex != -1) {
            // Find the end index of the user's entry (marked by an empty line)
            int endIndex = content.indexOf("\n\n", startIndex);
            if (endIndex == -1) {
                // If the last entry, endIndex is the end of content
                endIndex = content.length();
            }
            // Find the index of "Filepath: " within the range of the user's entry
            int filepathIndex = content.indexOf("Filepath: ", startIndex);
            if (filepathIndex != -1 && filepathIndex < endIndex) {
                int filepathEndIndex = content.indexOf("\n", filepathIndex);
                String oldFilePath = content.substring(filepathIndex + "Filepath: ".length(), filepathEndIndex).trim();
                String newFilePath;

                if (selectedFilePath != null) {
                    newFilePath = selectedFilePath;
                } else {
                    // If selectedFilePath is null, keep the original filepath
                    newFilePath = oldFilePath;
                }

                // If filepath is actually updated, replace it in the content
                if (!oldFilePath.equals(newFilePath)) {
                    int srcIndex = newFilePath.indexOf("src");
                    if (srcIndex != -1) {
                        // Remove the part before "src"
                        newFilePath = newFilePath.substring(srcIndex);
                    }
                    content.replace(filepathIndex + "Filepath: ".length(), filepathEndIndex, newFilePath);
                    // Append the filepath update to the eventBuilder
                    eventBuilder.append(", Update Filepath from '").append(oldFilePath).append("' to '").append(newFilePath).append("'");
                    return true;
                }
            } else {
                System.out.println("Filepath label not found for user with ID: " + userID);
            }
        } else {
            System.out.println("User ID not found: " + userID);
        }
        return false;


    }//GEN-LAST:event_button_updateActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                Admin_Profile AdminProfile = new Admin_Profile();
                AdminProfile.setIconFromFile(BOOKING_FILE_PATH);
                AdminProfile.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.progressindicator.Button button_update;
    private javax.swing.JButton jButton_change;
    private javax.swing.JComboBox<String> jComboBox_Age;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FullName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private javax.swing.JTextField jTextField_Username;
    private javax.swing.JTextField jTextField_role;
    // End of variables declaration//GEN-END:variables
}
