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
    static String word;
    static Scanner keyboard;
    static ArrayList<Character> a;
    static ArrayList<Character> wrong;
    static ArrayList<Character> correct;
    static  String[] array1 ;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        array1 = new String[25];

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
        
        int wrongguesses = 7;
        wrongguesses = play(wrongguesses);

        while (true) {
            if (wrongguesses == 0) {
                System.out.println("I am sorry, but you are out of tries.");

            } else {
                System.out.println("Congratulations! You got the word correct!");
            }
            System.out.println("Would you like to play again? ");
            String yn = keyboard.nextLine();
            if (yn.equals("yes")) {

                wrongguesses = 7;
                wrongguesses = play(wrongguesses);
            } else {
                break;
            }
        }
    }

    public static boolean printWord() {
        boolean won = true;
        for (char l : a) {
            if (correct.contains(l)) {
                System.out.print(l);
            } else {
                System.out.print("-");
                won = false;
            }
        }
        System.out.println();
        return won;
    }

    public static int play(int wrongguesses) {
        wrong = new ArrayList();
        correct = new ArrayList();
        int random = (int) (Math.random() * array1.length);
        word = array1[random];

        a = new ArrayList<Character>();
        for (char c : word.toCharArray()) {
            a.add(c);
        }
        while (wrongguesses > 0) {

            if (printWord()) {
                return 1;
            }
            System.out.println("What is your guess?");
            char b = keyboard.nextLine().toCharArray()[0];
            if (a.contains(b)) {
                System.out.println("You got a letter!");
                correct.add(b);

            } else { 
                wrongguesses--;
                System.out.println("I am sorry, you didn't get a letter. You have " + wrongguesses + " guesses left.");
                wrong.add(b);
               

            }

        }
        return wrongguesses;
    }
}
