import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age");
        // int age = sc.nextInt();
        // System.out.println("Your age is: " + age);

        System.out.println("Enter the numbers: ");
        int fisrtNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int result = fisrtNumber + secondNumber;

        System.out.println("Your sum is : " + result);

        // close
        sc.close();
    }}
