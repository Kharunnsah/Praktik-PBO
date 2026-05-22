/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum210526;

/**
 *
 * @author Khairunnisah
 */
public class KaryawanKontrak extends Karyawan {
    private double uangMakan  = 300000;

    
    public KaryawanKontrak() {
    }

    public KaryawanKontrak(String nik, String nama) {
        super(nik, nama);
    }

    
    public double getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }

      
    @Override
    public void prosesKaryawan() {
       System.out.println("Nik            :"+nik);
       System.out.println("Nama Karyawan  :"+nama);
       System.out.println("Uang Makan     :"+uangMakan);
      
       
    }
    
}
