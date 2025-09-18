package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        regis = new javax.swing.JButton();
        register = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        labelfirstname = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        labelfirstname1 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        StuID = new javax.swing.JTextField();
        labelfirstname2 = new javax.swing.JLabel();
        labelfirstname3 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        Gmail = new javax.swing.JTextField();
        labelfirstname4 = new javax.swing.JLabel();
        labelfirstname5 = new javax.swing.JLabel();
        Major = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        showPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 100));
        setMaximumSize(new java.awt.Dimension(335, 480));
        setMinimumSize(new java.awt.Dimension(335, 480));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(335, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(335, 480));

        regis.setBackground(new java.awt.Color(58, 210, 147));
        regis.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        regis.setForeground(new java.awt.Color(255, 255, 255));
        regis.setText("Register");
        regis.setFocusable(false);
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });

        register.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        register.setForeground(new java.awt.Color(130, 134, 133));
        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("Register");

        label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(130, 134, 133));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Create an acount");

        labelfirstname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelfirstname.setText("First Name :");

        FirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });

        labelfirstname1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname1.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelfirstname1.setText("Last Name :");

        LastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });

        StuID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StuID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuIDActionPerformed(evt);
            }
        });

        labelfirstname2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname2.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelfirstname2.setText("Student ID :");

        labelfirstname3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname3.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelfirstname3.setText("Password : ");

        Pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Pass.setForeground(new java.awt.Color(204, 204, 204));
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        Gmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Gmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GmailActionPerformed(evt);
            }
        });

        labelfirstname4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname4.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelfirstname4.setText("Gmail  :");

        labelfirstname5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname5.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelfirstname5.setText("Major :");

        Major.setForeground(new java.awt.Color(204, 204, 204));
        Major.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DIT", "CAI", "AME", "IEM", "RAE" }));
        Major.setFocusable(false);
        Major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MajorActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setForeground(new java.awt.Color(153, 153, 153));
        back.setText("Back");
        back.setBorder(null);
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setFocusable(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        showPass.setForeground(new java.awt.Color(204, 204, 204));
        showPass.setContentAreaFilled(false);
        showPass.setFocusable(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelfirstname2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StuID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelfirstname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelfirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelfirstname3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pass)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelfirstname4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelfirstname5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Gmail, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(Major, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(7, Short.MAX_VALUE))
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regis)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(register)
                .addGap(5, 5, 5)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelfirstname2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelfirstname1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(showPass))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelfirstname3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelfirstname4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelfirstname5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(regis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void StuIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StuIDActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void GmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GmailActionPerformed

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        String url = "jdbc:mysql://localhost:3306/systemtest";
        String user = "root";
        String password = "";

        // Get values from the form
        String stuId = StuID.getText().trim();
        String firstName = FirstName.getText().trim();
        String lastName = LastName.getText().trim();
        String pass = new String(Pass.getPassword());
        String gmail = Gmail.getText().trim();
        String major = Major.getSelectedItem().toString();

        // Check if all fields are filled
        if (stuId.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || pass.isEmpty() || gmail.isEmpty()) {
            new regis_allfield().setVisible(true);
            return;
        }
           if (pass.length() < 8 || pass.length() > 15) {
      new regis_allfield().setVisible(true);
        return;
    }

        // Check Gmail format - must have something before @gmail.com
        if (!gmail.matches("^[A-Za-z0-9._%+-]+@gmail\\.com$")) {
            new regis_mail().setVisible(true);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // Check if Student_ID already exists
            String checkSQL = "SELECT * FROM registertest WHERE Student_ID = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSQL);
            checkStmt.setLong(1, Long.parseLong(stuId));
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                new regis_stuexists().setVisible(true);
                conn.close();
                return;
            }

            // SQL insert query
            String sql = "INSERT INTO registertest (Student_ID, First_Name, Last_Name, Password, Gmail, Major) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setLong(1, Long.parseLong(stuId));
            stmt.setString(2, firstName);
            stmt.setString(3, lastName);
            stmt.setString(4, pass);
            stmt.setString(5, gmail);
            stmt.setString(6, major);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                new regis_success().setVisible(true);

                // Clear fields
                StuID.setText("");
                FirstName.setText("");
                LastName.setText("");
                Pass.setText("");
                Gmail.setText("");
                Major.setSelectedIndex(0);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_regisActionPerformed

    private void MajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MajorActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new main().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()) {
            Pass.setEchoChar((char) 0); // แสดงรหัสผ่านจริง
        } else {
            Pass.setEchoChar('•'); // ซ่อนรหัสผ่านด้วย bullet
        }
    }//GEN-LAST:event_showPassActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField Gmail;
    private javax.swing.JTextField LastName;
    private javax.swing.JComboBox<String> Major;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField StuID;
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel labelfirstname;
    private javax.swing.JLabel labelfirstname1;
    private javax.swing.JLabel labelfirstname2;
    private javax.swing.JLabel labelfirstname3;
    private javax.swing.JLabel labelfirstname4;
    private javax.swing.JLabel labelfirstname5;
    private javax.swing.JButton regis;
    private javax.swing.JLabel register;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
}
