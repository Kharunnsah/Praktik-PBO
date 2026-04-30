/*
Nama : Khairunnisah
 */
package Pratikum300426;

/**
 *
 * @author Khairunnisah
 */
public class Kucing extends  Hewan{
    public Kucing(String nama){
        super(nama);
    }
    @Override
     public void Bersuara(){
        System.out.println(nama+"berkata: Meong meong!");
    }
}
