/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package TugasHariRaya;

import java.util.Scanner;

/**
 *
 * @author Khairunnisah
 */
public class Soal1 {
    public static void main(String[]args){
    int x;
    int perhalaman = 15000;
    int jumlahhalaman = 50;
    int uangsisa,uangditerima,belumdiketik;
    Scanner input = new Scanner(System.in);
    System.out.print("==== Program Pesanan Mengetik ====");
    System.out.print("\nMasukkan jumlah halaman yang sudah dikerjakan :");
    x = input. nextInt();
    uangditerima = perhalaman*x;
    belumdiketik = jumlahhalaman - x;
    uangsisa =belumdiketik *perhalaman;
    System.out.println("Harga mengetik perhalaman\t\t: Rp."+perhalaman+ ",-");
    System.out.println("Uang yang diterima dina\t\t: Rp."+ uangditerima+ ",-");
    System.out.println("Sisa Halaman yang belum diketik\t: " +belumdiketik+ " Halaman");
    System.out.println("Sisa uang yang akan didapatkan dina\t: Rp."+uangsisa+ ",-");
    
    }
    
}


