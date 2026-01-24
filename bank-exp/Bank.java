class Account {
    int accountNumber;
    String holderName;
    double balance;
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.accountNumber = 12345;
        account1.holderName = "Mohan";
        account1.balance = 1000;

        System.out.println(account1);

    }
}
