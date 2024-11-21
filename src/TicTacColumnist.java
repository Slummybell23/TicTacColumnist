public class TicTacColumnist implements ITicTacColumnist
{
    private char[][] board = ITicTacColumnist.board;
    private char curPlayer = ITicTacColumnist.curPlayer;
    private int numMoves = ITicTacColumnist.numMoves;
    private  char winner = ITicTacColumnist.winner;

    @Override
    public void startGame()
    {
        board = new char[3][3];
        curPlayer = 'O';
        numMoves = 0;
        winner = '*';
    }

    @Override
    public int getColumn()
    {
        return 0;
    }

    @Override
    public boolean validateInput(int col, int row)
    {
        //Checks if out of bounds
        if(row >= board.length || row < 0 || col >= board[row].length || col < 0)
            return false;

        //Checks if space occupied
        if(board[row][col] == 'X' || board[row][col] == 'O')
            return false;

        return true;
    }

    @Override
    public void makeMove(int col, int row)
    {
        board[row][col] = curPlayer;

        //Flips player
        if(curPlayer == 'O')
            curPlayer = 'X';
        else if(curPlayer == 'X')
            curPlayer = 'O';

        numMoves++;
    }

    @Override
    public int gameStatus()
    {
       int statusOut = checkWinner(); // Calls the checkWinner method. to determine if there is a winner.
		boolean isFull = false;

		if (statusOut == -1) { // Checks if board is full if there is no winner.

			isFull = isBoardFull(); // Calls the isBoardFull method to determine if the board is full.

			if (isFull) { // If the board is full changes the return.

				statusOut = 0;

			}
		}

		return statusOut; // Returns the game status.
    }

    @Override
    public int checkWinner()
    {
        return 0;
    }

    @Override
    public boolean isBoardFull()
    {
      boolean isFull = false;
		if (numMoves == 9) { // Checks if 9 moves have been made and the board is full

			isFull = true;
		}

		return isFull;
    }
}
