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
public class MainAkunBankEnkaptulasi {
    public static void main(String[]args){
    AkunBankEnkaptulasi ak = new AkunBankEnkaptulasi();
    ak.setNama("Khairunnisah");
    ak.setNoRekening("72xxxxxx");
    ak.setSaldo(1000000);
    ak.TampilkanInfo();
    
    System.out.println();
    Scanner input = new Scanner(System.in);
    System.out.print("\nMasukan Jumlah Deposit = ");
    double deposit = input.nextDouble();
    ak.deposit(deposit);
    ak.TampilkanInfo();
    System.out.print("\nMasukan Jumlah Withdraw =");
    double withdraw = input.nextDouble();
    ak.withdraw(withdraw);
    ak.TampilkanInfo();
    System.out.println();
    
    System.out.print("\nMasukan Jumlah Deposit = ");
    double depositt = input.nextDouble();
    System.out.print("Masukan Jumlah Withdraw =");
    withdraw = input.nextDouble();
    AkunBankEnkaptulasi ak1 = new AkunBankEnkaptulasi("72xxxxxxx","Nisa",1000000);
    ak1.withdraw(withdraw);
    ak1.deposit(withdraw);
    ak1.TampilkanInfo();
        
    
    }
    
}
