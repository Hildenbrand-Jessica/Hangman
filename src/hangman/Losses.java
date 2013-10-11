/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author jessicahildenbrand
 */
public class Losses {
    int numLosses;
    
    public Losses() {
        numLosses= 3+3;
    }
    public void displayNumLosses() {
        System.out.println ("You have " + this.numLosses + " losses.");
}
    
}
