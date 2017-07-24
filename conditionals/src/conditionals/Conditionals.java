package conditionals;

import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
         System.out.println("Question 2: What is the fastest underwater animal?");
        System.out.println("\tA) That one animal that you've never heard of but goes 0-100 real quick, real quick.");
        System.out.println("\tB) narwhal");
        System.out.println("\tC) marlin");
        System.out.println("\tD) sailfish");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("You must have brain issues to get this problem wrong.");
        }
         System.out.println("Question 3: Am I the best person at java??");
        System.out.println("\tA) no");
        System.out.println("\tB) no");
        System.out.println("\tC) no");
        System.out.println("\tD) no");
        String answer3 = keyboard.nextLine();
        if ((answer3.equals("B")) || (answer3.equals("C")) || (answer3.equals("D")) || (answer3.equals("A"))) {
            System.out.println("Wow!");
            rightAnswers++;
        }
        else {
            System.out.println("I don't actually know how you got this questoin wrong.");
        }
         System.out.println("Question 1: What is the equation for a parabola?");
        System.out.println("\tA) (x-h)^2=4p(y-k)");
        System.out.println("\tB) (x-h)^2=p(y-k)");
        System.out.println("\tC) ((x-h)^2)/9=((y-k)^2)/9");
        System.out.println("\tD) ((x-h)^2)=((y-k)^2)");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        System.out.println("Your score is " + rightAnswers + " out of 1 question.");
    }
    
}
