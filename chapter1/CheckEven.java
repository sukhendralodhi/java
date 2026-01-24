import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to check number is even or odd: ");
        int number = sc.nextInt();

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive and even number");
            } else {
                System.out.println("Positive and Odd number");
            }
        } else {
            System.out.println("Negative number");
        }
        sc.close();
    }
}
