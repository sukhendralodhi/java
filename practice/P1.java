package practice;

public class P1 {

    static void  checkAge(int age) {
        if(age > 18) {
            System.out.println("Access granted");
        } else {
            System.out.println("Accesss denied");
        }
    }
    public static void main(String[] args) {
        checkAge(16);
    }
}
