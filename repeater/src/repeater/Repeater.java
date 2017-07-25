package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something in the first line, and type the amount of times you want me to reapeat it on the second line. " );
       int thing = Integer.parseInt(keyboard.nextLine());
       String input = keyboard.nextLine();
       
       System.out.println("Here we go!");
       int count = 1;
       while (count <= thing) {
           System.out.print(count + ".");
           System.out.println(input);
           count ++;
       }
    }
    
}