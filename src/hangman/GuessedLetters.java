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
    String repeadedLetters = "You have already guessed this letter";
    String guesses;
    public static void main(String[] args){
        
    }
     void getGuesses(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of guesses");
        this.guesses = input.next();
    }
    public void displayGuesses(){
        System.out.println("You have guessed"+ this.guesses + "times already.");
    }
}
