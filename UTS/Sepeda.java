/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uts;

/**
 *
 * @author Khairunnisah
 */
public class Sepeda extends Kendaraan {
    protected String jmlSadel;
    protected int jmlGir;

    public Sepeda() {
    }

    public Sepeda(String jmlSadel, int jmlGir, int jmlRoda, String warna) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    

    public String getJmlSadel() {
        return jmlSadel;
    }

    public void setJmlSadel(String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    public int getJmlGir() {
        return jmlGir;
    }

    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("Jumlah Sadel:"+jmlSadel);
        System.out.println("Jumlah Gir:"+jmlGir);
    }

}