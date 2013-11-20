
package hangman;
import java.io.Serializable;
//Jessica added the array to numWins and the for each loop to display the number of wins the player has.
public class Wins implements Serializable {
    int numWins[] = {1};
    int total = 0;
    String encourage= "Way to go!";
   
    //Inserted Constructor
    public Wins() {
        for (int i: numWins)  {
            System.out.println("You Win!");
            total += i;
            if (i==1) break;
    }
       System.out.print(encourage);   
        
    }

    public int[] getNumWins() {
        return numWins;
    }

    public void setNumWins(int[] numWins) {
        this.numWins = numWins;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getEncourage() {
        return encourage;
    }

    public void setEncourage(String encourage) {
        this.encourage = encourage;
    }
    
    
    public void displayNumWins() {
        
        System.out.print("\n\n");
     
}
    
}
