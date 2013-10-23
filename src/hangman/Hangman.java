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
    
    //jessicahildenbrand added this
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
        myGame.displayHelp();
        

        //jessicahildenbrand added these
        mainMenu.getInput(null);

        Losses myLosses = new Losses();
        myLosses.displayNumLosses();
        Wins myWins = new Wins();
        myWins.displayNumWins();
        
        Hangman.inFile.close();
    }
    

    public void displayHelp() {
     
    }
}
