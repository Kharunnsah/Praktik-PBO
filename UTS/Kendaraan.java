/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uts;

/**
 *
 * @author Khairunnisah
 */
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;

    public Kendaraan() {
    }

    public Kendaraan(int jmlRoda, String warna) {
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void Cetak(){
        System.out.println("Jumlah Roda:"+jmlRoda);
        System.out.println("Warna:"+warna);
    }
    
}

