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
public class MainMahasiswa {
    public static void main(String[]args){
    Mahasiswa pp1 = new Mahasiswa();
        pp1.nama="Khairunnisah";
        pp1.nobp="2501082018";
        pp1.uas=90.1;
        pp1.uts=80.5;
        pp1.tugas=100;
        System.out.println("Akses method dalam main class");
        System.out.println("objek 1 menggunakan kontruuktor 1");
        System.out.println("Nilai Akhir Mahasiswa = "+pp1.HitungNilaiAkhir());
        System.out.println();
        pp1.TampilData();
        
        
        System.out.println("\nakses method dalam main class");
        System.out.println("objek 2 menggunakan kontruuktor 2");
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai Mahasiswa");
        System.out.print("Masukkan nama:");
        String nama =input.nextLine();
        System.out.print("Masukkan NoBP:");
        String nobp =input.nextLine();
        System.out.print("Masukkan Uas: ");
        double us = input.nextDouble();
        System.out.print("Masukkan Uts:");
        double ut = input.nextDouble();
        System.out.print("Masukkan Tugas:");
        double tgs = input.nextDouble();
        Mahasiswa pp2 = new Mahasiswa(us,ut,tgs);
        System.out.println();
        pp2.TampilData();
           
    }    
}
