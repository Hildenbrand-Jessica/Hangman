
package hangman;

import java.io.Serializable;
import java.util.Scanner;

public class HelpMenuView extends Menu implements Serializable{
    
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    }
    
    private final static String[][] menuItems= {
        {"B", "The board"},
        {"G", "The Hangman game"},
        {"L", "Letter holder"},
        {"R", "A regular player"},
        {"S", "Secret word"},
        {"Q", "Quit Help"}
        
    };
    
    private HelpMenuControl helpMenuControl=new HelpMenuControl();
    
    public String getInput() {
        
        String command;
        do {
            this.display();
            
            command=this.getCommand();
            switch (command) {
                case BOARD:
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case GAME:
                    this.helpMenuControl.displayGameHelp();
                    break; 
                 case LETTER_HOLDER:
                    this.helpMenuControl.displayGameHelp();
                    break;
                 case REG_PLAYER:
                    this.helpMenuControl.displayRegularPlayerHelp();
                    break; 
                 case SECRET_WORD:
                    this.helpMenuControl.displaySecretWordHelp();
                    break; 
                case QUIT: 
                    return "QUIT";
            }
        } while (!command.equals("Q"));  
        
         return "PLAYING";
    }
    
    @Override
    public void display() {
        System.out.println("\nEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t" + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
    }
   protected final String getCommand() {

        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {

            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!valid) {
                new HangmanError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
     
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
}

