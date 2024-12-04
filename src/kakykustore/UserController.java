/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kakykustore;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class UserController {
    ArrayList<ModelPesanan> ArrayData;
    DefaultTableModel tabelModel;
    
    public UserController(){
        ArrayData = new ArrayList<ModelPesanan>();
    }
    
    public void InsertData(String namaPelanggan, String alamat, String jenisBarang, int jumlah){
        ModelPesanan pesan = new ModelPesanan(namaPelanggan, alamat, jenisBarang, jumlah);
        ArrayData.add(pesan);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"Nama Pelanggan", "Alamat", "Jenis Barang", "Jumlah"};
        Object[][] objData = new Object[ArrayData.size()][4];
        int i = 0;

        for(ModelPesanan n : ArrayData){
            Object[] arrData = {n.getNamaPelanggan(), n.getAlamat(), n.getJenisBarang(), n.getJumlahBarang()};
            objData[i] = arrData;
            i++;
        }

        tabelModel = new DefaultTableModel(objData, kolom) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Perbaiki nama metode dari inCollEditTable
            }
        };
        return tabelModel;
    }
}
