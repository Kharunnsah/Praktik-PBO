/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum300426;

/**
 *
 * @author Khairunnisah
 */
public class Pesawat extends Udara {
    private int muatan;
    
    public int getMuatan(){
        return muatan;
    }
    public void setMuatan(int muatan){
        this.muatan = muatan;
    }
    public Pesawat(){
        super();
    }
    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama,tahunProduksi,mesin);
        this.muatan = muatan;
    }
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
       setNama(nama);
       setTahunProduksi(tahunProduksi);
       setMesin(mesin);
       setMuatan(muatan);
       
    }
    public String kategori(int muatan){
       if(muatan<=50)
           return "Kecil";
       else if(muatan<=150)
           return "Sedang";
       else
           return "Besar";
    }
    public void cetak(){
        super.Cetak();
        System.out.println ("Muatan :"+muatan+"penumpang");
        System.out.println("Kategori:"+kategori(muatan));
    }
}
