package furniture_sale_ordering_management_system;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
                            jTextField_Username.setText(value);
                            break;
                        case "Password":
                            jTextField_Password.setText(value);
                            break;
                        case "Name":
                            jTextField_FullName.setText(value);
                            break;
                        case "Age":                         
                            jComboBox_Age.setSelectedItem(value);
                            break;
                        case "Email":
                            jTextField_Email.setText(value);
                            break;
                        case "PhoneNumber":
                            jTextField_PhoneNumber.setText(value);
                            break;
                        case "Role":
    
                        // Assuming age values are stored as strings in the combo box; modify the following line if needed
                            jComboBox_Role.setSelectedItem(value);
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




    
    
    public Sales_Officer_Profile(String userID) {
        this.userID = userID;
        initComponents();
        
        jComboBox_Age.setModel(new DefaultComboBoxModel<>(generateAgeOptions()));
        // For Role JComboBox
        jComboBox_Role.setModel(new DefaultComboBoxModel<>(new String[]{"Officer", "Salesperson"}));
        // Set the title of the window
        setTitle("Sales_Officer_Profile");

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_Update = new javax.swing.JButton();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Password = new javax.swing.JTextField();
        jTextField_FullName = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jButton_back = new javax.swing.JButton();
        jComboBox_Age = new javax.swing.JComboBox<>();
        jComboBox_Role = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Personal Profile");

        jLabel2.setText("Username :");

        jLabel3.setText("Password :");

        jLabel4.setText("Full Name :");

        jLabel5.setText("Email :");

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jTextField_FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FullNameActionPerformed(evt);
            }
        });

        jLabel6.setText("ID :");

        jLabel7.setText("Age :");

        jLabel8.setText("Phone Number :");

        jLabel9.setText("Role :");

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jComboBox_Age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox_Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jComboBox_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jComboBox_Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox_Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FullNameActionPerformed
   
    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
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
                        lines[1] = "Username: " + jTextField_Username.getText().trim();
                        break;
                    case "Password":
                        lines[2] = "Password: " + jTextField_Password.getText().trim();
                        break;
                    case "Name":
                        lines[3] = "Name: " + jTextField_FullName.getText().trim();
                        break;
                    case "Age":
                        lines[4] = "Age: " + jComboBox_Age.getSelectedItem().toString().trim();
                        break;
                    case "Email":
                        lines[5] = "Email: " + jTextField_Email.getText().trim();
                        break;
                    case "PhoneNumber":
                        lines[6] = "PhoneNumber: " + jTextField_PhoneNumber.getText().trim();
                        break;
                    case "Role":
                        lines[7] = "Role: " + jComboBox_Role.getSelectedItem().toString().trim();
                        
                        // Add a new blank line after the "Role" line
                        content.append("\n");
                        
                        break;
                }
            }
        }

        // Update the content with modified user data
        // Add a new blank line before the updated content
    content.insert(startIndex, "\n");
    content.insert(endIndex, "\n");

// Update the content with modified user data
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
        e.printStackTrace(); // Handle the exception according to your application's requirements
    }

    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Sales_Home home = new Sales_Home(userID);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

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
                salesOfficerProfile.setVisible(true);
                salesOfficerProfile.setInitialValuesFromUserID(userID);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Update;
    private javax.swing.JButton jButton_back;
    private javax.swing.JComboBox<String> jComboBox_Age;
    private javax.swing.JComboBox<String> jComboBox_Role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_FullName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables



    private void setInitialValues(String value, String value0, String value1, String value2, int parseAge, String value3, String value4, String value5) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
