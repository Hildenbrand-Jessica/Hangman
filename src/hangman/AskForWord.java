/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.Serializable;
import java.util.Scanner;


public class AskForWord implements Serializable{
  String inputWord = getWord();
  char[] wordArray;
  char[] mysteryArray;
  int spaces;
  int vowelCount;
  int consonantCount;



    //Added Getter and Setter Functions
    public String getInputWord() {
        return inputWord;
    }

    public void setInputWord(String inputWord) {
        this.inputWord = inputWord;
    }

    public char[] getWordArray() {
        return wordArray;
    }

    public void setWordArray(char[] wordArray) {
        this.wordArray = wordArray;
    }

    private char[] getMysteryArray() {
        return mysteryArray;
    }

    private void setMysteryArray(char[] mysteryArray) {
        this.mysteryArray = mysteryArray;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public int getVowelCount() {
        return vowelCount;
    }

    public void setVowelCount(int vowelCount) {
        this.vowelCount = vowelCount;
    }

    public int getConsonantCount() {
        return consonantCount;
    }

    public void setConsonantCount(int consonantCount) {
        this.consonantCount = consonantCount;
    }
    
  //  Determines the difficulty level and calls from Main Menu Control class
  //  int numberOfGuesses = startGame;
    
    
    public AskForWord(){
        wordArray = inputWord.toCharArray();
        mysteryArray = new char[inputWord.length()];
        spaces = inputWord.length();    

        //Initialize mystery array with "_"
        //For the characters that the player inserts it will place
        //an underscore for each letter. 
        for(int i=0; i < wordArray.length; i++){
            mysteryArray[i] = '_';
        }
        
    }
    
    //Function
   
    public void getSpaces(){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your hangman word: ");
        //Casting
        this.spaces = Integer.parseInt(input.next());
    }
    
    public void displayMysteryWord() {
        System.out.print("Mystery word: ");
        for(int i=0; i<wordArray.length; i++){
            System.out.print(mysteryArray[i] + " ");
        }
        System.out.print("\n");
    }
    
    //Gets secret word from player 1 
    public String getWord() {
        String hangmanWord;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hangman word: ");
        //casting
        hangmanWord = input.next();
        hangmanWord = hangmanWord.toLowerCase();
        
        
        
        
        
        //Created an if statement to find out if the letters in the
        //secret word are characters or numbers
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
    
    public char[] mysteryArray(){
        return mysteryArray;
    }
    
    public void vowelConsonantCounter(){
 
        int i;
        for(i=0; i< wordArray.length; i++){
               if(wordArray[i]=='a'||wordArray[i]=='e'||wordArray[i]=='i'||wordArray[i]=='o'||wordArray[i]=='u'){
                   vowelCount++;
               }
           }
        for(i=0; i< wordArray.length; i++){
               if(wordArray[i]!='a'&&wordArray[i]!='e'&&wordArray[i]!='i'&&wordArray[i]!='o'&&wordArray[i]!='u'){
                   consonantCount++;
               }
           }
        System.out.print("Your word has " + vowelCount + "vowels \n" + "Your word has " + consonantCount + "consonants \n");
    }
    
}

    

