/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package custom.exceptions;


/**
 *
 * @author jessicahildenbrand
 */
public class MenuException extends Exception {
    
    public MenuException() {
    
    }
    
    public MenuException(String message) {
        super(message);
    }
    
    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MenuException(Throwable cause) {
        super(cause);
    }
    

    
}
