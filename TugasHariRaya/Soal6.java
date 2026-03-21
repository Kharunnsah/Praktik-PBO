/*
Nama : Khairunnisah
Nim  : 2501082018
*/
package TugasHariRaya;

/**
 *
 * @author Khairunnisah
 */
import java.util.Scanner;
public class Soal6 {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       int umur;
       int dekade;
       System.out.println("Program Ulang Tahun PNP");
       System.out.println("=======================");
       System.out.print("Masukkan Umur PNP : ");
       umur =input.nextInt();
       if(umur%10 ==0)
       {
         dekade = umur/10;
         System.out.println("Dekade PNP ke " + dekade);  
       }
       else
       {
           System.out.println("Dies Natalis PNP ke " +umur);
       }
    }
}
