package hangman;

import java.util.Scanner;

public class Hangman {

    //jessicahildenbrand added these two lines
    private static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    private static final Difficulty difficulty = new Difficulty();

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
        myGame.sorter();
        difficulty.getInput(null);
        //GuessedLetters myGuessedLetters = new GuessedLetters();
        //myGuessedLetters.getGuess();

        //myGuessedLetters.checkGuess(myGuessedLetters.getGuess());



//        Lose myLosses = new Lose();
//        myLosses.displayNumLose();
//        Wins myWins = new Wins();
//        myWins.displayNumWins();
        //call the functions from their classes
        
        /*if (numGuesses >= numTurns) {
            System.out.println(playerLooses());
        } else {
            System.out.println(playerWins());
        }*/
        Hangman.inFile.close();

        //Jessica added this so that arrayAlphabet[] would show up on game
        //Game alGame= new Game();
        //alGame.alphabet();
    }

    /*public static String playerLooses() {
        return "Sorry you lost, better luck next time!";
    }
    
    public static String playerWins() {
        return "You won, great job!";
    }*/

    public void displayHelp() {
    }

    public void sorter() {
        char[] nameArray;
        nameArray = this.name.toCharArray();
        sortStringExchange(nameArray);
        for (int i = 0; i <= this.name.length() - 1; i++) {
            System.out.println(nameArray[ i]);
        }
    }

    public void sortStringExchange(char nameArray[]) {
        int k, j;
        char temp;

        for (k = 0; k < nameArray.length - 1; k++) {
            for (j = k + 1; j < nameArray.length; j++) {
                if (nameArray[k] > nameArray[j]) {
                    temp = nameArray[k];
                    nameArray[k] = nameArray[ j];    // swapping
                    nameArray[j] = temp;

                }
            }
        }
    }
}
