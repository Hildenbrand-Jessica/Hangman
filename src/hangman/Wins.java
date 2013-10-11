
package hangman;


public class Wins {
    int numWins;
    
    public Wins() {
        numWins=3;
    }
    public void displayNumWins() {
        System.out.println("You have " + this.numWins + " wins.");
}
    
}
