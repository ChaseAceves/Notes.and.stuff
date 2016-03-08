/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notes.and.stuff;

/**
 *
 * @author Chase
 */
public class NotesAndStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 9;
        
        // if && it wont bother checking the other condition if first is false
        if( (x > 1) & (x++ < 10))
            System.out.println("True");
        else
            System.out.println("False");
        System.out.println("x = " + x);
        
        System.out.println("-----");
        
        // if ++x it adds before, if x++ it adds after everything is evaulated
        // 10 > 9+9 if ++x, 10 > 9 if x++
        if( (1 == x) | (10 > x++))
            System.out.println("True");
        else
            System.out.println("False");
                  
        
        // desk - varible
        // DESK - Constant
        // Desk - Class
        // desk() - method
        // Desk.java - .txt Source file.java
        // Desk.class - byte code, executable
        
        System.out.println("-----");
        
        double y = Math.sin(14);
        System.out.println(x);
        
        System.out.print("Hi \nThere");
        // \n in front of word in middle of sentence goes to next ling
        // \b is anothe
        // // goes out then back in
        // on slide 19 in chapter 4 Casting bewteeen char 
        }
}
