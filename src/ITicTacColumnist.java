public interface ITicTacColumnist
{
    public char[][] board = new char[3][3];
    public char curPlayer = 'O';
    public int numMoves = 0;
    public char winner = '*';

    public void startGame(); // Initializes fields to defaults

    public int getColumn(); //Returns valid column index from random one run. If column full, returns -1 and flip player

    public boolean validateInput(int col, int row); //check if occupied or out of bound

    public void makeMove(int col, int row); //increment numMoves and modify board, and flip player...

    public int gameStatus(); // -1 = no change in status, 0 = tie, 1 = O, 2 = X

    /*
    gameStatus

    winner? = checkwinner; no winner = -1

    boolean isFull = false;
    if(winner? == -1)
    {
        isFull = checkfull;

        ifFull is true return 0;
    }

    return winner?;
     */

    public int checkWinner(); //returns -1 = no winner ,1 = O, 2 = X

    public boolean isBoardFull(); //Check if board is full
}
