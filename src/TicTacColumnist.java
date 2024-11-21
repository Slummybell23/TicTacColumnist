import java.util.*;

public class TicTacColumnist implements ITicTacColumnist
{
    private char[][] board = ITicTacColumnist.board;
    private char currPlayer = ITicTacColumnist.curPlayer;
    private int numMoves = ITicTacColumnist.numMoves;
    private  char winner = ITicTacColumnist.winner;

    @Override
    public void startGame()
    {
        board = new char[3][3];
        currPlayer = 'O';
        numMoves = 0;
        winner = '*';
    }

    @Override
    public int getColumn()
    {
        char nullChar = '\u0000';
        Random rand = new Random();
        int col = rand.nextInt(3);
        if(board[0][col] != nullChar && board[1][col] != nullChar && board[2][col] != nullChar){
            if(curPlayer == 'X')currPlayer = 'O'; else currPlayer = 'X';
            return -1;
        }
        return col;
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
        board[row][col] = currPlayer;

        //Flips player
        if(curPlayer == 'O')
            currPlayer = 'X';
        else if(curPlayer == 'X')
            currPlayer = 'O';

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
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return (board[i][0] == 'X'? 2: 1);
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i]);
                return (board[0][i] == 'X'? 2: 1);
        }
        if(board[0][0] == board[1][1] &&  board[1][1] == board[2][2])
            return (board[0][0] == 'X'? 2: 1);
        if(board[2][0] == board[1][1] &&  board[1][1] == board[0][2])
            return (board[2][0] == 'X'? 2: 1);
        return -1;
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

