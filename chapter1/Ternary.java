import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // int max = (a > b) ? a: b;

        // System.out.println(max);

        Scanner sc = new Scanner(System.in);

        System.out.print("Pls enter the number for check numer is even or odd: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is: " + result);

    }
}
