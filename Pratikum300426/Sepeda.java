/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum300426;

/**
 *
 * @author Khairunnisah
 */
public class Sepeda extends Kendaraaan {
    protected  String jmlSadel;
    protected int jmlGir;
    
    public void  setJumlahSadel(String jmlSadel){
       this.jmlSadel = jmlSadel; 
    }
    public String getJumlahSadel(){
        return jmlSadel;
    }
    public void setJumlhGirl(int jmlGir){
        this.jmlGir = jmlGir;
    }
    public int getJumlahGir(){
        return jmlGir;
    }
}
