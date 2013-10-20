
package hangman;

/**
 *
 * @author jessicahildenbrand
 */
public class Game {
    
    public static final String CONTINUE = "CONTINUE";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";

    private String gameType;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    private Board board;
   

    

    public Game() {
   
    }

    public Game(String gameType) {
        this();

        this.gameType = gameType;
        
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public void setPlayingOrder(Player player1, Player player2) {

        double randomValue = Math.random();

        if (randomValue < 0.5) {
            this.currentPlayer = player1;
            this.otherPlayer = player2;
        } else {
            this.otherPlayer = player2;
            this.currentPlayer = player1;
        }

    }


    public String getWinningMessage () {
        return "\n\t*******************************************************************************"
             + "\n\t Congratulations " + winner.getName() + "! You won the game."
             + "\n\t Sorry " + loser.getName() + ", You are the loser." 
             + "\n\t*******************************************************************************";
    }

    public String getTiedMessage () {
       return "\n\t*******************************************************************************"
             + "\n\t The game is a tie. Better luck next time!" 
             + "\n\t*******************************************************************************";
    }

    String getPlayerStastics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
