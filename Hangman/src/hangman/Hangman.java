/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Education Unlimited
 */
public class Hangman {

    private static Object str;
    /*Random number between 0 and size of list. select random index from the list.
     /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] array1 = new String[25];

        array1[0] = "rule";
        array1[1] = "onerous";
        array1[2] = "acoustics";
        array1[3] = "crack";
        array1[0] = "nippy";
        array1[5] = "best";
        array1[6] = "unequal";
        array1[7] = "uttero";
        array1[8] = "optimal";
        array1[9] = "occur";
        array1[10] = "enjoy";
        array1[11] = "grouchy";
        array1[12] = "applaud";
        array1[13] = "slow";
        array1[14] = "voracious";
        array1[15] = "question";
        array1[16] = "tax";
        array1[17] = "spare";
        array1[18] = "confused";
        array1[19] = "frightening";
        array1[20] = "wealth";
        array1[21] = "nine";
        array1[22] = "camp";
        array1[23] = "neck";
        array1[24] = "oven";
        char[] wrong = new char[a];
        int random = (int) (Math.random() * 24 + 0);
        String word = array1[random];
        System.out.println(word);

        ArrayList<Character> a = new ArrayList<Character>();
        for (char c : word.toCharArray()) {
            a.add(c);
        }
        int wrongguesses = 0;
        while (wrongguesses < 10) {
            System.out.println(word = word.replaceAll(".", "*"));
            System.out.println("What is your guess?");
            char b = keyboard.nextLine().toCharArray()[0];
            if (a.contains(b)) {
                System.out.println("You got a letter!");
                
            }
            else {
                System.out.println("I am sorry, you didn't get a letter.");
                wrong.add(b);
                wrongguesses++;
                
            }
        }
    }
}
