/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class StaffMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public StaffMainMenu() {
        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jCheckRoom = new javax.swing.JButton();
        jDeleteStaff = new javax.swing.JButton();
        jUpdateRoom = new javax.swing.JButton();
        jRegister = new javax.swing.JButton();
        jDeleteRoom = new javax.swing.JButton();
        jViewRoom = new javax.swing.JButton();
        jLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staff Menu");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Hostel Management System");

        jCheckRoom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckRoom.setText("Check Room Availability");
        jCheckRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRoomActionPerformed(evt);
            }
        });

        jDeleteStaff.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jDeleteStaff.setText("Delete Staff Details");
        jDeleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteStaffActionPerformed(evt);
            }
        });

        jUpdateRoom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jUpdateRoom.setText("Update Room Details");
        jUpdateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateRoomActionPerformed(evt);
            }
        });

        jRegister.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRegister.setText("Register Room");
        jRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegisterActionPerformed(evt);
            }
        });

        jDeleteRoom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jDeleteRoom.setText("Delete Room Details");
        jDeleteRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteRoomActionPerformed(evt);
            }
        });

        jViewRoom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jViewRoom.setText("View Room Details");
        jViewRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewRoomActionPerformed(evt);
            }
        });

        jLogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCheckRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDeleteRoom)
                            .addComponent(jRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jViewRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jUpdateRoom))
                            .addComponent(jDeleteStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jViewRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUpdateRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDeleteRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDeleteStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jUpdateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateRoomActionPerformed
      //  new UpdateRoomStatus().setVisible(true);
        
    }//GEN-LAST:event_jUpdateRoomActionPerformed

    private void jRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegisterActionPerformed
      //  new StaffRegister().setVisible(true);
    }//GEN-LAST:event_jRegisterActionPerformed

    private void jViewRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewRoomActionPerformed
      //  new ViewRoomDetails().setVisible(true);
    }//GEN-LAST:event_jViewRoomActionPerformed

    private void jCheckRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRoomActionPerformed
       // new CheckRoomAvailability().setVisible(true);
    }//GEN-LAST:event_jCheckRoomActionPerformed

    private void jDeleteRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteRoomActionPerformed
      //  new DeleteRoom().setVisible(true);
    }//GEN-LAST:event_jDeleteRoomActionPerformed

    private void jDeleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteStaffActionPerformed
      //  new DeleteStaff().setVisible(true);
    }//GEN-LAST:event_jDeleteStaffActionPerformed

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
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCheckRoom;
    private javax.swing.JButton jDeleteRoom;
    private javax.swing.JButton jDeleteStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jLogout;
    private javax.swing.JButton jRegister;
    private javax.swing.JButton jUpdateRoom;
    private javax.swing.JButton jViewRoom;
    // End of variables declaration//GEN-END:variables
}
