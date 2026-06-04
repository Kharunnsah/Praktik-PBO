/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum210526;

/**
 *
 * @author Khairunnisah
 */
public class PembayaranTransfer extends Pembayaran implements CetakStruk{
     private String namaBank;

    public PembayaranTransfer() {
    }

     
    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    

    @Override
    public void prosesPembayaran() {
      System.out.println("Proses Pembayaran secara Transfer");
      System.out.println("Bank        : "+namaBank);
      System.out.println("Id Tranakasi:"+idTransaksi);
      System.out.println("Jumlah Bayar: Rp."+jumlahBayar);
    }

    @Override
    public void cetak() {
      System.out.println("------ Struk Pembayaran Transfer -------");
       System.out.println("Bank        = " +namaBank);
      System.out.println("Id Transaksi = " +idTransaksi);
      System.out.println("Jumlah Bayar = " +jumlahBayar);
    

    }
    
     
}
