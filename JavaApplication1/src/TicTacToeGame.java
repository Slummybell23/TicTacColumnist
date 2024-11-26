 /********************************
 Name:           Cache Salyers, John, Aiden
 Problem Set:    4
 Due Date:       11/25/2024
 ********************************/

import java.util.*;

/**
 * Class to hold the backend of the game.
 * 
 */
public class TicTacToeGame implements ITicTacToeGame
{
    private char[][] board = ITicTacToeGame.board;
    private char currPlayer = ITicTacToeGame.curPlayer;
    private int numMoves = ITicTacToeGame.numMoves;
    private char winner = ITicTacToeGame.winner; 

    public void startGame()
    {
        board = new char[3][3];
        currPlayer = 'O';
        numMoves = 0;
        winner = '*';
    }
    
    public char getPlayer()
    {
        return currPlayer;
    }

    public char[][] getBoard()
    {
        return board;
    }
    
    public void flipPlayer()
    {
        //Flips player
        if(currPlayer == 'O')
            currPlayer = 'X';
        else if(currPlayer == 'X')
            currPlayer = 'O';
    }

    public void makeMove(int col, int row)
    {
        board[row][col] = currPlayer;

        //Flips player
        if(currPlayer == 'O')
            currPlayer = 'X';
        else if(currPlayer == 'X')
            currPlayer = 'O';

        numMoves++;
    }

    public int gameStatus()
    {
        int statusOut = checkWinner(); // Calls the checkWinner method. to determine if there is a winner.
        boolean isFull = false;
        if (statusOut == -1) // Checks if board is full if there is no winner.
        { 
            isFull = isBoardFull(); // Calls the isBoardFull method to determine if the board is full.
            
            if (isFull) // If the board is full changes the return.
                statusOut = 0;
        }

        return statusOut; // Returns the game status.
    }

    public int checkWinner()
    {
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2])
            {
                if(board[i][0] == 'X')
                    return 2;
                else if(board[i][0] == 'O')
                    return 1;
            }
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i])
            {
                if(board[0][i] == 'X')
                    return 2;
                else if(board[0][i] == 'O')
                    return 1;
            }
        }
        
        if(board[0][0] == board[1][1] &&  board[1][1] == board[2][2])
        {
            if(board[0][0] == 'X')
                return 2;
            else if(board[0][0] == 'O')
                return 1;
        }
        
        if(board[2][0] == board[1][1] &&  board[1][1] == board[0][2])
        {
            if(board[2][0] == 'X')
                return 2;
            else if(board[2][0] == 'O')
                return 1;
        }
        
        return -1;
    }

    public boolean isBoardFull()
    {
        boolean isFull = false;
        if (numMoves == 9) // Checks if 9 moves have been made and the board is full
        { 
            isFull = true;
        }

        return isFull;
    }
}

