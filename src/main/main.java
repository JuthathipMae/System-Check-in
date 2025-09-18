package main;
public class main extends javax.swing.JFrame {
    public main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelfirstname4 = new javax.swing.JLabel();
        Check = new javax.swing.JButton();
        System = new javax.swing.JLabel();
        or = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        regis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(600, 100));
        setMaximumSize(new java.awt.Dimension(337, 368));
        setMinimumSize(new java.awt.Dimension(337, 368));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(337, 368));
        jPanel1.setMinimumSize(new java.awt.Dimension(337, 368));

        labelfirstname4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelfirstname4.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelfirstname4.setText("------------------------------");

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

        System.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        System.setForeground(new java.awt.Color(130, 134, 133));
        System.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        System.setText("System check-in");

        or.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        or.setForeground(new java.awt.Color(130, 134, 133));
        or.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        or.setText("OR");

        admin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        admin.setForeground(new java.awt.Color(232, 232, 232));
        admin.setText("Admin-Login");
        admin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 228, 228), 3));
        admin.setContentAreaFilled(false);
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        admin.setFocusable(false);
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        regis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        regis.setForeground(new java.awt.Color(204, 204, 204));
        regis.setText("Register");
        regis.setBorderPainted(false);
        regis.setContentAreaFilled(false);
        regis.setFocusable(false);
        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(System, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(Check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelfirstname4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(System, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Check, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(or)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelfirstname4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CheckActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        new adminlogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminActionPerformed

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        new Register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regisActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Check;
    private javax.swing.JLabel System;
    private javax.swing.JButton admin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelfirstname4;
    private javax.swing.JLabel or;
    private javax.swing.JButton regis;
    // End of variables declaration//GEN-END:variables
}
