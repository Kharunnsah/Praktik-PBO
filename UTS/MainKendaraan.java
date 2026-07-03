/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uts;

import java.util.Scanner;

/**
 *
 * @author Khairunnisah
 */
public class MainKendaraan {
   public static void main(String[]args){
       Sepeda sepeda = new Sepeda();
       sepeda.setWarna("Biru");
       sepeda.setJmlGir(2);
       sepeda.setJmlRoda(2);
       sepeda.setJmlSadel("6");
       
       System.out.println("===== Data Sepeda =====");
       System.out.println("Warna : "+sepeda.getWarna());
       System.out.println("Jumlah Gir : "+sepeda.getJmlGir());
       System.out.println("Roda : "+sepeda.getJmlRoda());
       System.out.println("Jumlah Sadel : "+sepeda.getJmlSadel());
       System.out.println();
       sepeda.Cetak();
       
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan Warna sepeda:");
       String warna = input.nextLine();
       System.out.print("Masukkan Jumlah Gir:");
       int jmlGir = input.nextInt();
       System.out.print("Masukkan Jumlah Roda:");
       int jmlRoda = input.nextInt();
       input.nextLine();
       System.out.print("Masukkan Jumlah Sadel:");
       String jmlSadel = input.nextLine();
       System.out.print("Masukkan kecepatan maks:");
       int kecepatanMaks = input.nextInt();
       System.out.print("Masukkan Jarak Tempuh:");
       int jarakTempuh = input.nextInt();
       SepedaListrik se = new SepedaListrik(warna,jmlGir,jmlRoda,jmlSadel,kecepatanMaks,jarakTempuh);
       System.out.println();
       se.Cetak();
       
       
       
       
       
       
   } 
}
