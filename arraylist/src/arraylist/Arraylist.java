/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);
        a1.add(10);
        System.out.println(a1);
        System.out.println("What number would you like to search for?");
        int x = Integer.parseInt(keyboard.nextLine());
        if (a1.contains(x)) {
            System.out.println("Your number is in the array.");
        } else {
            System.out.println("Your number is not in the array.");
        }
        int max = 0;
        for (int b : a1) {
            if (b > max) {
                max = b;
                
            }
        }
        System.out.println(max + " is the biggest number in the array.");
        ArrayList<String> a2 = new ArrayList();
        a2.add("a");
        a2.add("bunch");
        a2.add("of");
        a2.add("revolutionary");
        a2.add("manumission");
        a2.add("abolitionists");
        a2.add("give");
        a2.add("me");
        a2.add("your");
        a2.add("position");
        a2.add("show");
        a2.add("me");
        a2.add("where");
        a2.add("the");
        a2.add("ammunition");
        a2.add("is");
        
        
    }
}
