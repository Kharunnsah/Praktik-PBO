/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum120326;

/**
 *
 * @author Khairunnisah
 */
   import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n1,n2;
        int faktorial1 =1;
        int faktorial2 =1;
        int permutasi;
        
        System.out.print("Masukkan Nilai 1:");
        n1 = input.nextInt();
        System.out.print("Masukkan Nilai 2:");
        n2 = input.nextInt();
        for(i=1; i<=n1; i++)
        {
            faktorial1 = faktorial1*i;
           
        }
        for(i=1; i<=n1-n2; i++)
        {
            
            faktorial2 = faktorial2*i;
            
        }
       
        permutasi = faktorial1/faktorial2;
        System.out.println("Nilai permutasi :"+permutasi);
        
   
}
    
}  

