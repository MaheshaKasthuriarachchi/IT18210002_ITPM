/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class wellcome extends javax.swing.JFrame {

    /**
     * Creates new form wellcome
     */
    public wellcome() {
        initComponents();
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
        jButton1_lec = new javax.swing.JButton();
        jButton2_sub = new javax.swing.JButton();
        jButton3_Sess = new javax.swing.JButton();
        jButton4_MangSess = new javax.swing.JButton();
        jButton5_mangSub = new javax.swing.JButton();
        jButton6_mangLec = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1_lec.setBackground(new java.awt.Color(204, 255, 204));
        jButton1_lec.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1_lec.setText("Lecturer");
        jButton1_lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_lecActionPerformed(evt);
            }
        });

        jButton2_sub.setBackground(new java.awt.Color(204, 255, 204));
        jButton2_sub.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2_sub.setText("Subject");
        jButton2_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_subActionPerformed(evt);
            }
        });

        jButton3_Sess.setBackground(new java.awt.Color(204, 255, 204));
        jButton3_Sess.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3_Sess.setText("Sesseion");
        jButton3_Sess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_SessActionPerformed(evt);
            }
        });

        jButton4_MangSess.setBackground(new java.awt.Color(204, 255, 204));
        jButton4_MangSess.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4_MangSess.setText("Manage Sesseions");
        jButton4_MangSess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_MangSessActionPerformed(evt);
            }
        });

        jButton5_mangSub.setBackground(new java.awt.Color(204, 255, 204));
        jButton5_mangSub.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5_mangSub.setText("Manage Subjects");
        jButton5_mangSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_mangSubActionPerformed(evt);
            }
        });

        jButton6_mangLec.setBackground(new java.awt.Color(204, 255, 204));
        jButton6_mangLec.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6_mangLec.setText("Manage Lecturers");
        jButton6_mangLec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_mangLecActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Source Sans Pro", 1, 36)); // NOI18N
        jLabel1.setText("TIMETABLE MANAGEMENT\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3_Sess, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_lec, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4_MangSess, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5_mangSub, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6_mangLec, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6_mangLec, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton5_mangSub, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jButton4_MangSess, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1_lec, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton3_Sess, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(686, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_lecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_lecActionPerformed
        // Open Add Lecturer Form
        Add_Lecturer al = new Add_Lecturer(); 
            al.setVisible(true);
            al.pack();
            al.setLocationRelativeTo (null);
            al.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1_lecActionPerformed

    private void jButton2_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_subActionPerformed
        // TODO add your handling code here:
         Add_Subject as = new Add_Subject(); 
            as.setVisible(true);
            as.pack();
            as.setLocationRelativeTo (null);
            as.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2_subActionPerformed

    private void jButton3_SessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_SessActionPerformed
        // TODO add your handling code here:
        Add_Session ss = new Add_Session(); 
            ss.setVisible(true);
            ss.pack();
            ss.setLocationRelativeTo (null);
            ss.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3_SessActionPerformed

    private void jButton4_MangSessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_MangSessActionPerformed
        // TODO add your handling code here:
         Manage_Sessions mss = new Manage_Sessions(); 
            mss.setVisible(true);
            mss.pack();
            mss.setLocationRelativeTo (null);
            mss.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton4_MangSessActionPerformed

    private void jButton5_mangSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_mangSubActionPerformed
            Manage_Subjects ms = new Manage_Subjects(); 
            ms.setVisible(true);
            ms.pack();
            ms.setLocationRelativeTo (null);
            ms.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5_mangSubActionPerformed

    private void jButton6_mangLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_mangLecActionPerformed
        // TODO add your handling code here: 
           Manage_Lecturers ml = new Manage_Lecturers(); 
            ml.setVisible(true);
            ml.pack();
            ml.setLocationRelativeTo (null);
            ml.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton6_mangLecActionPerformed

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
            java.util.logging.Logger.getLogger(wellcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wellcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wellcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wellcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wellcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_lec;
    private javax.swing.JButton jButton2_sub;
    private javax.swing.JButton jButton3_Sess;
    private javax.swing.JButton jButton4_MangSess;
    private javax.swing.JButton jButton5_mangSub;
    private javax.swing.JButton jButton6_mangLec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
