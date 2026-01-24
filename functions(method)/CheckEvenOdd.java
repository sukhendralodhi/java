public class CheckEvenOdd {
    // static void checkNumber(int number) {
    //     if(number % 2 == 0) {
    //         System.out.println("Even number");
    //     } else {
    //         System.out.println("Odd number");
    //     }
    // }

    // public static void main(String[] args) {
    //     checkNumber(4);
    // }


    // static boolean isEven(int number) {
    //     return number % 2 == 0;
    // }

    static boolean checkPositive(int number) {
        if(number < 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        if(checkPositive(4)) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
