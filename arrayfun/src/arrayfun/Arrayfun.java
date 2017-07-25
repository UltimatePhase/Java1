/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun;

/**
 *
 * @author Education Unlimited
 */
public class Arrayfun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[10];
       array1[0] = 1;
       array1[1] = 3;
       array1[2] = 5;
       array1[3] = 7;
       array1[4] = 9;
       array1[5] = 11;
       array1[6] = 13;
       array1[7] = 15;
       array1[8] = 17;
       array1[9] = 19;
       System.out.println(array1[0]);
       System.out.println(array1[1]);
       System.out.println(array1[2]);
       System.out.println(array1[3]);
       System.out.println(array1[4]);
       System.out.println(array1[5]);
       System.out.println(array1[6]);
       System.out.println(array1[7]);
       System.out.println(array1[8]);
       System.out.println(array1[9]);
        double[] array2 = new double[10];
        int index = 0;
        while(index<10) {
            array2[index] = 1.25;
            System.out.println(array2[index]);
            index++;
    }
        int[] array3 = new int[1000];
        int indexx = 0;
        while (indexx < 1000) {
            array3[indexx] = indexx;
            System.out.println(indexx);
            indexx++;
        }
    }
}
