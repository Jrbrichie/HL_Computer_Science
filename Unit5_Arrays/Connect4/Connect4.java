package Unit5_Arrays.Connect4;

/**
 * User: 67364
 * Date: 23/03/22
 */

import java.util.Scanner;

public class Connect4 {
    //class attributes (declared private, and some final, so they
    //are not accessed from other classes or changed
    private double money, bet;
    private String choice;
    private final int[][] board;
    private final Scanner in = new Scanner(System.in);

    //constructor setting all
    public Connect4() {
        money = 0;
        bet = 0;
        choice = "";
        board = new int[4][4];
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    //fills board with either 1 or 2
    public void fillBoard(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int num = (int)(Math.random() * 2);
                board[i][j] = num;
            }
        }
    }

    //prints all elements of the board
    public void printBoard(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * checks if there is a vertical or horizontal match/win (more efficient than two methods)
     * @return total amount of vertical and horizontal wins
     */
    public int vertAndHoriWins(){
        int totalWins = 0;
        int inARowVert = 0;
        int inARowHori = 0;

        for(int i = 0; i < 4; i++){
            inARowVert = 0;
            inARowHori = 0;

            for(int j = 0; j < 4; j++){
                if(board[j][i] == 1){
                    inARowVert++;
                }
                if(board[i][j] == 1){
                    inARowHori++;
                }
            }

            if(inARowVert == 4){
                totalWins++;
            }
            if(inARowHori == 4){
                totalWins++;
            }

        }
        return totalWins;
    }

    /**
     * checks if there are diagonal wins
     * I decided not to use a loop as there are only two possible cases (loop --> less efficient)
     * @return total amount of diagonal wins
     */
    public int diagonalWins(){
        boolean cond1 = board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1 && board[3][3] == 1; //top left to bottom right
        boolean cond2 = board[3][0] == 1 && board[2][1] == 1 && board[1][2] == 1 && board[0][3] == 1; //top right to bottom left
        int diagWins = 0;

        if(cond1){
            diagWins++;
        }
        if(cond2){
            diagWins++;
        }
        return diagWins;
    }

    /**
     * the gameLoop() uses all relevant attributes and methods to make the test class much cleaner
     *
     */
    public void gameLoop() {
        System.out.print("Enter initial money at hand: ");
        money = in.nextDouble();

        while (money < 0) {
            System.out.print("Invalid initial money. Input another amount: ");
            money = in.nextDouble();
        }

        while (money > 0) {
            System.out.print("\nEnter bet: ");
            bet = in.nextDouble();

            while (bet > money || bet < 0) {
                System.out.print("Invalid bet. Input another bet: ");
                bet = in.nextDouble();
            }

            System.out.println("P - play");
            System.out.println("Q - quit");
            System.out.print("Enter your choice: ");
            String choice = in.next();

            choice = choice.toUpperCase();
            boolean invalid = !(choice.equals("P")) && !(choice.equals("Q"));

            if(invalid){
                while(invalid){
                    System.out.print("Invalid Choice! Enter another choiec: ");
                    choice = in.next();
                    invalid = !(choice.equals("P")) && !(choice.equals("Q"));
                }

            } else if(choice.equals("P")){
                fillBoard();
                System.out.println();
                printBoard();
                System.out.println();
                int connects = vertAndHoriWins() + diagonalWins();

                if(connects > 0){
                    money += bet;
                } else {
                    money -= bet;
                }

                System.out.println("Connects: " + connects);
                System.out.println("Current money: " + money);
            } else {
                break;
            }
        }
        System.out.println("\nYou lost all of your money, or you had to go :(((");
        System.out.println("Thanks for giving your money to us :)))");
    }

}
