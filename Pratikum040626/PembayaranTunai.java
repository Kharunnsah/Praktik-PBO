/*
Nama : Khairunnisah
Nim  : 2502082018
 */
package Pratikum210526;

/**
 *
 * @author Khairunnisah
 */
public class PembayaranTunai extends Pembayaran implements CetakStruk{
  
    private double uang;


    public PembayaranTunai(double uang ,double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang=uang;
       
    }

    
    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    @Override
    public void prosesPembayaran() {
      System.out.println("Proses Pembayaran secara Tunai");
      System.out.println("Id Transaksi :"+idTransaksi);
      System.out.println("Jumlah bayar :"+jumlahBayar);
      System.out.println("Uang yang diberikan: Rp."+uang);
      if(uang>=jumlahBayar){
          double kembalian = uang-jumlahBayar;
          System.out.println("Proses Pembayaran Berhasil!");
          System.out.println("Uang Kembalian: Rp."+kembalian);
      }
      else{
          double kekurangan =jumlahBayar-uang;
          System.out.println("Proses Pembayaran Gagal!!");
          System.out.println("Uang Anda kurang sebanyak:Rp."+kekurangan);
      }
    }
    public void cetak(){
        System.out.println("------ Struk Pembayaran Tunai-------");
        System.out.println("Id Transaksi = " +idTransaksi);
        System.out.println("Jumlah Bayar ="  +jumlahBayar);
        System.out.println("Uang Bayar   ="  +uang);



    }
    
    
}
