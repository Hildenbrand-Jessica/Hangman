
package hangman;

/**
 *
 * @author jessicahildenbrand
 */
public class Game {
    
    public static final String CONTINUE = "CONTINUE";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";

    private String gameType;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    private Board board;
    
    private int numTurns;
    private int numGuesses;
    
    AskForWord myWord;

    //Constructor
    public Game() {
        numGuesses = 0;
    }

    public Game(String gameType) {
        this();

        this.gameType = gameType;
        
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumTurns() {
        return numTurns;
    }

    public void setNumTurns(int numTurns) {
        this.numTurns = numTurns;
    }

    
    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;

    }

    public void startGame(int numTurns) {
        
        String guessedLetter;
        GuessedLetters myGuessedLetter = new GuessedLetters();
        
        //Set the number of turns based on difficulty level and start the game
        setNumTurns(numTurns);
        
        //Ask for word
        myWord = new AskForWord();
        myWord.displayBlankSpaces();
        
        
        //TODO: Add loop that continues until (numGuess >= numTurns) is reached
        String turnNum = "";// StringBuilder would be more efficient.
            int numGuess = 0;
            while (numGuess >= numTurns) {
            numGuesses++;
        //guessedLetter = myGuessedLetter.getGuess();
        //numGuesses++;
        //TODO: Check to see if the guessed letter is a match or not
        
}
                
        
    }

    public String getWinningMessage () {
        return "\n\t*******************************************************************************"
             + "\n\t Congratulations " + winner.getName() + "! You won the game."
             + "\n\t Sorry " + loser.getName() + ", You are the loser." 
             + "\n\t*******************************************************************************";
    }

    public String getTiedMessage () {
       return "\n\t*******************************************************************************"
             + "\n\t The game is a tie. Better luck next time!" 
             + "\n\t*******************************************************************************";
    }

    String getPlayerStastics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public char guessedLetter){
    for(int i = 0; i<=mysteryArray.length; i++){
       if(wordArray[i] == guessedLetter){
           mysteryArray[i] = guessedLetter;
       }else{
           numberGuesses--;
       }
    }
    return numberGuesses;
 } 
    
}
