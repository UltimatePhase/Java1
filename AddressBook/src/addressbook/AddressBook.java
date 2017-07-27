/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class AddressBook {
String firstname;
String lastname;
int phonenumber;
public AddressBook(String newfirstname, String newlastname, int newphonenumber){
            firstname=newfirstname;
            lastname = newlastname;
            phonenumber=newphonenumber;
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many addresses do you want to add?");
        int a = Integer.parseInt(keyboard.nextLine());
    
        for(int i = 0; i < a; i++) {
      
 
        }    
        
        
        
        
    boolean a = false;
     int i = 0;       
    if (i<2147449000) { 
        while (a = false) {
            
    System.out.println("Please type out your first name");
    String firstname = keyboard.nextLine();
    System.out.println("Please type out your last name");
    String lastname = keyboard.nextLine();
    System.out.println("Please type out your area code.");
    int areacode = Integer.parseInt(keyboard.nextLine());
    System.out.println("Please type out your phone number");
    String phonenumber = keyboard.nextLine();
    System.out.println("Would you like to continue adding more addresses? put 1 for yes and 2 for no.");
    int continues = Integer.parseInt(keyboard.nextLine());
    if (continues == 2) {
       i += 2147449000;
    }
    else {
        i++;
        
    }
   
            Entry e = new Entry(firstname lastname, phonenumber); 
            list.add(e)
    }
    }
    
}
}
