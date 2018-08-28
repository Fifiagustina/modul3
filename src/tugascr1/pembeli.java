/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugascr1;

/**
 *
 * @author Fifi Agustina
 */
public class pembeli extends barang {
    private int id_pembeli;
    private String nama_pembeli;
    private String alamat;
    private String no_telpon;
    
    public pembeli(int id_barang, String nama_barang, int harga_barang, String merk_barang){
      super(id_barang, nama_barang, harga_barang, merk_barang);
    }
    
    public pembeli(int id_barang, String nama_barang, int harga_barang, String merk_barang,
                   int id_pembeli, String nama_pembeli, String alamat, String no_telpon){
      super(id_barang, nama_barang, harga_barang, merk_barang);
      this.id_pembeli = id_pembeli;
      this.nama_pembeli = nama_pembeli;
      this.alamat = alamat;
      this.no_telpon = no_telpon;
    }
    
    public void tes() {
        super.tes();
        System.out.println("Id pembeli      : "+this.id_pembeli);
        System.out.println("Nama pembeli    : "+this.nama_pembeli);
        System.out.println("Alamat          : "+this.alamat);
        System.out.println("No Telpon       : "+this.no_telpon);
    }
        
    }
