
package hangman;

//Jessica added the array to numWins and the for each loop to display the number of wins the player has.
public class Wins {
    int numWins[] = {1};
    int total = 0;
    String encourage= "Way to go!";
    
    public Wins() {
        for (int i: numWins)  {
            System.out.println("You Win!");
            total += i;
            if (i==1) break;
    }
       System.out.print(encourage);   
        
    }
    public void displayNumWins() {
        
        System.out.print("\n\n");
     
}
    
}
