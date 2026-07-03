/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uts;

/**
 *
 * @author Khairunnisah
 */
public class SepedaListrik  extends Sepeda{
    protected int kecepatanMaks;
    protected int jarakTempuh;

    public SepedaListrik() {
    }

   


    public SepedaListrik(String jmlSadel, int kecepatanMaks, int jarakTempuh, String warna, int jmlGir, int jmlRoda) {
        super(jmlSadel, jmlGir, jmlRoda, warna);
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }

  

   
    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    public int getJarakTempuh() {
        return jarakTempuh;
    }

    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("Kecepatan Maksimum :"+kecepatanMaks);
        System.out.println("Jarak Tempuh:"+jarakTempuh);
    }
    
}
