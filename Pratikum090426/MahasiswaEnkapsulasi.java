/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum090426;

/**
 *
 * @author Khairunnisah
 */
public class MahasiswaEnkapsulasi {
   private String nama; 
   private String nim;
   private String jurusan;
   private int umur;
   private double ipk;
   
   
   MahasiswaEnkapsulasi(){
    
   }
   public MahasiswaEnkapsulasi(String nm,String ni){
    nama = nm;
    nim = ni;  
   }
   public MahasiswaEnkapsulasi(String nm, String ni, String jrsan,int umr, double ip) {
    nama = nm;
    nim = ni;
    jurusan = jrsan;
    umur = umr;
    ipk = ip;
    
     }
    public String getNama() {
       return nama;  
     }
    public void setNama(String nama){
      this.nama = nama;
     }
    public String getNim(){
      return nim;
    }
    public void setNim(String nim){
       this.nim = nim;
    }
    public String getJurusan(){
        return jurusan;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public double getIpk (){
        return ipk;
    }
    public void setIpk(double ipk){
        this.ipk = ipk;
    }
    
    void TampilanInfo(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Nim\t\t: "+nim);
        System.out.println("Jurusan\t\t: " +jurusan);
        System.out.println("Umur\t\t: "+umur);
        System.out.println("IPK\t\t:" +ipk);
    }
    public String statusKelulusan(){
        if(ipk >= 2.75){
            return("Lulus");   
        }
        else{
            return("Tidak Lulus");
        }
    }
    
}
