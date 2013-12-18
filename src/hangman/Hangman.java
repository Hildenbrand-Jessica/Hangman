package hangman;

import java.util.Scanner;
import citbyui.cit260.hangman.frames.MainFrame;

public class Hangman {

    //jessicahildenbrand added these two lines
    private static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
    private static final Difficulty difficulty = new Difficulty();
    public static MainFrame mainFrame;

    public static Scanner getInputFile() {
        return Hangman.inFile;
    }
    String name;
    String instructions = "This is the game of Hangman \n\n";

    public Hangman() {
    }

    public static HelpMenuView getHelpMenu() {
        return Hangman.helpMenu;

    }

    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        this.name = input.next();

    }
    
//MainFraim.java
    public static void main(String[] args) {

        Hangman myGame = new Hangman();
        
//             Hangman hangman =null;
//        
//        try {  
//            hangman = new Hangman();
//        
//                 java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                    Hangman.mainFrame = new MainFrame();
//                    Hangman.mainFrame.setVisible(true);
//                }
//            });
//        } 
//
//        catch (Throwable ex) {     
//           // ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
//           //ErrorType.displayErorrMsg(ex.getStackTrace().toString());           
//        } 
//        finally {
//            if (Hangman.mainFrame != null) {
//                Hangman.mainFrame.dispose();
//            }
//        }
        myGame.getName();
        myGame.sorter();
        difficulty.getInput(null);
        

        Hangman.inFile.close();

        
        //This is where the GUI code starts
               Hangman hangman = null;
        try {  
            hangman = new Hangman();
        
                 java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Hangman.mainFrame = new MainFrame();
                    Hangman.mainFrame.setVisible(true);
                }
            });
        } 

        catch (Throwable ex) {     
           // ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
           //ErrorType.displayErorrMsg(ex.getStackTrace().toString());           
        } 
        finally {
            if (Hangman.mainFrame != null) {
                Hangman.mainFrame.dispose();
            }
        }   
        
        //This is where the GUI code ends
    }

 

    public void displayHelp() {
    }

    public void sorter() {
        char[] nameArray;
        nameArray = this.name.toCharArray();
        sortStringExchange(nameArray);
        for (int i = 0; i <= this.name.length() - 1; i++) {
            System.out.println(nameArray[ i]);
        }
    }

    public void sortStringExchange(char nameArray[]) {
        int k, j;
        char temp;

        for (k = 0; k < nameArray.length - 1; k++) {
            for (j = k + 1; j < nameArray.length; j++) {
                if (nameArray[k] > nameArray[j]) {
                    temp = nameArray[k];
                    nameArray[k] = nameArray[ j];    // swapping
                    nameArray[j] = temp;

                }
            }
        }
    }
}
