package hangman;

import java.util.Scanner;

public class Hangman {
    
    //jessicahildenbrand added these three lines
    private static final Scanner inFile= new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    private static final MainMenuView mainMenu = new MainMenuView();

    public static Scanner getInputFile() {
        return Hangman.inFile;
    }
    String name;
    String instructions = "This is the game of Hangman \n\n";
    
    public Hangman() {
    
    }
    
    public static HelpMenuView getHelpMenu() {
        return Hangman.helpMenu;
        
    }
        
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        this.name = input.next();

    }

    
    
    public static void main(String[] args) {

        Hangman myGame = new Hangman();
        myGame.getName(); 
        mainMenu.getInput(null);
        GuessedLetters myGuessedLetters = new GuessedLetters();
        myGuessedLetters.getGuess();
       //myGuessedLetters.checkGuess(myGuessedLetters.getGuess());
        
        
        
        Losses myLosses = new Losses();
        myLosses.displayNumLosses();
        Wins myWins = new Wins();
        myWins.displayNumWins();
        
        Hangman.inFile.close();
        
        //Jessica added this so that arrayAlphabet[] would show up on game
        Game alGame= new Game();
        alGame.alphabet();
    }
    

    public void displayHelp() {
     
    }
}
