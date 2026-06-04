/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum040626;

/**
 *
 * @author Khairunnisah
 */
public class MainMusik {
    public static void main(String[]args){
        Gitar gitar = new Gitar (6,"Gitar Klasik","Petik");
        Keyboard keyboard = new Keyboard (true,"Yamaha PSR","Elektronik");
        
        System.out.println("-------- Gitar---------");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("\n------------Info Keyboard---------");
        keyboard.info();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
        keyboard.nyalakan();


    }
}
