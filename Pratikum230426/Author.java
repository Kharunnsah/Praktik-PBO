/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum230426;

/**
 *
 * @author Khairunnisah
 */
public class Author {
    // the private instance variables
    private String name;
    private String email;
    private final char gender;
    
    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return  name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email = email;
    }
   
    public String toString() {
    return name + " (" + gender + ") at " + email;
}
}
