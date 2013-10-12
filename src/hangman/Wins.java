
package hangman;


public class Wins {
    int numWins;
    String encourage;
    
    public Wins() {
        numWins= 4+4;
        encourage= "Way to go! ";
        
        if(numWins>0) System.out.print(encourage);
    }
    public void displayNumWins() {
        System.out.println("You have " + this.numWins + " wins!");
        System.out.print("\n\n");
        //Added the escape on line above
}
    
}
