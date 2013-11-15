
package hangman;

import java.io.Serializable;

/**
 *
 * @author jessicahildenbrand
 */
public class GameMenuControl implements Serializable{
    private Game game;

    //Class Constructor
    private GameMenuControl() {
    }
//Added Getter and Setter functions
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

  
   public void takeTurn() {
        System.out.println("\n\ttakeTurn() called");
   }
   
    public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
    }
    
    
    public void displayStatistics() {
        String playerStatistics = this.game.getPlayerStastics();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + playerStatistics);
        System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = Hangman.getHelpMenu();
        helpMenu.getInput();
    }

    void displayPreferencesMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
}