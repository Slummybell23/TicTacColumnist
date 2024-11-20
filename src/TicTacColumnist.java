public class TicTacColumnist implements ITicTacColumnist
{
    private char[][] board = ITicTacColumnist.board;
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
