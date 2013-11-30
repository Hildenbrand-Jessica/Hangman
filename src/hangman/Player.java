
package hangman;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author hyrumandbrescia
 */
public class Player implements Serializable {
    String computerPlayer = "You will be playing this game with \n\n"
                            + "your computer friends Brescia and Jessica";
        //Moved from Game.java
    //Converted to Private
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    
    private Player getCurrentPlayer() {
        return currentPlayer;
    }

    private void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    
    private void displayPlayerEncouragement(){
        System.out.println("You are doing a great job!");
    }
     private Player getOtherPlayer() {
        return otherPlayer;
    }

    private void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    private String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }
    private Player getWinner() {
        return winner;
    }

    private void setWinner(Player winner) {
        this.winner = winner;
    }
    
    
}
