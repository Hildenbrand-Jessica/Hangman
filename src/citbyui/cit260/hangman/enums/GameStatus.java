package citbyui.cit260.hangman.enums;

/**
 *
 * @author hyrumandbrescia
 */
public enum GameStatus {

    BOARD ("B", "The Board"),
    GAME("G", "The Hangman game"),
    LETTER_HOLDER("L", "Letter holder"),
    REG_PLAYER("R", "A regular player"),
    SECRET_WORD("S", "Secret word"),
    QUIT("Q", "Quit Help");
    String message;
    final public String Command;
    private GameStatus(String Command, String message) {
        this.message = message;
        this.Command = Command;
    }
    final public String command(){
        return Command;
    }
            
    /*public void GetInput() {
        command.display();
    }*/

    public String getMessage() {
        return message;
    }

    public void display() {
        System.out.println(this.message);
    }
}