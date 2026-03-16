/*
Nama  : Khairunnisah
Kelas : 2501082018
 */
package Pratikum120326;

import java.util.Scanner;

/**
 *
 * @author Khairunnisah
 */
import java.util.Scanner;
public class Soal1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n,jumlah;
        System.out.print("Masukkan Angka :");
        n = input.nextInt();    
        jumlah=1;
        while(n>10)
           {
               
               System.out.print("Masukkan Angka :");
               n = input.nextInt(); 
               jumlah = jumlah+1;
            }
            System.out.print("Banyak inputan Angka :" + jumlah);
           
    }
    
}
