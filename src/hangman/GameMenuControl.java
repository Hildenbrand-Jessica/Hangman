
package hangman;

/**
 *
 * @author jessicahildenbrand
 */
public class GameMenuControl {
    private Game game;
    private Board board;

    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard();
    }
   
    
   public void takeTurn() {
        System.out.println("\n\ttakeTurn() called");
    }
   
       
   public void displayBoard() {
        System.out.println("\n\tdisplayBoard() called");
    }
   
   
    public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
        this.displayBoard();
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