/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YPAB-LAB-RPL
 */
public class PendaftaranSekolah extends javax.swing.JFrame {
public static Connection con() throws ClassNotFoundException, SQLException{
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String mysqlUrl = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=Tandrio;TrustServerCertificate=true;Encrypt=false;";
        Connection con = DriverManager.getConnection(mysqlUrl, "Tandrio", "Drio2006");
        return con;
     }
    /**
     * Creates new form PendaftaranSekolah
     */
    public PendaftaranSekolah() {
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
        Jenis_Kelamin = new javax.swing.JTextField();
        Select = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Jurusan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Password = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        Alamat = new javax.swing.JTextField();
        Tanggal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        Jenis_Kelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jenis_KelaminActionPerformed(evt);
            }
        });

        Select.setText("Mencari Data...");

        jLabel1.setText("Nama");

        jLabel2.setText("Jurusan");

        jLabel3.setText("Email");

        jLabel7.setText("Password");

        jLabel8.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("SEKOLAH LOTURI BATAM");

        jLabel9.setText("Tanggal Lahir");

        jLabel10.setText("Alamat");

        Jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JurusanActionPerformed(evt);
            }
        });

        jLabel11.setText("Copyright © 2023 Sekolah Loturi. All right reserved");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });

        jButton1.setText("SELECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Consol.png"))); // NOI18N

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });

        Tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton4)
                            .addGap(14, 14, 14)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Select)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(25, 25, 25)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Jenis_Kelamin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                        .addComponent(jSeparator3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Jenis_Kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(106, 106, 106)
                .addComponent(Select)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jenis_KelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jenis_KelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jenis_KelaminActionPerformed

    private void JurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JurusanActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con;
        String nama = Nama.getText();
        String jurusan = Jurusan.getText();
        String email = Email.getText();
        String password = Password.getText();
        String jenis_kelamin = Jenis_Kelamin.getText();
        String tanggal_lahir = Tanggal.getText();
        String alamat = Alamat.getText();
        try {
            con = con();
            PreparedStatement pst = con.prepareStatement(String.format("SELECT * FROM Tabel_mhs WHERE Nama = '%s' "));
            ResultSet rst = pst.executeQuery();
            while(rst.next()){
                String namaDB = rst.getString("Nama");
                String jurusanDB = rst.getString("Jurusan");
                String emailDB = rst.getString("Email");
                String passwordDB = rst.getString("Password");
                String jenis_kelaminDB = rst.getString("Jenis_Kelamin");
                String tanggal_lahirDB = rst.getString("Tanggal_Lahir");
                String alamatDB = rst.getString("Alamat");

                if(namaDB.equals(Nama)){
                    Select.setText(namaDB + " " + jurusanDB + " " + emailDB + " " + passwordDB + " " + jenis_kelaminDB + " " + tanggal_lahirDB + " " + alamatDB);
                } else {
                    Select.setText("Data Tidak Ada Di DataBase");
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection con;
        String nama = Nama.getText();
        String jurusan = Jurusan.getText();
        String email = Email.getText();
        String password = Password.getText();
        String jenis_kelamin = Jenis_Kelamin.getText();
        String tanggal_lahir = Tanggal.getText();
        String alamat = Alamat.getText();
        try {
            con = con();
            PreparedStatement pst = con.prepareStatement(String.format("UPDATE Tabel_mhs SET  Jurusan = '%s', Email = '%s', Password = '%s', Jenis_Kelamin = '%s', Tanggal_Lahir = '%s', Alamat = '%s' WHERE Nama = '%s' ",  jurusan, email, password, jenis_kelamin, tanggal_lahir, alamat));
            ResultSet rst = pst.executeQuery();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con;
        String nama = Nama.getText();
        String jurusan = Jurusan.getText();
        String email = Email.getText();
        String password = Password.getText();
        String jenis_kelamin = Jenis_Kelamin.getText();
        String tanggal_lahir = Tanggal.getText();
        String alamat = Alamat.getText();
        try {
            con = con();
            PreparedStatement pst = con.prepareStatement(String.format("INSERT INTO Tabel_mhs (Nama, Jurusan, Email, Password, Jenis_Kelamin, Tanggal_Lahir, Alamat) VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s')",  nama, jurusan, email, password, jenis_kelamin, tanggal_lahir, alamat));
            ResultSet rst = pst.executeQuery();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Connection con;
        String nama = Nama.getText();
        String jurusan = Jurusan.getText();
        String email = Email.getText();
        String password = Password.getText();
        String jenis_kelamin = Jenis_Kelamin.getText();
        String tanggal_lahir = Tanggal.getText();
        String alamat = Alamat.getText();
        try {
            con = con();
            PreparedStatement pst = con.prepareStatement(String.format("DELETE FROM Tabel_mhs WHERE Nama = '%s' "));
            ResultSet rst = pst.executeQuery();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void TanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TanggalActionPerformed

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
            java.util.logging.Logger.getLogger(PendaftaranSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendaftaranSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendaftaranSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendaftaranSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranSekolah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Jenis_Kelamin;
    private javax.swing.JTextField Jurusan;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel Select;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
