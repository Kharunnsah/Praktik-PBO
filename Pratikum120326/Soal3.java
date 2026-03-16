/*
Nama  : Khairunnisah
Nim   : 2501082018
 */
package Pratikum120326;

import java.util.Scanner;

/**
 *
 * @author Khairunnisah
 */
public class Soal3 {
    public static void main(String[]args){
         Scanner input = new Scanner(System.in);
        int i,n,j,k;
        System.out.print("Masukkan Angka Pertama:");
        n = input.nextInt();
        System.out.print("Masukkan Angka Kedua :");
        k = input.nextInt();
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=k; j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
}