import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter the password: ");
        String Password = sc.next();

        if (username.equals("admin")) {
            if (Password.equals("1234")) {
                System.out.println("Login Success");
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Invalid user name");
        }
        sc.close();
    }
}
