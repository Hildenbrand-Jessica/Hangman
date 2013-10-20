/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author hyrumandbrescia
 */
public class MainMenuControl {

    int numTurns;
    String difficulty;
    
public void startGame(String difficulty){
    Game game;
    switch(difficulty){
        case "E":
          numTurns = 6;
        case "M":
            numTurns = 5;
        case "D":
            numTurns = 4;       
    }
}   
public void getDifficulty() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter E for Easy, M for Medium, or H for Hard: ");
        this.difficulty = input.next();

    }

}
