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
    public class transaksi extends pembeli {
    public static int total;
    
    public transaksi(int total, String nama_pembeli, String alamat, String no_telpon, int id_pembeli, 
            String nama_barang, int id_barang, String merk_barang, int harga_barang)
    {
        super(id_barang, nama_barang, harga_barang, merk_barang, id_pembeli, nama_pembeli, alamat, no_telpon);
        transaksi.total = total;
    }  
    
    public void tes()
    {
        super.tes();
        System.out.println("Jumlah Barang   : "+transaksi.total);
    }
    
    public static void main(String[] args){
        System.out.println("**********BUKAN TOKO SAYA*************");
        transaksi uji = new transaksi(24, "Bearnad Pradhana", "Jl.Danau Laut Tawar", "089936782330", 16, "Pencil Case", 12, "HM satujam", 10000);
        uji.tes();
        System.out.println("**************************************");
        System.out.println("Kasir           : Kepo");
        System.out.println("Tanggal         : 31/08/2018");
        
    }
}
