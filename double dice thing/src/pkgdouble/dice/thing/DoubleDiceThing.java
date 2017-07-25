/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdouble.dice.thing;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class DoubleDiceThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int ran = (int)(Math.random()*6+1);    
    int random = (int)(Math.random()*6+1);
        while (random != ran) {
            System.out.println("Would you like to continue (yes/no)");
            String yn = keyboard.nextLine();
    }
    System.out.println("Congradulations!");
    }
   
        
    }
    
    

