package furniture_sale_ordering_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author Wei Hong
 */
public class ModifyWorkerProfile extends javax.swing.JFrame {

    public static String ID;
    public static String Username;
    public static String Password;
    public static String Name;
    public static int Age;
    public static String Email;
    public static String PhoneNumber;
    public static String Role;
    public static String userID;

    private static final String BOOKING_FILE_PATH = "Data/Officer_Salesperson.txt";
    



    /**
     * Creates new form RoomBooking
     * @param ID
     * @param Username
     * @param Password
     * @param Name
     * @param Age
     * @param Email
     * @param PhoneNumber
     * @param Role
     */public void setInitialValues(String ID, String Username, String Password, String Name, int Age, String Email, String PhoneNumber, String Role) {
    jTextField_ID.setText(ID);
    jTextField_Username.setText(Username);
    jTextField_Password.setText(Password);
    jTextField_Name.setText(Name);
    jTextField_Age.setText(Integer.toString(Age));
    jTextField_Email.setText(Email);
    jTextField_PhoneNumber.setText(PhoneNumber);
    jTextField_Role.setText(Role);
}
     
public ModifyWorkerProfile(String ID, String Username, String Password, String Name, int Age, String Email, String PhoneNumber, String Role, String userID){
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Role = Role;
        this.userID = userID;
        
    initComponents();
        // Set the title of the window
        setTitle("Modify Worker Profile");

        // Get the dimension of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the center coordinates
        int centerX = (screenSize.width - getWidth()) / 2;
        int centerY = (screenSize.height - getHeight()) / 2;

        // Set the location of the window
        setLocation(centerX, centerY);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Set the values in the appropriate fields
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Age = new javax.swing.JTextField();
        jTextField_Password = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jButton_edit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton_back = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Role = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 224, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setForeground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("MODIFY WORKER PROFILE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Age :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Name :");

        jTextField_Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UsernameActionPerformed(evt);
            }
        });

        jTextField_Age.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AgeActionPerformed(evt);
            }
        });

        jTextField_Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PasswordActionPerformed(evt);
            }
        });

        jTextField_Name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jButton_edit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/edit.png"))); // NOI18N
        jButton_edit.setText("Edit");
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Email :");

        jButton_back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/back.png"))); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("ID:");

        jTextField_ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jTextField_Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Phone Number :");

        jTextField_PhoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Role :");

        jTextField_Role.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/profile picture1.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Profile Picture");

        jButton1.setText("jButton1");

        jButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/change profile.png"))); // NOI18N
        jButton2.setText("Change");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jButton_back)
                .addGap(18, 18, 18)
                .addComponent(jButton_edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(jTextField_ID)
                            .addComponent(jTextField_Password)
                            .addComponent(jTextField_Name)
                            .addComponent(jTextField_Age)
                            .addComponent(jTextField_Email)
                            .addComponent(jTextField_Role)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jButton2))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_back)
                            .addComponent(jButton_edit))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void jTextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UsernameActionPerformed

    private void jTextField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PasswordActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AgeActionPerformed

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        String ID = jTextField_ID.getText();
        String Username = jTextField_Username.getText();
        String Password = jTextField_Password.getText();
        String Name = jTextField_Name.getText();
        int Age = Integer.parseInt(jTextField_Age.getText());
        String Email = jTextField_Email.getText();
        String PhoneNumber = jTextField_PhoneNumber.getText();
        String Role = jTextField_Role.getText();


        // Get the selected room

        // Validate input fields
        if (ID.isEmpty() || Username.isEmpty() || Password.isEmpty() || Name.isEmpty() ||Email.isEmpty() ||PhoneNumber.isEmpty() ||Role.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Perform the booking
        boolean isModified = modifyBooking(ID,Username,Password,Name,Age,Email,PhoneNumber,Role);

        if (isModified) {
            JOptionPane.showMessageDialog(this, "Profile modified successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to modify the profile. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        dispose();
        ManageWorkerProfile manageBooking = new ManageWorkerProfile(userID);
        manageBooking.setVisible(true);
        manageBooking.displayBookings(); // Call the method to display the bookings
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2AncestorAdded

    /**
     * @param args the command line arguments
     */
 
   private boolean modifyBooking(String ID, String Username, String Password, String Name, int Age, String Email, String PhoneNumber, String Role) {
    StringBuilder eventBuilder = new StringBuilder("Update Profile");
    try {
        Path inputFile = Path.of(BOOKING_FILE_PATH);

        List<String> lines = Files.readAllLines(inputFile, StandardCharsets.UTF_8);

        boolean found = false;
        for (int i = 0; i < lines.size() - 8; i += 9) {
            String line = lines.get(i);
            if (line.equals("ID: " + ID)) {
                // Log the changes
                eventBuilder.append(",Changes made to profile with ID ").append(ID).append(":");
                logChange(eventBuilder, "Username", lines.get(i + 1), "Username: " + Username);
                logChange(eventBuilder, "Password", lines.get(i + 2), "Password: " + Password);
                logChange(eventBuilder, "Name", lines.get(i + 3), "Name: " + Name);
                logChange(eventBuilder, "Age", lines.get(i + 4), "Age: " + Age);
                logChange(eventBuilder, "Email", lines.get(i + 5), "Email: " + Email);
                logChange(eventBuilder, "Phone Number", lines.get(i + 6), "Phone Number: " + PhoneNumber);
                logChange(eventBuilder, "Role", lines.get(i + 7), "Role: " + Role);

                // Modify the existing booking
                lines.set(i, "ID: " + ID);
                lines.set(i + 1, "Username: " + Username);
                lines.set(i + 2, "Password: " + Password);
                lines.set(i + 3, "Name: " + Name);
                lines.set(i + 4, "Age: " + Age);
                lines.set(i + 5, "Email: " + Email);
                lines.set(i + 6, "Phone Number: " + PhoneNumber);
                lines.set(i + 7, "Role: " + Role);
                lines.set(i + 8, "/n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Profile not found.");
            return false;
        }

        Files.write(inputFile, lines, StandardCharsets.UTF_8, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);

        // Add code here to write eventBuilder to the logbook
        Admin_Logbook adminLogbook = new Admin_Logbook(userID);
        adminLogbook.addLogEntry(userID, eventBuilder.toString());

        return true;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
}

private void logChange(StringBuilder eventBuilder, String fieldName, String oldValue, String newValue) {
    if (!oldValue.equals(newValue)) {
        eventBuilder.append(fieldName).append(": ").append(oldValue.substring(fieldName.length())).append(" -> ").append(newValue.substring(fieldName.length()));
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
            java.util.logging.Logger.getLogger(ModifyWorkerProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyWorkerProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyWorkerProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyWorkerProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        ModifyWorkerProfile modifyProfile = new ModifyWorkerProfile(ID, Username, Password, Name, Age, Email, PhoneNumber, Role,userID);
        modifyProfile.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_edit;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private javax.swing.JTextField jTextField_Role;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables

}
