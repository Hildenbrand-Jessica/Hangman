/**
 *
 * @author hyrumandbrescia
 */
public enum GameStatus {

    //BOARD("The board"),
    BOARD ("B", "The Board"),
    GAME("G", "The Hangman game"),
    LETTER_HOLDER("L", "Letter holder"),
    REG_PLAYER("R", "A regular player"),
    SECRET_WORD("S", "Secret word"),
    QUIT("Q", "Quit Help");
    String message;

    private GameStatus(String Command, String message) {
        this.message = message;

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