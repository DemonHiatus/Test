package Examples;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create the input for the user 
        Scanner input = new Scanner(System.in);
        
        // ask the user for their name
        System.out.println("please enter your name");
        // get the name from the user 
        String name = input.nextLine();
        // say hello
        System.out.println("hello " + name);
        
        // ask for the year the user was born
        System.out.println("please enter your birth year");
        int birthYear = input.nextInt();
        // calculate age
        int age = 2016 - birthYear;
        // tell the user their age
        System.out.println("Damn " + age + ", hit me up when you're legal");
        
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        max = max + 1;
        System.out.println(max);
            
    }
}

