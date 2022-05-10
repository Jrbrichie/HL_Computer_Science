package Unit5_Arrays.BankAccount;

/**
 * User: 67364
 * Date: 06/04/22
 */
public class BankAccount {
    private double balance;
    private String account;

    public BankAccount(double balance, String account) {
        this.balance = balance;
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", account='" + account + '\'' +
                '}';
    }
}
