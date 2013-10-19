package hangman;

import java.util.Scanner;

public class Hangman {

    static Scanner getInputFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static HelpMenuView getHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String name;
    String instructions = "This is the game of Hangman \n\n";
    private static final HelpMenuView helpMenu = new HelpMenuView();
    
    public Hangman() {
    
    }

    
    public static void main(String[] args) {

        Hangman myGame = new Hangman();
        myGame.getName();
        myGame.displayHelp();
        AskForWord myAskForWord = new AskForWord();
        myAskForWord.displayBlankSpaces();
        GuessedLetters myGuessedLetters = new GuessedLetters();
        myGuessedLetters.getGuess();
        Losses myLosses = new Losses();
        myLosses.displayNumLosses();
        Wins myWins = new Wins();
        myWins.displayNumWins();
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        this.name = input.next();

    }

    public void displayHelp() {
        System.out.println("Help Menu to Come");
    }
}
