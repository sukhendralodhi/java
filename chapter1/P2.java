import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double sum = a + b;
        System.out.println("The sum is: " + sum);

        double difference = a - b;
        System.out.println("The difference: " + difference);

        double product = a * b;
        System.out.println("The Product: " + product);

        double quotient = a / b;
        System.out.println("The Quotient: " + quotient);

        double remainder = a % b;
        System.out.println("The Remainder: " + remainder);

        sc.close();
    }
}

