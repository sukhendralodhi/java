public class Atm {
    public static void main(String[] args) {
        int balance = 1000;
        int amount = 5900;

        if (amount <= balance) {
            if (amount % 100 == 0) {
                System.out.println("Please collect a cash");
            } else {
                System.out.println("Enter amount multiples with 100");
            }
        } else {
            System.out.println("Insufficient fund");
        }
        
    }
}
