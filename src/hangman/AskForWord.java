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
    
    int spaces;
    int numberOfSpaces;
    int numberOfLetters;
    
    //Function
    public AskForWord() {
        spaces= 4;
        numberOfSpaces= 3;
        numberOfLetters=3;
        
    }
    
    public void displayBlankSpaces() {
        for(int i=0; i<inputArray.length; i++){
            
        }
        System.out.println("There are " + this.spaces + " spaces.");
    }
    void getSpaces(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Secret Word");
        //Casting
        this.spaces = Integer.parseInt(input.next());
    }
    public void displaySpaces(String numberOfLetters, String numberOfSpaces){
        numberOfLetters= "The number of letters needed is" + numberOfSpaces;
        System.out.println("The secret word has" + this.spaces + "spaces.");
    }
    public String getWord() {
    String hangmanWord = "halloween"; 
    return hangmanWord;
    }
    
    public void checkWord(){
    String pattern = "[a-zA-Z]*";
    if(inputWord.matches(pattern) == false){
        System.out.println("Oops! Your word contained more than just letters. Input a word with just letters.");
    }else{
        System.out.println("Good word!");
    }        
    }
}
   

