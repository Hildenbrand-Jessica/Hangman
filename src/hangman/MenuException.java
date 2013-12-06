/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author jessicahildenbrand
 */
public class MenuException extends Exception {
    
    public MenuException() {
    
    }
    
    public MenuException(String mesage) {
        super(message);
    }
    
    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MenuException(Throwable cause) {
        super(cause);
    }
    

    
}
