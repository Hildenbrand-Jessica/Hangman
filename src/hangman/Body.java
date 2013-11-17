
        /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.Serializable;

/**
 *
 * @author hyrumandbrescia
 */

public class Body implements Serializable{

//Jessica added the main constructor
public Body() {
    
    }

    
    

public static void Body(int numberOfGuess) {
    //Brescia added switch statement to display the hangman body

    switch(numberOfGuess){

        case 0:
            System.out.println("\t------------"
                        + "\n\t|          |"
                        + "\n\t|          |"
                        + "\n\t|"
                        + "\n\t|" 
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n");
            break;
        case 1:
            System.out.println("\t------------"
                        + "\n\t|          |"
                        + "\n\t|          |"
                        + "\n\t|          O"
                        + "\n\t|" 
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n");
            break;
        case 2:
            System.out.println("\t------------"
                        + "\n\t|          |"
                        + "\n\t|          |"
                        + "\n\t|          O"
                        + "\n\t|          |" 
                        + "\n\t|          |"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n");
            break;
        case 3:
            System.out.println("\t------------"
                        + "\n\t|          |"
                        + "\n\t|          |"
                        + "\n\t|          O"
                        + "\n\t|         /|" 
                        + "\n\t|          |"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n");
            break;
        case 4:
            System.out.println("\t------------"
                        + "\n\t|          |"
                        + "\n\t|          |"
                        + "\n\t|          O"
                        + "\n\t|         /|\\" 
                        + "\n\t|          |"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n");
            break;
        case 5: 
            System.out.println("\t------------"
                        + "\n\t|          |"
                        + "\n\t|          |"
                        + "\n\t|          O"
                        + "\n\t|         /|\\" 
                        + "\n\t|          |"
                        + "\n\t|         /"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n");
            break;  
        case 6:
            System.out.println("\t------------"
                        + "\n\t|          |"
                        + "\n\t|          |"
                        + "\n\t|          O"
                        + "\n\t|         /|\\" 
                        + "\n\t|          |"
                        + "\n\t|          /\\"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n\t|"
                        + "\n");
            break;
        default: System.out.println();
        
    }    
}
}

