/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum300426;

/**
 *
 * @author Khairunnisah
 */
public class Anjing extends Hewan {
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void Bersuara(){
        super.Bersuara();
        System.out.println(nama +"berkata: Guk guk!");
    }
}
