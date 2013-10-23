/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author hyrumandbrescia
 */
public class GuessedLetters {
    String repeatedLetters;
    String guess;
    
    //Class constructor
    public GuessedLetters(){
        repeatedLetters = "You have already guessed this letter";
    }
    
   //Prints out guess a letter will eventually use it to 
    //have the players guess the word.
     public String getGuess(){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a letter...");
        //casting
        this.guess = input.next();
        
        return this.guess;
     } 
     public void displayGuesses(){
        System.out.println("You have guessed"+ this.guess + "times already.");
    }
     

}
