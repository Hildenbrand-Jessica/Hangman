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
 public char getGuess() {
    Scanner letterScanner = new Scanner(System.in);
    char letter = '0';
    
    do {  
        System.out.println("Guess a letter:");
        letter = letterScanner.next().charAt(0);
    } while (Character.isLetter(letter) == false);
    
    return letter;
} 
 
 /*
 public char[] checkGuess(char[] wordArray char[] mysteryArray char guessedLetter){
    for(i = 0; i<=mysteryArray.length(); i++){
       if(wordArray[i] == guessedLetter){
           mysteryArray[i] = guessedLetter;
       }else{
           numberGuesses--;
       }
    }
    return numberGuesses;
 } 
 */
}
     

