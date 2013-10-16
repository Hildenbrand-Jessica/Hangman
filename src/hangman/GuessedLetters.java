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
    String repeatedLetters = "You have already guessed this letter";
    String guess;
    public GuessedLetters(){
        
    }
   //Prints out guess a letter will eventually use it to 
    //have the players guess the word.
     void getGuess(){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a letter...");
        //casting
        this.guess = input.next();
    }
     
    public void displayGuesses(){
        System.out.println("You have guessed"+ this.guess + "times already.");
    }
}
