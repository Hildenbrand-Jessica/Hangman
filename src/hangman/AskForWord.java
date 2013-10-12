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
    String inputWord = getWord();
    char[] inputArray = new char[inputWord.length()];
    int spaces = inputWord.length();
    
    //Function
   
    
    public void getSpaces(){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your hangman word: ");
        //Casting
        this.spaces = Integer.parseInt(input.next());
    }
    public void displayBlankSpaces() {
        System.out.print("Mystery word: ");
        for(int i=0; i<spaces; i++){
            inputArray[i] = '_';
            System.out.print(inputArray[i] + " ");
        }
        System.out.print("\n");
    }
    public void displaySpaces(String numberOfLetters, String numberOfSpaces){
        numberOfLetters= "The number of letters needed is" + numberOfSpaces;
        System.out.println("The secret word has" + this.spaces + "spaces.");
    }
    public String getWord() {
        String hangmanWord;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hangman word: ");
        //casting
        hangmanWord = input.next(); 
        String pattern = "[a-zA-Z]*";
        if(hangmanWord.matches(pattern) == false){
            System.out.println("Oops! Your word contained more than just letters. Input a word with just letters.");
            getWord();
        }else{
            System.out.println("Good word!");
            System.out.print("\n\n\n\n\n\n\n\n");
        }
        return hangmanWord;
    }
    
    
}
   

