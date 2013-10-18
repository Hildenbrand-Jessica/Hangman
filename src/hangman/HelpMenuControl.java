
/**
 *
 * @author hyrumandbrescia
 */


package hangman;


public class HelpMenuControl {
    
       public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Hangman. An alphabet is diplayed and as "
                + "\n\ta player guesses a letter, that letter is removed from the displayed alphabet. "
                + "\n\tIf letter guessed was correct, the corrosponding blank spaces(s) will disappear "
                + "\n\tand the correct letter will appear. "
                + "\n\tIf the letter guessed was wrong, a body part will appear on the gallows. ");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tThe object of the game is guessing letters to determine your partner's secrect word. "
                + "\n\tPlayer 1 enters their secret word. "
                + "\n\tThen, the other player(s) will try to guess the word "
                + "\n\tin less than 6 attempts. "); 
        displayHelpBorder();
    }
            
    public void displayRegularPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA regular player manually takes their turn by choosing a letter  "
                + "\n\tfrom the alphabet."
                ); 
        displayHelpBorder();
    }
    
                   
    public void displaySecretWordHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tPlayer 1 will type in a secret word. "
                + "\n\tOhter players will guess the secret word."
                ); 
        displayHelpBorder();
    }
             
    public void displayLetterholderHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tThe alphabet will be displayed. As letters are guessed, "
                +"\n\tthey will disappear from the alphabet so they are not "
                +"\n\tguessed more than once. "
                ); 
        displayHelpBorder();
    }
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
  
