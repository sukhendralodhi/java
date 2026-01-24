package opps.classes1;

public class Demo1 {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.color = "red";
        // c1.speed = 120;
        // c1.drive();
        BankAccount b1 = new BankAccount();
        System.out.println(b1.getBalance());
        b1.deposit(2000);
        System.out.println(b1.getBalance());
        
    }
}

class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}

// class Car {
//     String color;
//     int speed = 120;

//     void drive() {
//         System.out.println("Car is driving");
//     }
// }


