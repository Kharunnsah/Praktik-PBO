/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum230426;

/**
 *
 * @author Khairunnisah
 */
public class MainAuthor {
    public static void main(String[]args){
        Author Rin = new Author ("Peter Lee", "peter@nowhere.com", 'm');
        System.out.println(Rin);
        
        Rin.setEmail("peter@nowhere.com");
        System.out.println(Rin);
        System.out.println("Name:"+Rin.getName());
        System.out.println("gender: "+Rin.getGender());
        System.out.println("Gmail:"+Rin.getEmail());
        
    }
    
}
