/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum300426;

/**
 *
 * @author Khairunnisah
 */
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected  int tarifPerKm;
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    public int gettarifAwal(){
        return tarifAwal;
    }
    public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }
    public int getTarifPerKm(){
        return tarifPerKm;
    }
}
