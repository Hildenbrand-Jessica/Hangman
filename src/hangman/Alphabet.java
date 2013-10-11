/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author hyrumandbrescia
 */
public class Alphabet {

    char[] alphabetArray = new char[26];
    
    public Alphabet() {
    }

public void makeAlphabet (){
    alphabetArray= "abcdefghijklmnopqrstuvwxyz".toCharArray(); //type conversion
}
    
public void displayAlphabet (char letter) {
    
    System.out.println("Remaining Letters:");
    
    for(int i = 0; i < alphabetArray.length; i++) {
        
        if (alphabetArray[i] == letter) {
            alphabetArray[i] = '_';
        }
        
        System.out.print(alphabetArray[i] + " ");
    }
   
        
}

}
