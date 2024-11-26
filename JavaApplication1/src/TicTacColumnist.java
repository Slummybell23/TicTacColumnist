 /********************************
 Name:           Cache Salyers, John, Aiden
 Problem Set:    4
 Due Date:       11/25/2024
 ********************************/

import java.util.Random;

public class TicTacColumnist extends TicTacToeGame 
{
    private int column;
    
    /**
    * Sets valid column index from random one run. 
    * If column full, returns -1 and flip player.
    * @param board passes the game board into the method to modify.
    */
    public void setColumn(char[][] board)
    {
        char nullChar = '\u0000';
        Random rand = new Random();
        int col = rand.nextInt(3);
        if(board[0][col] != nullChar && board[1][col] != nullChar && board[2][col] != nullChar){
            col = -1;
        }
        
        column = col;
    }
    
    /**
    * Returns column
    * @return int location of column.
    */
    public int getColumn()
    {
        return column;
    }

}
