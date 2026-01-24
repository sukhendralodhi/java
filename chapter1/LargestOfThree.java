public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 26;
        int c = 10;

        if (a > b) {
            if (a > c) {
                System.out.println("A is greater");
            } else {
                System.out.println("C is greater");
            }
        } else {
            if (b > c) {
                System.out.println("B is greater");
            } else {
                System.out.println("C is greater");
            }
        }

    }
}
