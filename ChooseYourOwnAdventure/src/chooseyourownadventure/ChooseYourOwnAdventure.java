/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventure;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which option will you take? 1 or 2?");
       int room = Integer.parseInt(keyboard.nextLine());
            if (room == 1) {
                System.out.println("You are now asleep.");
                    Thread.sleep(1500);
                        System.out.println("Which option will you take? 1 or 2?");
                            int rom = Integer.parseInt(keyboard.nextLine());
                                if (rom == 1) {
                                    System.out.println("You are brutally killed in your sleep.");
                                        Thread.sleep(1500);
                                            System.out.println("Which option will you take? 1 or 2?");
                                                int rm = Integer.parseInt(keyboard.nextLine());
                                                    if (rm == 1) {
                                                        System.out.println("You are sentanced to the underworld for 1 million years for your crimes.");
                                                    }
                                                    else if (rm == 2) {
                                                        System.out.println("You get a second chance at life because of your work supporting the world.");
                                                    }
                }
                            else if (rom == 2) {
                                System.out.println("You wake up, feeling refreshed.");
                                    Thread.sleep(1500);
                                        System.out.println("Which option will you take? 1 or 2?");
                                            int f = Integer.parseInt(keyboard.nextLine());
                                                if (f == 1) {
                                                    System.out.println("You take a morning walk, but then get attacked by someone in an alley.");
                                                        Thread.sleep(1500);
                                                            System.out.println("Which option will you take? 1 or 2?");
                                                                int g = Integer.parseInt(keyboard.nextLine());
                                                                    if (g == 1) {
                                                                        System.out.println("You narrowly avoid the attacker and sprint away as fast as you can.");
                                                                    }
                                                                    else if (g == 2) {
                                                                       System.out.println("The attacker reaches you, but lucky you know martial arts and are able to fight him off.");
                                                                    }
                                                }
                                                else if (f == 2) {
                                                    System.out.println("you fall off your bed and land on your face when you try to get out of bed. You alraedy know that today is going to be an unlucky day...");
                                                        Thread.sleep(1500);
                                                            System.out.println("Which option will you take? 1 or 2?");
                                                                int e = Integer.parseInt(keyboard.nextLine());
                                                                    if (e == 1) {
                                                                        System.out.println("Your car gets into an accident and you suffer a fatal injury.");
                                                                    }
                                                                    else if (e == 2) {
                                                                        System.out.println("your car gets completely trashed and you get fired by your boss because you turned up late to work for the 5th time of the month.");
                                                                    }
                                                }
                }
    }
        else if (room == 2) {
            System.out.println("You stay awake.");
                Thread.sleep(1500);
                    System.out.println("Which option will you take? 1 or 2?");
                        int b = Integer.parseInt(keyboard.nextLine());
                            if (b == 1) {
                                System.out.println("You find an abandoned nuclear testing site and your curiosity takes control of you.");
                                    Thread.sleep(1500);
                                        System.out.println("Which option will you take? 1 or 2?");
                                            int c = Integer.parseInt(keyboard.nextLine());
                                                if (c == 1) {
                                                    System.out.println("You are killed by nuclear radiation.");
                                                }
                                                else if (c == 2) {
                                                    System.out.println("You decide not to be dumb and walk away from the toxic ground.");
                                                }
                        }
                        else if (b == 2) {
                            System.out.println("You walk into a shop which sells everything for free.");
                                Thread.sleep(1500);
                                    System.out.println("Which option will you take? 1 or 2?");
                                        int d = Integer.parseInt(keyboard.nextLine());
                                            if (d == 1) {
                                                System.out.println("You walk out because you think it isn't safe.");
                                            }
                                            else if (d == 2) {
                                                System.out.println("You grab a bunch of materials thinking it's free.");
                                                    Thread.sleep(1500);
                                                        System.out.println("Which option will you take? 1 or 2?");
                                                            int e = Integer.parseInt(keyboard.nextLine());
                                                                if (e == 1) {
                                                                    System.out.println("You get mobbed by the materials you grabbed.");
                                                                }
                                                                else if (e == 2) {
                                                                    System.out.println("The materials you grabbed jump to atack you, but you drop the bag that was carrying them and run out of the store as fast as you can.");
                                                                }
                                            }
                            
                        }
        }
        
    
}
}
//Thread.sleep(1500); for a delay