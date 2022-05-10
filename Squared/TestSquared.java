package Squared;

/**
 * User: 67364
 * Date: 26/03/22
 */
import java.util.Scanner;

public class TestSquared {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SquaredAlgo game = new SquaredAlgo(0,0);

        System.out.print("Enter initial money: ");
        double money = in.nextDouble();

        while(game.invalidMoney(money)){
            System.out.print("Invalid initial money! Input another sum: ");
        }
        game.setMoney(money);

        while(game.getMoney() != 0){
            System.out.print("Enter bet: ");
            double bet = in.nextDouble();

            while(game.invalidBet(bet)){
                System.out.println("Invalid bet! Input another sum: ");
                bet = in.nextDouble();
            }

            System.out.print("P - play\nQ - quit\nEnter choice: ");
            String choice = in.next();
            while(game.invalidChoice(choice)){
                System.out.print("Invalid choice! Input another choice: ");
                choice = in.next();
            }

            if(game.getChoice().equals("Q")){
                break;
            }

            game.setBet(bet);
            game.runAllChecks();
            double newMoney = game.updateMoney();

            game.printBoard();
            System.out.println("Number of squares: " + game.getWins());
            System.out.println("Current money at hand: " + newMoney);
        }

        System.out.println("You had to go or you lost all your money :(((");
        System.out.println("Thanks for the cash :)))");
    }
}
