package string;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fisrt name: ");
        String fisrtName = sc.nextLine();
        System.out.println("Enter your second name: ");
        String secondName = sc.nextLine();

        System.out.println("Your full name is: " + fisrtName + " " + secondName);
    }
}
