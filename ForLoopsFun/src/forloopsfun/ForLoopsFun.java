/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopsfun;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class ForLoopsFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    for (int i = 0; i<10; i++) {
        System.out.println("I love Java");
    
    }
    Scanner keyboard = new Scanner(System.in);
    System.out.println("what number do you want me to count to?");
    int q = (Integer.parseInt(keyboard.nextLine()) + 1);
    for (int a = 0; a<q; a++) {
    System.out.println(a);
    }
    System.out.println("I will know count from a starting number to an ending number by a number you give. First, what do you want me to put as the starting number?");
    int b = Integer.parseInt(keyboard.nextLine());
    System.out.println("Next, what do you want me to put as the ending number?");
    int c = (Integer.parseInt(keyboard.nextLine())+1);
    System.out.println("Next, what do you want me to count by between your 2 given numbers?");
    int d = Integer.parseInt(keyboard.nextLine());
        for (int i =b; i<c; i+=d){
            System.out.println(i);
        }
        double[] array1 = new double[10];
        for (int e =0; e<10; e++)  {
            array1[e] = (e + 1);
            System.out.println(array1[e]);
        }
        double[] array2 = new double[10];
        for (int f =0; f<10; f++)  {
            array2[f] = (array1[f]+2);
            System.out.println(array2[f]);
        }
    
}
}
