/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kakykustore;

public class ModelPesanan {

    private String namaPelanggan;
    private String alamat;
    private int jumlahBarang;
    private String jenisBarang;
    
    public ModelPesanan(String namaPelanggan, String alamat, String jenisBarang, int jumlahBarang){
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.jenisBarang = jenisBarang;
        this.jumlahBarang = jumlahBarang;
    }
    
    public void setNamaPelanggan(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setJenisBarang(String jenisBarang){
        this.jenisBarang = jenisBarang;
    }
    public void setJmlBarang(int jumlahBarang){
        this.jumlahBarang = jumlahBarang;
    }
    
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJenisBarang(){
        return jenisBarang;
    }
    public int getJumlahBarang(){
        return jumlahBarang;
    }
}
