//หน้านี้จะแสดงก็ต่อเมื่อมีการLoginทำงาน
package main;

public class cknsuccess extends javax.swing.JFrame {

    private String studentID;

    public cknsuccess(String studentID, String firstName, String lastName, String date, String time) {
        initComponents();
        this.studentID = studentID;

        returnStuid.setText(studentID);
        returnfirstname.setText(firstName);
        returnLastname.setText(lastName);
        returndate.setText(date);
        returntime.setText(time);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        register = new javax.swing.JLabel();
        labelfirstname2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        returnStuid = new javax.swing.JLabel();
        History = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        StuID1 = new javax.swing.JLabel();
        returnLastname = new javax.swing.JLabel();
        returntime = new javax.swing.JLabel();
        returnfirstname = new javax.swing.JLabel();
        returndate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setLocation(new java.awt.Point(1000, 100));
        setMaximumSize(new java.awt.Dimension(400, 242));
        setMinimumSize(new java.awt.Dimension(400, 242));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 242));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 242));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 242));

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

        register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        register.setForeground(new java.awt.Color(51, 255, 51));
        register.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        register.setText("Check-in successful");

        labelfirstname2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelfirstname2.setForeground(new java.awt.Color(130, 134, 133));
        labelfirstname2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelfirstname2.setText("Welcome!");

        date.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        date.setForeground(new java.awt.Color(130, 134, 133));
        date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        date.setText("Date :");

        Name.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        Name.setForeground(new java.awt.Color(130, 134, 133));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Name.setText("Name :");

        returnStuid.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        returnStuid.setForeground(new java.awt.Color(130, 134, 133));
        returnStuid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returnStuid.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        History.setBackground(new java.awt.Color(58, 210, 147));
        History.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        History.setForeground(new java.awt.Color(255, 255, 255));
        History.setText("History check-in");
        History.setFocusable(false);
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });

        time.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        time.setForeground(new java.awt.Color(130, 134, 133));
        time.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        time.setText("Time :");

        StuID1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        StuID1.setForeground(new java.awt.Color(130, 134, 133));
        StuID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        StuID1.setText("Student ID :");

        returnLastname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        returnLastname.setForeground(new java.awt.Color(130, 134, 133));
        returnLastname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returnLastname.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        returntime.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        returntime.setForeground(new java.awt.Color(130, 134, 133));
        returntime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returntime.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        returnfirstname.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        returnfirstname.setForeground(new java.awt.Color(130, 134, 133));
        returnfirstname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returnfirstname.setToolTipText("");
        returnfirstname.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        returndate.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        returndate.setForeground(new java.awt.Color(130, 134, 133));
        returndate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        returndate.setToolTipText("");
        returndate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date)
                            .addComponent(time))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(returnfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(returndate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returntime, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(History))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelfirstname2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(StuID1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(returnStuid, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelfirstname2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StuID1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnStuid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returndate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returntime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(History)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back)))
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
        History_chn historyPage = new History_chn(studentID);
        historyPage.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HistoryActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(cknsuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cknsuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cknsuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cknsuccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton History;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel StuID1;
    private javax.swing.JButton back;
    private javax.swing.JLabel date;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelfirstname2;
    private javax.swing.JLabel register;
    private javax.swing.JLabel returnLastname;
    private javax.swing.JLabel returnStuid;
    private javax.swing.JLabel returndate;
    private javax.swing.JLabel returnfirstname;
    private javax.swing.JLabel returntime;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
