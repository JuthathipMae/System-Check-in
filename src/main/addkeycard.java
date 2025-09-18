package main;

import com.fazecast.jSerialComm.SerialPort;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class addkeycard extends javax.swing.JFrame {
private Thread serialThread;
    private SerialPort serialPort;

    public addkeycard() {
        initComponents();
        connectSerial("COM13");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        IDcard1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        STUID = new javax.swing.JTextField();
        UPload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(585, 200));
        setMaximumSize(new java.awt.Dimension(538, 415));
        setMinimumSize(new java.awt.Dimension(538, 415));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(538, 415));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(623, 539));
        jPanel1.setMinimumSize(new java.awt.Dimension(623, 539));

        IDcard1.setBackground(new java.awt.Color(204, 255, 255));
        IDcard1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDcard1.setForeground(new java.awt.Color(102, 102, 102));
        IDcard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDcard1.setToolTipText("");
        IDcard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD ID CARD");

        STUID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        STUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STUIDActionPerformed(evt);
            }
        });

        UPload.setBackground(new java.awt.Color(3, 211, 64));
        UPload.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UPload.setForeground(new java.awt.Color(255, 255, 255));
        UPload.setText("ADD");
        UPload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(STUID, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDcard1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(UPload, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDcard1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(STUID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(UPload, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STUIDActionPerformed

    private void UPloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPloadActionPerformed
         String studentID = STUID.getText().trim();   // ข้อมูลจาก Admin
    String cardID = IDcard1.getText().trim();    // ข้อมูลจาก Serial Monitor

    if (studentID.isEmpty() && cardID.isEmpty()) {
        new regis_allfield().setVisible(true);
        return;
    }

    String url = "jdbc:mysql://localhost:3306/systemtest";
    String user = "root";
    String password = "";

    try (Connection conn = DriverManager.getConnection(url, user, password)) {

        // ตรวจสอบว่า Student_ID มีอยู่ในตาราง students หรือไม่
        String sqlCheck = "SELECT * FROM registertest WHERE Student_ID = ?";
        PreparedStatement stmtCheck = conn.prepareStatement(sqlCheck);
        stmtCheck.setString(1, studentID);
        ResultSet rs = stmtCheck.executeQuery();

        if (rs.next()) {
            // มีข้อมูลนักศึกษา → เช็คว่ามีใน adminkeycard แล้วหรือยัง
            String sqlCheckdata = "SELECT * FROM addkeycard WHERE Student_ID = ? OR keycard_id = ?";
            PreparedStatement stmtCheck0 = conn.prepareStatement(sqlCheckdata);
            stmtCheck0.setString(1, studentID);
            stmtCheck0.setString(2, cardID);
            ResultSet rsCheck = stmtCheck0.executeQuery();

            if (rsCheck.next()) {
                // ถ้ามีข้อมูลซ้ำ
                new cradDuplicate().setVisible(true);
            } else {
                // ถ้ายังไม่มี → INSERT
                String sqlInsert = "INSERT INTO addkeycard (Student_ID, keycard_id) VALUES (?, ?)";
                PreparedStatement stmtInsert = conn.prepareStatement(sqlInsert);
                stmtInsert.setString(1, studentID);
                stmtInsert.setString(2, cardID);
                int rows = stmtInsert.executeUpdate();

                if (rows > 0) {
                    new success().setVisible(true);
                    STUID.setText("");
                    IDcard1.setText("");
                } else {
                    new feild().setVisible(true);
                }
            }
        } else {
            // ไม่พบข้อมูลใน students
            new StuNOTfound().setVisible(true);
        }

        rs.close();
        stmtCheck.close();

        // ✅ ปิด Serial Port หลังจาก Upload เสร็จ
        if (serialPort != null && serialPort.isOpen()) {
            serialPort.closePort();
            System.out.println("Serial port closed after UPload.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "eror: " + e.getMessage());
    }
    }//GEN-LAST:event_UPloadActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addkeycard().setVisible(true);
            }
        });
    }

   private void connectSerial(String portName) {
    serialPort = SerialPort.getCommPort(portName);
    serialPort.setBaudRate(115200);
    if (serialPort.openPort()) {
        System.out.println("Connected to " + portName);

        serialThread = new Thread(() -> {
            try {
                StringBuilder sb = new StringBuilder();
                while (!Thread.currentThread().isInterrupted() && serialPort.isOpen()) {
                    while (serialPort.bytesAvailable() > 0) {
                        byte[] buffer = new byte[serialPort.bytesAvailable()];
                        serialPort.readBytes(buffer, buffer.length);
                        String data = new String(buffer);

                        sb.append(data);
                        if (data.contains("\n")) {
                            String line = sb.toString().trim();
                            sb.setLength(0);

                            SwingUtilities.invokeLater(() -> IDcard1.setText(line));
                        }
                    }
                    Thread.sleep(20);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        serialThread.start();
    } else {
        System.out.println("Failed to connect to " + portName);
    }
}
   @Override
public void dispose() {
    // ปิด Thread ก่อน
    if (serialThread != null && serialThread.isAlive()) {
        serialThread.interrupt();
    }

    // ปิด SerialPort
    if (serialPort != null && serialPort.isOpen()) {
        serialPort.closePort();
        System.out.println("Serial port closed when window closed.");
    }

    super.dispose();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDcard1;
    private javax.swing.JTextField STUID;
    private javax.swing.JButton UPload;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
