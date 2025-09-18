
package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class dataregiss extends javax.swing.JFrame {

    public dataregiss() {
        initComponents();
        loadData();
    }
     private void loadData() {
        String url = "jdbc:mysql://localhost:3306/systemtest";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT Student_ID, First_Name, Last_Name, Password, Gmail, Major FROM registertest";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            javax.swing.table.DefaultTableModel model = 
                (javax.swing.table.DefaultTableModel) tebleregis.getModel();
            model.setRowCount(0); // ล้างข้อมูลเก่าออกก่อน

            while (rs.next()) {
                Object[] row = new Object[]{
                    rs.getLong("Student_ID"),
                    rs.getString("First_Name"),
                    rs.getString("Last_Name"),
                    rs.getString("Password"),
                    rs.getString("Gmail"),
                    rs.getString("Major")
                };
                model.addRow(row);
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tebleregis = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(560, 200));
        setMaximumSize(new java.awt.Dimension(598, 471));
        setMinimumSize(new java.awt.Dimension(598, 471));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(598, 471));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(4, 123, 111));
        jPanel1.setMaximumSize(new java.awt.Dimension(598, 471));
        jPanel1.setMinimumSize(new java.awt.Dimension(598, 471));
        jPanel1.setPreferredSize(new java.awt.Dimension(598, 471));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(586, 416));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(586, 416));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(586, 416));

        tebleregis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student_ID", "First_Name", "Last_Name", "Password", "Gmail", "Major"
            }
        ));
        tebleregis.setGridColor(new java.awt.Color(255, 255, 255));
        tebleregis.setMaximumSize(new java.awt.Dimension(586, 416));
        tebleregis.setMinimumSize(new java.awt.Dimension(586, 416));
        tebleregis.setPreferredSize(new java.awt.Dimension(586, 416));
        tebleregis.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tebleregis);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataregiss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tebleregis;
    // End of variables declaration//GEN-END:variables
}
