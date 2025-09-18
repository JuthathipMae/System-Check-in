package main;

import com.fazecast.jSerialComm.SerialPort;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class keycard extends javax.swing.JFrame {

    private SerialPort serialPort;

    public keycard() {
        initComponents();
        connectSerial("COM13");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        Check = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 100));
        setMaximumSize(new java.awt.Dimension(335, 240));
        setMinimumSize(new java.awt.Dimension(335, 240));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(335, 240));
        jPanel1.setMinimumSize(new java.awt.Dimension(335, 240));

        text.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        text.setForeground(new java.awt.Color(130, 134, 133));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Check-in with keycard");

        show.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        show.setForeground(new java.awt.Color(130, 134, 133));
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setText("Student ID ");

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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

        Check.setBackground(new java.awt.Color(58, 210, 147));
        Check.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Check.setForeground(new java.awt.Color(255, 255, 255));
        Check.setText("Check-in ");
        Check.setBorderPainted(false);
        Check.setFocusable(false);
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                    .addComponent(show, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Check)
                .addGap(22, 22, 22)
                .addComponent(back)
                .addContainerGap())
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
        // ✅ ปิด serial port หลัง Check-in เสร็จ
        if (serialPort != null && serialPort.isOpen()) {
            serialPort.closePort();
            System.out.println("Serial port closed after check-in.");
        }
    }//GEN-LAST:event_backActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        // ปิดการฟังซ้ำ ๆ เดิมออกก่อน
        // ไม่ต้องใส่ Check.addActionListener อีกแล้ว

        String stuId = jLabel1.getText().trim(); // สมมติ IDcard1 แสดง StudentID

        if (stuId.isEmpty()) {
            new caednofeild().setVisible(true);
            return;
        }

        String url = "jdbc:mysql://localhost:3306/systemtest";
        String user = "root";
        String password = "";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to database!");

            // 1. ตรวจสอบว่า StudentID อยู่ใน registertest ไหม
            String sqlCheck = "SELECT Student_ID, First_Name, Last_Name FROM registertest WHERE Student_ID = ?";
            PreparedStatement stmtCheck = conn.prepareStatement(sqlCheck);
            stmtCheck.setString(1, stuId);
            ResultSet rs = stmtCheck.executeQuery();

            if (rs.next()) {
                String studentID = rs.getString("Student_ID");
                String firstName = rs.getString("First_Name");
                String lastName = rs.getString("Last_Name");

                // 2. Insert ลง check_in
                String sqlInsert = "INSERT INTO check_in (Student_ID, First_Name, Last_Name, Date, TIME) "
                        + "VALUES (?, ?, ?, CURDATE(), CURTIME())";
                PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert);
                stmtInsert.setString(1, studentID);
                stmtInsert.setString(2, firstName);
                stmtInsert.setString(3, lastName);
                stmtInsert.executeUpdate();

                // 3. ดึง Date, Time ล่าสุด
                String sqlSelect = "SELECT Date, TIME FROM check_in WHERE Student_ID = ? "
                        + "ORDER BY Date DESC, TIME DESC LIMIT 1";
                PreparedStatement stmtSelect = conn.prepareStatement(sqlSelect);
                stmtSelect.setString(1, studentID);
                ResultSet rs2 = stmtSelect.executeQuery();

                if (rs2.next()) {
                    String date = rs2.getString("Date");
                    String time = rs2.getString("TIME");

                    // 4. เปิดหน้า success พร้อมส่งค่าไป
                    new cknsuccess(studentID, firstName, lastName, date, time).setVisible(true);
                }

                // ✅ ปิด serial port หลัง Check-in เสร็จ
                if (serialPort != null && serialPort.isOpen()) {
                    serialPort.closePort();
                    System.out.println("Serial port closed after check-in.");
                }

                this.dispose();
            } else {
                new chnfailed().setVisible(true);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred.: " + ex.getMessage());
        }
    }//GEN-LAST:event_CheckActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new keycard().setVisible(true);
            }
        });
    }

    private void connectSerial(String portName) {

        serialPort = SerialPort.getCommPort(portName);
        serialPort.setBaudRate(115200);
        if (serialPort.openPort()) {
            System.out.println("Connected to " + portName);

            new Thread(() -> {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        while (serialPort.bytesAvailable() > 0) {
                            byte[] buffer = new byte[serialPort.bytesAvailable()];
                            serialPort.readBytes(buffer, buffer.length);
                            String data = new String(buffer);

                            sb.append(data);
                            if (data.contains("\n")) {
                                String cardId = sb.toString().trim();
                                sb.setLength(0);

                                String url = "jdbc:mysql://localhost:3306/systemtest";
                                String user = "root";
                                String password = "";

                                try (Connection conn = DriverManager.getConnection(url, user, password)) {
                                    System.out.println("Connected to database!");

                                    String sql = "SELECT Student_ID FROM addkeycard WHERE keycard_id = ?";
                                    PreparedStatement stmt = conn.prepareStatement(sql);
                                    stmt.setString(1, cardId);
                                    ResultSet rs = stmt.executeQuery();

                                    String resultText;
                                    if (rs.next()) {
                                        resultText = rs.getString("Student_ID");
                                    } else {
                                        resultText = "Fail";
                                    }

                                    String finalResultText = resultText;
                                    SwingUtilities.invokeLater(() -> jLabel1.setText(finalResultText));

                                } catch (Exception dbEx) {
                                    dbEx.printStackTrace();
                                }
                            }
                        }
                        Thread.sleep(20);
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

        } else {
            System.out.println("Failed to connect to " + portName);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel show;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
