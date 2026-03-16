/*
Nama : Khairunnisah
 */
package Pratikum120326;


/**
 *
 * @author Khairunnisah
 */
import java.util.Scanner;
public class PengulanganDoWhile {
    public static void main(String [] args){
         Scanner input = new Scanner(System.in);
        int i,n;
        System.out.print("Masukkan bilangan :");
        n = input.nextInt();
        System.out.println("Pengulangan dari 1 sampai "+n);
        i=1; 
        do
        {
            System.out.print(i+"\t");
            i++;
            
        }while(i<=n);
        System.out.println("\nPengulangan dari" +n+ "sampai 1");
        i=n;
        do
        {
            System.out.print(i+"\t");
            i--;
        }while(i>=1);
                
    }
}
