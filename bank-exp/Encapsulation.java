
class Account {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        double res = acc.getBalance();
        System.out.println(res);
    }
}
