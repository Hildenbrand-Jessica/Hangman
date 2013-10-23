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

    Game game;
    String difficulty;
    
public void startGame(String difficulty){
    
    game = new Game();
    
    switch(difficulty){
        case "E":
          game.startGame(6);
          break;
        case "M":
          game.startGame(5);
          break;
        case "D":
          game.startGame(4);       
          break;            
    }
}   
public void getDifficulty() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter E for Easy, M for Medium, or H for Hard: ");
        this.difficulty = input.next();

    }

}
