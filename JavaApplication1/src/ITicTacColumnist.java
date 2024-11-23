/**
 * Interface to tell how to make the backend of the game.
 *  
 */
public interface ITicTacColumnist
{
    public char[][] board = new char[3][3];
    public char curPlayer = 'O';
    public int numMoves = 0;
    public char winner = '*';

    /**
     * Initializes fields to defaults.
     */
    public void startGame();

    /**
    * Returns valid column index from random one run. 
    * If column full, returns -1 and flip player.
    */
    public void setColumn();

    /**
     * Increment numMoves and modify board, and flip player.
     * @param col tells what column the turn is being made in.
     * @param row tells what row the turn is being made in.
     */
    public void makeMove(int col, int row); 

    /**
     * Checks the status of the game.
     * @return -1 = no change in status, 0 = tie, 1 = O, 2 = X
     */
    public int gameStatus();

    /**
     * Finds the winner of game
     * @return -1 = no winner ,1 = O, 2 = X
     */
    public int checkWinner();

    /**
     * Check if board is full.
     * @return true if board is full, false if not.
     */
    public boolean isBoardFull();
}
