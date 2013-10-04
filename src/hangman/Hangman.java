
package hangman;

import java.util.Scanner;

public class Hangman {
String name;
String instructions = "This is the game of Hangman \n\n";
    


    
    public static void main(String[] args) {
        Hangman myGame = new Hangman();
        myGame.getName();
        myGame.displayHelp();
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        this.name = input.next();
    }
}
