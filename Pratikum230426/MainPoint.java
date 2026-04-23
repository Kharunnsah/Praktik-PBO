/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum230426;

/**
 *
 * @author Khairunnisah
 */
public class MainPoint {
   public static void main(String[]args){
       Point Rin = new Point(1,2);
       System.out.println(Rin);
       
        Rin.setX(10);
        Rin.setY(3);
        System.out.println(Rin);
        System.out.println("X :"+Rin.getX());
        System.out.println("Y: "+Rin.getY());
        int[] xy = Rin.getXY();
        System.out.println("XY : (" + xy[0] + "," + xy[1] + ")"); 
        
        
       
   } 
}
