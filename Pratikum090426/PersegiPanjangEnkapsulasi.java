/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum090426;

/**
 *
 * @author Khairunnisah
 */
public class PersegiPanjangEnkapsulasi {
    //atribbut variabel
    private int panjang;
    private int lebar;
    private static int jumlahObjek=0;
    
    //costructor kosong
    PersegiPanjangEnkapsulasi(){
        jumlahObjek ++;
    }
    
    //constructor 2 overloading
    PersegiPanjangEnkapsulasi(int p, int l){
        panjang=p;
        lebar=l;
        jumlahObjek ++;
    }
    ///Getter dan Sette
    /// @return r
    public int getPanjang(){
        return panjang;
    }
    public void setPanjang(int panjang){
      this.panjang = panjang; 
    }
    public int getLebar(){
        return lebar;
    }
   
    public void setlebar(int lebar){
       this.lebar=lebar;
    }
    public static int getJumlahObjek(){
         return jumlahObjek;
   }
    public int HitungLuas(){
        return(panjang*lebar);
    }
    
    public int HitungKel(){
        return(2*(panjang+lebar));
    }
    // method tanpa kembalian
    void TampilData(){
        System.out.println("Panjang Persegi Panjang\t\t:" +panjang);
        System.out.println("lebar Persegi Panjang\t\t:" +lebar);
        System.out.println("Luas Persegi Panjang\t\t:" +HitungLuas());
        System.out.println("Keliling Persegi Panjang\t:" +HitungKel());
        
    }

  
}


