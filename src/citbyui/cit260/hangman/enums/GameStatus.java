


/**
 *
 * @author hyrumandbrescia
 */
public enum GameStatus {
   BOARD ("The board"),
   GAME ("The Hangman game"),
   LETTER_HOLDER ("Letter holder"),
   REG_PLAYER ("A regular player"),
   SECRET_WORD ("Secret word"),
   QUIT ("Quit Help");
    
    String message;
            }
public void GetInput(){
    command.display();
}

private GameStatus() {
    this.message=message;
}

public String getMessage(){
    return message;
}
public void display(){
system.out.println(this.message);
}

