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
public class Loose implements Serializable {
    int numLoose;
    
    //Constructor Added
    public Loose() {
        numLoose= 3+3;
    }
    public void displayNumLoose() {
        System.out.println ("You loose, better luck next time.");
}
    
}
