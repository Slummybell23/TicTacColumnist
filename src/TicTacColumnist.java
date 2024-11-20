public class TicTacColumnist implements ITicTacColumnist
{
    private char[][] board = ITicTacColumnist.board;
    private char curPlayer = ITicTacColumnist.curPlayer;
    private int numMoves = ITicTacColumnist.numMoves;
    private  char winner = ITicTacColumnist.winner;

    @Override
    public void startGame()
    {
    }

    @Override
    public int getColumn()
    {
        return 0;
    }

    @Override
    public boolean validateInput(int col, int row)
    {
        return false;
    }

    @Override
    public void makeMove(int col, int row)
    {

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
