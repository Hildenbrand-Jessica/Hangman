
package hangman;

import citbyui.cit260.hangman.enums.*;
import java.io.Serializable;
import java.util.Scanner;


public class HelpMenuView extends Menu implements Serializable{
    private static final String BOARD = "B";
    private static final String GAME = "G";
    private static final String LETTER_HOLDER = "L";
    private static final String REG_PLAYER = "R";
    private static final String SECRET_WORD = "S";
    private static final String QUIT = "Q";
    
    
    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    }
    
    private final static String[][] menuItems= {
        {"B", "Board"},
        {"G", "Game"},
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
                case GameStatus.BOARD:
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case GameStatus.GAME:
                    this.helpMenuControl.displayGameHelp();
                    break; 
                 case GameStatus.LETTER_HOLDER:
                    this.helpMenuControl.displayGameHelp();
                    break;
                 case GameStatus.REG_PLAYER:
                    this.helpMenuControl.displayRegularPlayerHelp();
                    break; 
                 case GameStatus.SECRET_WORD:
                    this.helpMenuControl.displaySecretWordHelp();
                    break; 
                case GameStatus.QUIT: 
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

