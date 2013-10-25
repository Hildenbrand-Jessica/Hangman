
package hangman;

import java.util.Scanner;

/**
 *
 * @author jessicahildenbrand
 */
public class MainMenuView {
    
    private static final String[][] menuItems = {
        {"E", "Easy Difficulty"},
        {"M", "Medium Difficulty"},
        {"D", "Hard Difficulty"},
        {"H", "Help"},
        {"X", "Exit Hangman"}
    }; 
  //added the MainMenuControl so that it connects to the class that Brescia will create
    MainMenuControl mmc = new MainMenuControl();
    
    
    public MainMenuView() {

    }
 
    
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

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = MainMenuView.menuItems;

        for (String[] item : MainMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
   
    
}
