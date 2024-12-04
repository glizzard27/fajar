/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kakykustore;
import entity.TbMbrg;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.util.List;

public class AdminController {
    ArrayList<ModelManajemen> ArrayData;
    DefaultTableModel tabelModel;
    
    public AdminController(){
        ArrayData = new ArrayList<ModelManajemen>();
    }
    
    public void InsertData(String kodeBarang, String pelanggan, String jenisBarang, int stok, int harga){
    Session session = HibernateUtil.getSessionFactory().openSession(); // Assuming you have a HibernateUtil class
    Transaction tx = session.beginTransaction();
    try {
        TbMbrg mnj = new TbMbrg(kodeBarang, pelanggan, jenisBarang, stok, harga);
        session.save(mnj);
        tx.commit();
    } catch (Exception e) {
        if (tx != null) tx.rollback();
        e.printStackTrace();
    } finally {
        session.close();
    }
    }
    
    public static void UpdateData(String kodeBarang, String pelanggan, String jenisBarang, int stok, int harga) {
    Session session = HibernateUtil.getSessionFactory().openSession(); // Mengambil session Hibernate
    Transaction tx = session.beginTransaction(); // Memulai transaksi
    try {
        // Mencari objek berdasarkan kodeBarang
        TbMbrg tbmbrg = (TbMbrg) session.get(TbMbrg.class, kodeBarang); // Cast the result to TbMbrg
        
        if (tbmbrg != null) {
            // Update data produk
            tbmbrg.setPelanggan(pelanggan);
            tbmbrg.setJenisBarang(jenisBarang);
            tbmbrg.setStok(stok);
            tbmbrg.setHarga(harga);

            // Simpan perubahan
            session.update(tbmbrg);
            tx.commit(); // Komit transaksi
        } else {
            System.out.println("Produk dengan kode barang " + kodeBarang + " tidak ditemukan.");
        }
    } catch (Exception e) {
        if (tx != null) tx.rollback(); // Rollback jika terjadi error
        e.printStackTrace();
    } finally {
        session.close(); // Menutup session
    }
}

    public boolean deleteData(String kodeBarang) {
    Session session = HibernateUtil.getSessionFactory().openSession(); // Open Hibernate session
    Transaction tx = null;
    boolean isDeleted = false;

    try {
        tx = session.beginTransaction();
        
        // Retrieve the product object based on the kodeBarang
        TbMbrg tbmbrg = (TbMbrg) session.get(TbMbrg.class, kodeBarang);
        
        if (tbmbrg != null) {
            // Delete the product
            session.delete(tbmbrg);
            tx.commit(); // Commit the transaction
            isDeleted = true;
        } else {
            System.out.println("Produk dengan kode barang " + kodeBarang + " tidak ditemukan.");
        }
    } catch (Exception e) {
        if (tx != null) tx.rollback(); // Rollback if error occurs
        e.printStackTrace();
    } finally {
        session.close(); // Close the session
    }

    return isDeleted;
    }
    
    public DefaultTableModel showData(){
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction tx = null;
    List<TbMbrg> products = null;
    
    try {
        tx = session.beginTransaction();
        // Retrieve all products from the database
        products = session.createQuery("FROM TbMbrg").list(); // Fetch all rows from Mproduk
        tx.commit();
    } catch (Exception e) {
        if (tx != null) tx.rollback();  // Rollback transaction if error occurs
        e.printStackTrace();
    } finally {
        session.close();  // Close the session
    }

    // Define the column names for the table
    String[] columnNames = {"Kode Barang", "Pelanggan", "Jenis Barang", "Jumlah Stok", "Harga"};
    
    // Create an Object array to hold the data
    Object[][] data = new Object[products.size()][5];

    // Fill the data array with values from the products list
    for (int i = 0; i < products.size(); i++) {
        TbMbrg product = products.get(i);
        data[i] = new Object[]{product.getKodeBarang(), product.getPelanggan(), product.getJenisBarang(), product.getStok(), product.getHarga()};
    }

    // Return a new DefaultTableModel with the data and column names
    return new DefaultTableModel(data, columnNames);
    }
}
