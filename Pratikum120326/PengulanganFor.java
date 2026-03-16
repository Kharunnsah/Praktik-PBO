/*
Nama : Khairunnisah
 */
package Pratikum120326;

/**
 *
 * @author Khairunnisah
 */
import java.util.Scanner;
public class PengulanganFor {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int i,n;
        System.out.print("Masukkan bilangan :");
        n = input.nextInt();
        System.out.println("Pengulangan dari 1 sampai "+n);
        for(i=1; i<=n; i++)
        {
            System.out.print(i+"\t");
        }
        System.out.println("\nPengulangan dari" +n+ "sampai 1");
        for(i=n; i>=1; i--)
        {
            System.out.print(i+"\t");
        }
    }
    
}
