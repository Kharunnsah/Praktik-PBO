/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum210526;

/**
 *
 * @author Khairunnisah
 */
public class PembayaranEwallet extends Pembayaran {
    private String namaEwallet;

    public PembayaranEwallet(String namaEwallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEwallet = namaEwallet;
    }

    public String getNamaEwallet() {
        return namaEwallet;
    }

    public void setNamaEwallet(String namaEwallet) {
        this.namaEwallet = namaEwallet;
    }

  

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran Melalui E-wallet");
        System.out.println("Nama E-wallet :"+namaEwallet);
        System.out.println("Id Transaksi  :"+idTransaksi);
        System.out.println("Jumlah Bayar  : Rp."+jumlahBayar);
    }

   
    
}
