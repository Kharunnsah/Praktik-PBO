/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum230426;

/**
 *
 * @author Khairunnisah
 */
public class Book {
    private  final String name;
    private  final Author Author;
    private double price;
    private int qty;
    
    Book( String name, Author Author, double price, int qty){
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public  Author getAuthor(){
        return Author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return qty;
    }
    public String toString(){
        return "'"+name + "'by"+Author;
    }
    
}
