
package hangman;

import java.util.Scanner;

/**
 *
 * @author hyrumandbrescia
 */
public class Player {
    String computerPlayer = "You will be playing this game with \n\n"
                            + "your computer friends Brescia and Jessica";
        //Moved from Game.java
    public Player currentPlayer;
    public Player otherPlayer;
    public Player winner;
    public Player loser;
    public String status;
    
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    
    public void displayPlayerEncouragement(){
        System.out.println("You are doing a great job!");
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
    
}
