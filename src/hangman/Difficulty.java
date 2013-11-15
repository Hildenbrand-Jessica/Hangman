/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author hyrumandbrescia
 */
public class Difficulty implements Serializable{

    private Game game;
    private String difficulty;

    //Constructor Added
    private Difficulty() {
    }
    //Added Getter and Setter Functions
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
    
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
 private static final String[][] menuItems = {
        {"E", "Easy Difficulty"},
        {"M", "Medium Difficulty"},
        {"D", "Hard Difficulty"},
        {"H", "Help"},
        {"X", "Exit Hangman"}
    }; 
  //added the Difficulty so that it connects to the class that Brescia will create
    Difficulty mmc = new Difficulty();
 
    
    public String getInput(Object object) {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();

            String command = this.getCommand();
            switch (command) {
                case "E":
                    this.mmc.startGame("E");                    
                    return Game.EXIT;
                case "M":
                    this.mmc.startGame("M");
                    return Game.EXIT;
                case "D":
                    this.mmc.startGame("D");
                    return Game.EXIT; 
                case "H":
                    HelpMenuView helpMenu = Hangman.getHelpMenu();
                    helpMenu.getInput();
                    break;
                case "X":
                    return Game.EXIT;
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }
    
    
   public final String getCommand() {

        Scanner inFile = Hangman.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new HangmanError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < Difficulty.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = Difficulty.menuItems;

        for (String[] item : Difficulty.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
   
    
}
