/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum210526;

/**
 *
 * @author Khairunnisah
 */
public abstract class Karyawan {
    protected String nik;
    protected String nama;

    public Karyawan() {
    }

    public Karyawan(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
       public abstract void prosesKaryawan();
}
