package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        showPass = new javax.swing.JCheckBox();
        Password = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        Student_ID = new javax.swing.JLabel();
        StuID = new javax.swing.JTextField();
        register = new javax.swing.JLabel();
        checkwithkeycard = new javax.swing.JButton();
        check = new javax.swing.JButton();
        labelfirstname4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(600, 100));
        setMaximumSize(new java.awt.Dimension(335, 480));
        setMinimumSize(new java.awt.Dimension(335, 480));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(335, 480));
        jPanel1.setMinimumSize(new java.awt.Dimension(335, 480));

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        showPass.setForeground(new java.awt.Color(204, 204, 204));
        showPass.setText("Show Password");
        showPass.setContentAreaFilled(false);
        showPass.setFocusPainted(false);
        showPass.setFocusable(false);
        showPass.setOpaque(true);
        showPass.setRolloverEnabled(false);
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(130, 134, 133));
        Password.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Password.setText("Password : ");

        pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(204, 204, 204));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        Student_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Student_ID.setForeground(new java.awt.Color(130, 134, 133));
        Student_ID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Student_ID.setText("Student ID :");

        StuID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        StuID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuIDActionPerformed(evt);
            }
        });

        register.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        register.setForeground(new java.awt.Color(130, 134, 133));
        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("Check-in ");

        checkwithkeycard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        checkwithkeycard.setForeground(new java.awt.Color(204, 204, 204));
        checkwithkeycard.setText("Check-in with keycard");
        checkwithkeycard.setBorderPainted(false);
        checkwithkeycard.setContentAreaFilled(false);
        checkwithkeycard.setFocusable(false);
        checkwithkeycard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkwithkeycardActionPerformed(evt);
            }
        });

        check.setBackground(new java.awt.Color(58, 210, 147));
        check.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("check-in ");
        check.setBorderPainted(false);
        check.setFocusable(false);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        labelfirstname4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname4.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelfirstname4.setText("------------------------------");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Student_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StuID, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelfirstname4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(checkwithkeycard, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Student_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(StuID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showPass)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(check)
                .addGap(18, 18, 18)
                .addComponent(labelfirstname4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkwithkeycard)
                .addGap(32, 32, 32)
                .addComponent(back)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void StuIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StuIDActionPerformed

    private void checkwithkeycardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkwithkeycardActionPerformed
        new keycard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_checkwithkeycardActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        String url = "jdbc:mysql://localhost:3306/systemtest"; // ฐานข้อมูลของคุณ
        String user = "root"; // ชื่อผู้ใช้ MySQL
        String passwordDB = ""; // รหัสผ่าน MySQL

// ดึงค่าจากฟอร์ม
        String stuId = StuID.getText();
        String passInput = new String(pass.getPassword());

// ตรวจสอบว่ากรอกครบหรือไม่
        if (stuId.isEmpty() || passInput.isEmpty()) {
            new checkIdORpass().setVisible(true);
            return;
        }

// SQL ตรวจสอบข้อมูลผู้ใช้
        String sql = "SELECT * FROM registertest WHERE Student_ID = ? AND Password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // โหลดไดรเวอร์ MySQL
            Connection conn = DriverManager.getConnection(url, user, passwordDB);
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, stuId);
            stmt.setString(2, passInput);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // ดึงค่าจาก registertest
                String firstName = rs.getString("First_Name");
                String lastName = rs.getString("Last_Name");
                // บันทึกลงตาราง check_in
                String sqlInsert = "INSERT INTO check_in (Student_ID, First_Name, Last_Name, Date, TIME) VALUES (?, ?, ?, CURDATE(), CURTIME())";
                PreparedStatement insertStmt = conn.prepareStatement(sqlInsert);
                insertStmt.setString(1, stuId);
                insertStmt.setString(2, firstName);
                insertStmt.setString(3, lastName);
                insertStmt.executeUpdate();
                // ดึงวันที่และเวลาที่เพิ่ง insert เพื่อส่งไปยังหน้า success
                String sqlSelectCheckIn = "SELECT Date, TIME FROM check_in WHERE Student_ID = ? ORDER BY Date DESC, TIME DESC LIMIT 1";
                PreparedStatement selectStmt = conn.prepareStatement(sqlSelectCheckIn);
                selectStmt.setString(1, stuId);
                ResultSet rsCheckIn = selectStmt.executeQuery();

                String date = "";
                String time = "";
                if (rsCheckIn.next()) {
                    date = rsCheckIn.getString("Date");
                    time = rsCheckIn.getString("TIME");
                }
                // เปิดหน้า success พร้อมส่งข้อมูล
                new cknsuccess(stuId, firstName, lastName, date, time).setVisible(true);
                this.setVisible(false); // ปิดหน้าปัจจุบัน
            } else {
                new chnfailed().setVisible(true);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }


    }//GEN-LAST:event_checkActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new main().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        if (showPass.isSelected()) {
            pass.setEchoChar((char) 0); // แสดงรหัสผ่านจริง
        } else {
            pass.setEchoChar('•'); // ซ่อนรหัสผ่านด้วย bullet
        }

    }//GEN-LAST:event_showPassActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JTextField StuID;
    private javax.swing.JLabel Student_ID;
    private javax.swing.JButton back;
    private javax.swing.JButton check;
    private javax.swing.JButton checkwithkeycard;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelfirstname4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel register;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
}
