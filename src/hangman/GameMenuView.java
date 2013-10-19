
package hangman;

import java.util.Scanner;

/**
 *
 * @author jessicahildenbrand
 */
public class GameMenuView {
    
    private Game game;
    private GameMenuControl gameMenuControl ; 


    private final static String[][] menuItems = {
        {"T", "Take your turn"},
        {"D", "Display the board"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"P", "Change game preferences"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
        this.gameMenuControl = new GameMenuControl(game);
        
    }

    
    
    public Object getInput(Object object) {
        this.game = (Game) object;

        this.game.setStatus(Game.CONTINUE);
        
        String gameStatus = this.game.getStatus();
        do {
     
            this.display();
            
           
            String command = this.getCommand();
            switch (command) {
                case "T":
                    this.gameMenuControl.takeTurn();
                    break;
                case "D":
                    gameMenuControl.displayBoard();
                    break;
                case "N":
                    gameMenuControl.startNewGame();
                    break;
                case "R":
                    gameMenuControl.displayStatistics();
                    break;
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                case "Q":
                    gameStatus = "QUIT";
                    break;
            }
        } while (!gameStatus.equals("QUIT"));

        return Game.PLAYING;
    }
    


    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = GameMenuView.menuItems;

        for (String[] item : GameMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() {

        Scanner inFile = Hangman.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new HangmanError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }

 

    
    



   
}