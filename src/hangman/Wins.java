
package hangman;

//Jessica added the array to numWins and the for each loop to display the number of wins the player has.
public class Wins {
    int numWins[] = {6, 2, 3, 1, 8, 6, 7, 5, 9, 10};
    int total = 0;
    String encourage= "Way to go!";
    
    public Wins() {
        for (int i: numWins)  {
            System.out.println("You have " + i + " wins!");
            total += i;
            if (i==6) break;
    }
       System.out.print(encourage);   
        
    }
    public void displayNumWins() {
        
        System.out.print("\n\n");
     
}
    
}
