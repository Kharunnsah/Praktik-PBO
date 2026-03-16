/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum120326;

/**
 *
 * @author Khairunnisah
 */
import java.util.Scanner;
public class PengulanganWhile {
  public static void main(String [] args)
  {
       Scanner input = new Scanner(System.in);
        int i,n;
        System.out.print("Masukkan bilangan :");
        n = input.nextInt();
        System.out.println("Pengulangan dari 1 sampai "+n);
        i=1;
        while(i<=n)
           {
              System.out.print(i+"\t");
              i++;
            }
        System.out.println("\nMenampilkan angka dari" +n+ "sampai 1");
        i=n;
        while(i>=1)
        {
            System.out.print(i+"\t");
            i--;
        }
        
    }    
  
}
