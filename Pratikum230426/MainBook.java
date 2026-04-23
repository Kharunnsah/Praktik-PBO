/*
Nama : Khairunnisah
Nim  : 2501082018
 */
package Pratikum230426;

/**
 *
 * @author Khairunnisah
 */
public class MainBook {

    public static void main(String[] args) {
        Author Rin = new Author("Peter Lee", "peter@nowhere.com", 'm');
        System.out.println(Rin);

        Book dummyBook = new Book("Algoritma dan Pemograman", Rin, 98000, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("Name is:" + dummyBook.getName());
        System.out.println("Price is:" + dummyBook.getPrice());
        System.out.println("Qty is:" + dummyBook.getQty());
        System.out.println("Author is:" + dummyBook.getAuthor());
        System.out.println("Author's name is:" + dummyBook.getAuthor().getName());
        System.out.println("Author's email is:" + dummyBook.getAuthor().getEmail());
        System.out.println("Author's gender is:" + dummyBook.getAuthor().getGender());

        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com", 'm'), 19.9, 8);
        System.out.println(moreDummyBook);
    }
}
