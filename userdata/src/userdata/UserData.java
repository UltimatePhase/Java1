package userdata;

import java.util.Scanner;
public class UserData {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
      String name = keyboard.nextLine();
      System.out.println("Hi," + name + "! How old are you?");
      int age = Integer.parseInt(keyboard.nextLine());
      System.out.println("What is the day of your birthday?");
      int day = Integer.parseInt(keyboard.nextLine());
      System.out.println("What is the month of your birthday? (spelled out please)");
      String month = keyboard.nextLine();
      System.out.println("What is the year of your birthday?");
      int year = Integer.parseInt(keyboard.nextLine());
      System.out.println("What is your favorite book?");
      String book = keyboard.nextLine();
      System.out.println("where is your hometown?");
      String hometown = keyboard.nextLine();
      System.out.println("What is your lucky number?");
      double luckynumber = Double.parseDouble(keyboard.nextLine());
      System.out.println("What is your shoe size?");
      double shoesize = Double.parseDouble(keyboard.nextLine());
      System.out.println("On a scale of 1 to 5, how excited are you for camp?");
      double excitement = Double.parseDouble(keyboard.nextLine());
      System.out.println("What is one interesting fact about you?");
      String fact = keyboard.nextLine();
      System.out.println(" From the data I have collected, you are " + name + " who is " + age + " years old and was born on " + month + " " + day + ", " + year+ ". Your lucky number is " + luckynumber + " and your hometown is " + hometown + ". On a scale from 1 to 5, you are a " + excitement + " to learn java. One interesiting fact you find about yourself is " + fact +".");
    }
    
}

