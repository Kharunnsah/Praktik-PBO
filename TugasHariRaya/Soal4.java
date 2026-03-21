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
public class Soal4 {
    public static void main(String[]args){
       Scanner input =new Scanner(System.in);
       int n;
       System.out.println("==== Program input bilangan ====");
       
       do
       {
           System.out.print("Masukkan angka :");
           n = input.nextInt();
        
       }while(n%2!=0);
      n = n+1;
      System.out.println("Angka genap +1 :"+n);
    }
}
