/*
Nama : Khairunnisah
NIm  : 2501082018
 */
package Pratikum230426;

/**
 *
 * @author Khairunnisah
 */
public class MainLine {
    public static void main(String[]args){
    Point Rin = new Point(2,4);
    System.out.println(Rin);
     
    Line dummyLine = new Line(1, 2, 3, 4);
    System.out.println(dummyLine);
    dummyLine.setBeginXY(3, 4);
    dummyLine.setEndXY(5,6);
     
    System.out.println("Line is: " + dummyLine);
    System.out.println("Begin Point: " + dummyLine.getBegin());
    System.out.println("End Point: " + dummyLine.getEnd());
    System.out.println("Begin X: " + dummyLine.getBegin().getX());
    System.out.println("Begin Y: " + dummyLine.getBegin().getY());
    System.out.println("End X: " + dummyLine.getEnd().getX());
    System.out.println("End Y: " + dummyLine.getEnd().getY());
    System.out.println("Length: " + dummyLine.getLength());
     

    }
}
