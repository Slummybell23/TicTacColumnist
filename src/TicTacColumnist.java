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
        return 0;
    }

    @Override
    public int checkWinner()
    {
        return 0;
    }

    @Override
    public boolean isBoardFull()
    {
        return false;
    }
}
