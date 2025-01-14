/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kakykustore;

import javax.swing.JOptionPane;

public class ViewManajemenBarang extends javax.swing.JFrame {
    AdminController admin = new AdminController();
    /**
     * Creates new form ViewManajemenBarang
     */
    public ViewManajemenBarang() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFKodeBarang = new javax.swing.JTextField();
        TFStok = new javax.swing.JTextField();
        TFHarga = new javax.swing.JTextField();
        TFJenisBarang = new javax.swing.JComboBox<>();
        jSimpanButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelist2 = new javax.swing.JTable();
        jUpdateButton = new javax.swing.JButton();
        jHapusButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TFPelanggan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MANAJEMEN BARANG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Jenis Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Jumlah Stok");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Harga");

        TFStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFStokActionPerformed(evt);
            }
        });

        TFJenisBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adidas Adizero", "Nike Airzoom", "Hoka Clifton", "Ortuseight Hyperglide" }));

        jSimpanButton.setText("Simpan");
        jSimpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanButtonActionPerformed(evt);
            }
        });

        tablelist2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Pelanggan", "Jenis Barang", "Stok", "Harga"
            }
        ));
        tablelist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablelist2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablelist2);

        jUpdateButton.setText("Update");
        jUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateButtonActionPerformed(evt);
            }
        });

        jHapusButton.setText("Hapus");
        jHapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Pelanggan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jSimpanButton)
                .addGap(18, 18, 18)
                .addComponent(jUpdateButton)
                .addGap(18, 18, 18)
                .addComponent(jHapusButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TFKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(297, 297, 297)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFJenisBarang, 0, 224, Short.MAX_VALUE)
                            .addComponent(TFStok, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TFHarga)
                            .addComponent(TFPelanggan))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSimpanButton)
                    .addComponent(jUpdateButton)
                    .addComponent(jHapusButton))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFStokActionPerformed

    private void jSimpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanButtonActionPerformed
        String kodeBarang = TFKodeBarang.getText();
        String pelanggan = TFPelanggan.getText();
        String jenisBarang = TFJenisBarang.getSelectedItem().toString();
        int stok = Integer.parseInt(TFStok.getText());
        int harga = Integer.parseInt(TFHarga.getText());
        admin.InsertData(kodeBarang, pelanggan, jenisBarang, stok, harga);
        tablelist2.setModel(admin.showData());
    }//GEN-LAST:event_jSimpanButtonActionPerformed

    private void jUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateButtonActionPerformed
        String kdBarang = TFKodeBarang.getText();
        String customer = TFPelanggan.getText();
        String jenis = TFJenisBarang.getSelectedItem().toString();
        int stok = Integer.parseInt(TFStok.getText());
        int harga = Integer.parseInt(TFHarga.getText());

        // Create an instance of AdminController
        AdminController adminController = new AdminController();
    
        // Call the UpdateData method to update the database
        adminController.UpdateData(kdBarang, customer, jenis, stok, harga);
    
        // After the update, refresh the table data
        tablelist2.setModel(adminController.showData()); // Reload the table with updated data
    
        // Show a success message
        JOptionPane.showMessageDialog(this, "Data produk berhasil diupdate.");
    }//GEN-LAST:event_jUpdateButtonActionPerformed

    private void jHapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusButtonActionPerformed
        String kdBarang = TFKodeBarang.getText();  // Get the kdBarang from the text field
    
    // Confirm deletion
    int confirmation = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin menghapus produk dengan kode barang " + kdBarang + "?", 
            "Konfirmasi Penghapusan", 
            JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
        AdminController adminController = new AdminController();
        boolean isDeleted = adminController.deleteData(kdBarang); // Call deleteData method to delete product
        
        if (isDeleted) {
            JOptionPane.showMessageDialog(this, "Produk berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(this, "Produk gagal dihapus.");
        }
        
        // Update the table after deletion
        tablelist2.setModel(adminController.showData());
    }
    }//GEN-LAST:event_jHapusButtonActionPerformed

    private void tablelist2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablelist2MouseClicked
    // Get the index of the row that was clicked
    int selectedRow = tablelist2.getSelectedRow();
    
    // Get the values of the selected row
    String kodeBarang = tablelist2.getValueAt(selectedRow, 0).toString(); // Column 0 -> Kode Barang
    String pelanggan = tablelist2.getValueAt(selectedRow, 1).toString(); // Column 1 -> Customer
    String jenisBarang = tablelist2.getValueAt(selectedRow, 2).toString(); // Column 2 -> Jenis Barang
    String stok = tablelist2.getValueAt(selectedRow, 3).toString(); // Column 3 -> Jumlah Stok
    String harga = tablelist2.getValueAt(selectedRow, 4).toString(); // Column 4 -> Harga
    
    // Set the values to the text fields for editing
    TFKodeBarang.setText(kodeBarang);  // Set Kode Barang to the text field
    TFPelanggan.setText(pelanggan); // Set Pelanggan to the text field
    TFJenisBarang.setSelectedItem(jenisBarang); // Set Jenis Barang to the combo box
    TFStok.setText(stok);          // Set Stok to the text field
    TFHarga.setText(harga);        // Set Harga to the text field
    }//GEN-LAST:event_tablelist2MouseClicked

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
            java.util.logging.Logger.getLogger(ViewManajemenBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewManajemenBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewManajemenBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewManajemenBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewManajemenBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFHarga;
    private javax.swing.JComboBox<String> TFJenisBarang;
    private javax.swing.JTextField TFKodeBarang;
    private javax.swing.JTextField TFPelanggan;
    private javax.swing.JTextField TFStok;
    private javax.swing.JButton jHapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSimpanButton;
    private javax.swing.JButton jUpdateButton;
    private javax.swing.JTable tablelist2;
    // End of variables declaration//GEN-END:variables
}
