/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kakykustore;

public class ModelManajemen {
    private String kodeBarang;
    private String pelanggan;
    private String jenisBarang;
    private int stok;
    private int harga;
    
    public ModelManajemen(String kodeBarang, String pelanggan, String jenisBarang, int stok, int harga){
        this.kodeBarang = kodeBarang;
        this.pelanggan = pelanggan;
        this.jenisBarang = jenisBarang;
        this.stok = stok;
        this.harga = harga;
    }
    
    public void setKodeBarang(String kodeBarang){
        this.kodeBarang = kodeBarang;
    }
    public void setPelanggan(String pelanggan){
        this.pelanggan = pelanggan;
    }
    public void setJenisBarang(String jenisBarang){
        this.jenisBarang = jenisBarang;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public String getKodeBarang(){
        return kodeBarang;
    }
    public String getPelanggan(){
        return pelanggan;
    }
    public String getJenisBarang(){
        return jenisBarang;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
}
