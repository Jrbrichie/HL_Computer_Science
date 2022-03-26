package Squared;

import java.util.Locale;
import java.util.Scanner;

/**
 * User: 67364
 * Date: 26/03/22
 */
public class SquaredAlgo {
    //class attributes
    private int[][] board;
    private final Scanner in;
    private double money, bet;
    private int wins;

    //constructor
    public SquaredAlgo(int[][] board, Scanner in, double money, double bet, int wins) {
        this.board = new int[5][5];
        this.in = new Scanner(System.in);
        this.money = money;
        this.bet = bet;
        this.wins = wins;
    }


    //sets money at hand
    public void setMoney(double money) {
        this.money = money;
    }

    //sets bet
    public void setBet(double bet) {
        this.bet = bet;
    }

    //fills board
    public void setBoard(int[][] board) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                board[i][j] = (int)(Math.random() * 2);
            }
        }
    }

    //sets money based on winnings
    public void updateMoney(){
        if(wins > 0){
            money += (bet / 2) * wins;
        } else {
            money -= bet;
        }
    }


    /**
     * checks for 2x2 squares by iterating through the first 4 rows
     * increments wins
     */
    public void twoByTwo(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int e = board[i][j];
                if(e == board[i + 1][j] && e == board[i + 1][j + 1] &&
                e == board[i][j + 1] && e == board[i + 1][j + 1]){
                    wins++;
                }
            }
        }
    }

    /**
     * checks for 3x3 squares by iterating through first 3 rows
     * increments wins
     */
    public void threeByThree(){
        for(int i = 0; i < 3; i++){
            innerloop:
            for(int j = 0; j < 3; j++){
                int e = board[i][j];

                for(int k = i; k < 3; k++){
                    for(int l = j; l < 3; l++){
                        if(e != board[k][l]){
                            break innerloop; //breaks inner k, l and j loops
                        }
                    }
                }
                wins++;
            }
        }
    }

    /**
     * checks if there are 4x4 squares via referencing
     * the first 2x2 square of elements in the top left
     * increments wins
     */
    public void fourByFour(){
        for(int i = 0; i < 2; i++){
            innerloop:
            for(int j = 0; j < 2; j++){
                int e = board[i][j];

                for(int k = i; k < 4; k++){
                    for(int l = j; l < 4; l++){
                        if(e != board[k][l]){
                            break innerloop; //breaks inner k, l and j loops
                        }
                    }
                }
                wins++;
            }
        }
    }

    /**
     * (unlikely but) checks if all elements are the same by
     * only checking the existence of outliers
     * increments wins
     * @return if there is a 5x5 square
     */
    public void fiveByFive(){
        int e = board[0][0];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(e != board[i][j]){
                    return; //exits the method
                }
            }
        }

        wins++;
    }


    //checks for invalid initial money, returns true/false
    public boolean invalidMoney(){
        return money <= 0;
    }

    //checks for invalid bet, returns true/false
    public boolean invalidBet(){
        return bet <= 0 || bet > money;
    }

    //checks for invalid (letter choice), returns true/false
    public boolean invalidChoice(String choice){
        choice = choice.toLowerCase();
        return !(choice.equals("p") || choice.equals("q"));
    }
}
