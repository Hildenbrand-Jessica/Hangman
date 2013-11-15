
package hangman;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author jessicahildenbrand
 */
public class Game implements Serializable{
    
    public static final String CONTINUE = "CONTINUE";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";
    
//Private variables
    private String gameType;
    private int numTurns;
    private int numGuesses;
    private char arrayAlphabet[];

    
    AskForWord myWord;


    //Constructor
    public Game() {
        numGuesses = 0;
        
        //Initialize alphabet array
        System.out.print("Initializing alphabet...\n");
        arrayAlphabet = new char[26];
        char a;
        char place = 'a';
        for (int i = 0; i < arrayAlphabet.length; i++) {
            arrayAlphabet[i] = place;
            System.out.print(arrayAlphabet[i]);
            place++;
       }
        
       System.out.print("Done.\n"); 
    }
//Added Getter and setter functions
    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getNumTurns() {
        return numTurns;
    }

    public void setNumTurns(int numTurns) {
        this.numTurns = numTurns;
    }

    public void startGame(int numTurns) {
        
        char guessedLetter;
        GuessedLetters myGuessedLetter = new GuessedLetters();
        
        //Set the number of turns based on difficulty level and start the game
        setNumTurns(numTurns);
        
        //Ask for word
        myWord = new AskForWord();
        myWord.vowelConsonantCounter();
        myWord.displayMysteryWord();
        Body displayBody = new Body();
       
        //TODO: Add loop that continues until (numGuess >= numTurns) is reached
        //Brescia Added Display Body/numGuesses to display hangman Body
        String turnNum = "";// StringBuilder would be more efficient.
        while (numGuesses <= numTurns) {
            //convert character to string
           if(Arrays.equals(myWord.wordArray, myWord.mysteryArray))
           break;
            //if true declare winner and display winning message
            guessedLetter = myGuessedLetter.getGuess();
            numGuesses++;

            //TODO: mark off letter guess in arrayAlphabet
            //updateArrayAlphabet(guessedLetter);
            
            //Show updated alphabet
            showRemainingAlphabet();
            
            if (!letterFound(guessedLetter)) {
                
                //TODO: Show body part     
                System.out.print("Letter not found");
            }
            //TODO: display the updated mystery word (spaced with guessed letters)
            
            displayBody.Body(numGuesses);
            myWord.displayMysteryWord();
        }
                
        
    }

    public String getTiedMessage () {
       return "\n\t*******************************************************************************"
             + "\n\t The game is a tie. Better luck next time!" 
             + "\n\t*******************************************************************************";
    }

    String getPlayerStastics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


 private boolean letterFound(char guessedLetter){
    boolean matchFound = false;
    
    for(int i = 0; i < myWord.mysteryArray.length; i++){
       if(myWord.wordArray[i] == guessedLetter){
           matchFound = true;
           myWord.mysteryArray[i] = guessedLetter;
       }
    }
    return matchFound;
 } 
 
 //Jessica added this function so the alphabet would be displayed for the players  
 public void showRemainingAlphabet() {
     System.out.print("Remaining alphabet letters:\n");
     for (int i = 0; i < arrayAlphabet.length; i++) {
         System.out.print(arrayAlphabet[i]);
    }
    System.out.print("\n--------------------\n");     
 }
}
