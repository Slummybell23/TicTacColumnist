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
    public boolean isBoardFull()
    {
        return false;
    }
    
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
    public int getColumn()
    {
        char nullChar = '\u0000';
        int col = random(3);
        if(board[0][col] != nullChar && board[1][col] != nullChar && board[2][col] != nullChar){
            if(curPlayer == 'X')currPlayer = 'O'; else currPlayer = 'X';
            return -1;
        }
        return col;
    }


}
