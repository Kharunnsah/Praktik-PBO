/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum300426;

/**
 
 * @author Khairunnisah
 */
public class MainHewan {
    public static void main(String[]args){
        Hewan hewanUmum = new Hewan("Makhluk");
        Kucing kucingku = new Kucing("Mimi");
        Anjing anjingku = new Anjing("Bobby");
       
        
        hewanUmum.TampilkanNama();
        hewanUmum.Bersuara();
        
        System.out.println();
        kucingku.TampilkanNama();
        kucingku.Bersuara();
        
        System.out.println();
        anjingku.TampilkanNama();
        anjingku.Bersuara();
     }
}
