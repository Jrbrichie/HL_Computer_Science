package Unit5_Arrays.ticTacToe;

/**
 * User: 67364
 * Date: 22/03/22
 */

import java.util.Arrays;

/**
 * Create a TicTacToe application that allows two players to play against each other.
 * The first player to make a move is randomly selected.
 * The player can choose which character or text they want to use to represent a move.
 * The winner is declared only when all slots of the board are filled.
 */

class ticTacToe{
    private String p1, p2;
    private String[][] board;
    private int filledSpots;
    private int turn;

    public ticTacToe(String[][] board) {
        board = new String[3][3];
        for (String[] row : board) {
            Arrays.fill(row, "-"); //calls array class and fills all rows, with "-"
        }
        turn = 0;
        filledSpots = 0;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public void printBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                System.out.println(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String getPlayingPlayer(){
        String player = "";
        if(turn == 1){
            player = p1;
            turn = 2;
        } else if(turn == 2){
            player = p2;
            turn = 1;
        }
        return player;
    }

    //checks if all spots are filled
    public Boolean isFilled(){
        if(filledSpots == 9){
            return true;
        } return false;
    }

    //checks for vertical win
    public Boolean verticalWin(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

            }
        }
        return true;
    }

    //checks for horizontal win
    public Boolean horizontalWin(){
        return true;
    }


    //checks for diagonal win
    public Boolean diagonalWin(){
        return true;
    }

    //game loop
    public Boolean gameLoop(){
        return true;
    }
}