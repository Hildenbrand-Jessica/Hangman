/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.hangman.interfaces;

import hangman.AskForWord;

/**
 *
 * @author hyrumandbrescia
 */
public enum Game {
    CONTINUE ("Continuing a previously saved game"),
    NEW_GAME ("Starting a new game"),
    PLAYING ("The game is in process"),
    WINNER ("You hae won the game"),
    QUIT ("Stop the game"),
    ERROR ("An error occured"),
    EXIT ("Exiting the program"),
    gameType,
    numTurns,
    numGuesses,
    arrayAlphabet,
    numWrongGuesses,
    myWord;
    
    String message;
            }

public class Game (){
    status.display();
}

public String getMessage(){
    return message;
}
public void display(){
system.out.println(this.message);
}

