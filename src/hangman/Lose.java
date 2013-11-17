/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.Serializable;

/**
 *
 * @author jessicahildenbrand
 */
public class Lose implements Serializable {
    int numLose;
    
    //Constructor Added
    public Lose() {
        numLose= 3+3;
    }
    public void displayNumLose() {
        System.out.println ("You lose, better luck next time.");
}
    
}
