/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author A456U
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
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

        editnama = new javax.swing.JTextField();
        editkelas = new javax.swing.JTextField();
        editalamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hasilalamat = new javax.swing.JTextField();
        hasilnama = new javax.swing.JTextField();
        hasilkelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "Latihan1.Latihan1_jPanel1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        Process = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        editnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnamaActionPerformed(evt);
            }
        });
        getContentPane().add(editnama);
        editnama.setBounds(127, 147, 205, 27);
        getContentPane().add(editkelas);
        editkelas.setBounds(127, 180, 205, 27);
        getContentPane().add(editalamat);
        editalamat.setBounds(127, 218, 205, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(59, 151, 38, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Kelas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(59, 184, 39, 17);

        hasilalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilalamatActionPerformed(evt);
            }
        });
        getContentPane().add(hasilalamat);
        hasilalamat.setBounds(127, 397, 205, 28);

        hasilnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilnamaActionPerformed(evt);
            }
        });
        getContentPane().add(hasilnama);
        hasilnama.setBounds(127, 319, 205, 28);

        hasilkelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilkelasActionPerformed(evt);
            }
        });
        getContentPane().add(hasilkelas);
        hasilkelas.setBounds(127, 358, 205, 28);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(59, 324, 38, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Kelas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(59, 363, 39, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Alamat");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(59, 402, 46, 17);

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Amatic SC", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Formulir");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(147, 39, 144, 61);

        Process.setText("Proces");
        Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Alamat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(Process, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Process, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 470);

        setSize(new java.awt.Dimension(416, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnamaActionPerformed

    private void ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessActionPerformed
        // TODO add your handling code here:
        String nama = editnama.getText();
        hasilnama.setText(nama);
        String kelas = editkelas.getText();
        hasilkelas.setText(kelas);
        String alamat = editalamat.getText();
        hasilalamat.setText(alamat);
    }//GEN-LAST:event_ProcessActionPerformed

    private void hasilalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilalamatActionPerformed

    private void hasilnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilnamaActionPerformed

    private void hasilkelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilkelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilkelasActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Process;
    private javax.swing.JTextField editalamat;
    private javax.swing.JTextField editkelas;
    private javax.swing.JTextField editnama;
    private javax.swing.JTextField hasilalamat;
    private javax.swing.JTextField hasilkelas;
    private javax.swing.JTextField hasilnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
