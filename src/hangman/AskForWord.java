/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author jessicahildenbrand
 */
public class AskForWord {
    String spaces;
    String numberOfSpaces;
    String numberOfLetters;
    public void displayBlankSpaces() {
        System.out.println("There are" + this.spaces + "spaces.");
    }
    void getSpaces(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Secret Word");
        this.spaces = input.next();
    }
    public void displaySpaces(numberOfLetters, numberOfSpaces){
        numberOfLetters= "The number of letters needed is" + numberOfSpaces;
        System.out.println("The secret word has" + this.spaces + "spaces.");
    }
}