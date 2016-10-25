package examples2;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baayl3669
 */
public class NumbetGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // generate random numbers between 1 and 100
        int number = (int)(Math.random()*100 + 1);
        // get a guess to 0 
        int guess = 0;
        // while the guess is not tcorrect
        while(guess !=number){
            // ask user for the guess and store it
            System.out.println("please enter your guess between 1 and 100");
            guess = input.nextInt();
            // if guess is to high, tell them
            if(guess > number){
                System.out.println("guess is too high");
            }
            // if guess is to low, tell them
            if(guess < number){
                System.out.println("guess is to low");
            }
            // if guess is correct, congratulations
            if(guess == number){
                System.out.println("Congratulations!");
            }
    }
}
}
