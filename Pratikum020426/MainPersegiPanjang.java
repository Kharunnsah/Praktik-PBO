/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum020426;

/**
 *
 * @author Khairunnisah
 */
import java.util.Scanner;
public class MainPersegiPanjang {
    public static void main(String[]args){
        // TODO application logic here
        //object pp1 menggunakan constructor 1
        PerrsegiPanjang pp1 = new PerrsegiPanjang();
        pp1.panjang=10;
        pp1.lebar=7;
        System.out.println("Akses method dalam main class");
        System.out.println("Luas Persegi panjang = "+pp1.HitungLuas());
        System.out.println("Keliling Persegi Panjang= "+pp1.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        
        // Object pp2 menggunakan constructor 2
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 2 menggunakan kontruuktor 2");
        PerrsegiPanjang pp2 = new PerrsegiPanjang(19,10);
        System.out.println("Luas Persegi panjang = "+pp2.HitungLuas());
        System.out.println("Keliling Persegi Panjang= "+pp2.HitungKel());
        
        System.out.println();
        pp2.TampilData();
        
        
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 3 menggunakan kontruuktor 3");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar:");
        int l = input.nextInt();
        PerrsegiPanjang pp3 = new PerrsegiPanjang(p,l);
        System.out.println();
        pp3.TampilData();
        
        
        
    }
    
}
