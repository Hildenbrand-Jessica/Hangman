/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author jessicahildenbrand
 */
public class HangmanException extends Exception {
    
    public HangmanException() {
    
    }
    
    public HangmanException(String mesage) {
        super(message);
    }
    
    public HangmanException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public HangmanException(Throwable cause) {
        super(cause);
    }
    
}
