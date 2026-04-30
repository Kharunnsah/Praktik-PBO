/*
Nama : Khairunnisah
NIm  : 2501082018
 */
package Pratikum300426;

/**
 *
 * @author Khairunnisah
 */
public class Hewan {
   protected String nama;
   
   public  Hewan(String nama){
       this.nama = nama;
   }
   public void Bersuara()
   {
       System.out.println("Hewan bersuara...");
   }
   public void TampilkanNama(){
       System.out.println("Nama hewan :"+nama);
   }
   
}
