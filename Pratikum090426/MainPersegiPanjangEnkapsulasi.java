/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum090426;




/**
 *
 * @author Khairunnisah
 */
import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {
   public static void main(String[]args){
        // TODO application logic here
        //object pp1 menggunakan constructor 1
        System.out.println("Akses method dalam main class");
        System.out.print("\nJumlah Objek = " +PersegiPanjangEnkapsulasi.getJumlahObjek());
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(10);
        pp1.setlebar(7);
        System.out.println("\nLuas Persegi panjang\t\t:"+pp1.HitungLuas());
        System.out.println("Keliling Persegi Panjang\t:"+pp1.HitungKel());
        pp1.TampilData();
        System.out.println();
        
        // Object pp2 menggunakan constructor 2
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 2 menggunakan kontruuktor 2");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(19,10);
        System.out.println("Luas Persegi panjang\t\t:"+pp2.HitungLuas());
        System.out.println("Keliling Persegi Panjang\t:"+pp2.HitungKel());
        pp2.TampilData();
        System.out.println();
        
        
        System.out.println("\nAkses method dalam main class");
        System.out.println("objek 3 menggunakan kontruuktor 3");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang\t: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar\t\t:");
        int l = input.nextInt();
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(p,l);
        pp3.TampilData();
        System.out.print("\nJumlah Objek =" +PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        
    }
     
}
