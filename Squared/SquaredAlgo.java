package Squared;
import java.util.Scanner;

/**
 * User: 67364
 * Date: 26/03/22
 */
public class SquaredAlgo {

    //class attributes
    private int[][] board;
    private double money, bet;
    private int wins;
    private String choice;

    //constructor
    public SquaredAlgo(double money, double bet) {
        this.board = new int[5][5];
        this.money = money;
        this.bet = bet;
        wins = 0;
        choice = "";
    }


    //returns wins
    public int getWins() {
        return wins;
    }

    //returns money
    public double getMoney(){
        return money;
    }

    public String getChoice(){
        return choice;
    }

    //sets money at hand
    public void setMoney(double money) {
        this.money = money;
    }

    //sets choice
    public void setChoice(String choice){
        this.choice = choice;
    }

    //sets bet
    public void setBet(double bet) {
        this.bet = bet;
    }

    //fills board
    public void setBoard() {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                board[i][j] = (int)(Math.random() * 2);
            }
        }
    }


    //sets money based on winnings and returns money
    public double updateMoney(){
        if(wins > 0){
            money += (bet / 2) * wins;
        } else {
            money -= bet;
        }
        return money;
    }

    //prints all elements in the board
    public void printBoard(){
        for(int[] row : board){
            for(int i : row){
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }


    /**
     * checks for 2x2 squares by iterating through the first 4 rows and columns
     * increments wins
     */
    public void twoByTwo(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int e = board[i][j];
                if(e == board[i + 1][j] && e == board[i + 1][j + 1] &&
                e == board[i][j + 1] && e == board[i + 1][j + 1]){
                    wins++;
                    System.out.println("two");
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

                for(int k = i; k < i + 3; k++){
                    for(int l = j; l < j + 3; l++){
                        if(e != board[k][l]){
                            break innerloop; //breaks inner k, l and j loops
                        }
                    }
                }
                wins++;
                System.out.println("three");
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

                for(int k = i; k < i + 2; k++){
                    for(int l = j; l < j + 2; l++){
                        if(e != board[k][l]){
                            break innerloop; //breaks inner k, l and j loops
                        }
                    }
                }
                wins++;
                System.out.println("four");
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
        System.out.println("five");

        wins++;
    }

    //runs all checking methods
    public void runAllChecks(){
        setBoard();
        twoByTwo();
        threeByThree();
        fourByFour();
        fiveByFive();
    }


    //checks for invalid initial money, returns true/false
    public boolean invalidMoney(double m){
        return m <= 0;
    }

    //checks for invalid bet, returns true/false
    public boolean invalidBet(double b){
        return b <= 0 || b > money;
    }

    //checks for invalid (letter choice), returns true/false
    public boolean invalidChoice(String c){
        c = c.toLowerCase();
        return !(c.equals("p") || c.equals("q"));
    }

}
