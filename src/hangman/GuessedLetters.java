/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author hyrumandbrescia
 */

public class GuessedLetters implements Serializable {
    String repeatedLetters;
    String guess;
    
    //Class constructor
    public GuessedLetters(){
         repeatedLetters = "You have already guessed this letter";
    }
    
//Getter and Setter Functions
    public String getRepeatedLetters() {
        return repeatedLetters;
    }

    public void setRepeatedLetters(String repeatedLetters) {
        this.repeatedLetters = repeatedLetters;
    }
    
   //Prints out guess a letter will eventually use it to 
    //have the players guess the word.
 public char getGuess() {
    Scanner letterScanner = new Scanner(System.in);
    char letter = '0';
    
    do {  
        System.out.println("Guess a letter:");
        letter = letterScanner.next().charAt(0);
    } while (Character.isLetter(letter) == false);
    
    return letter;
} 

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
     

