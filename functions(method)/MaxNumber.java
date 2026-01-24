public class MaxNumber {

    // static int checkMax(int a, int b) {
    // if (a > b) {
    // return a;
    // } else {
    // return b;
    // }
    // }

    // public static void main(String[] args) {
    // System.out.println(checkMax(4, 5));
    // }

    // static int max(int a, int b, int c) {
    // if (a > b) {
    // if (a > c) {
    // return a;
    // } else {
    // return c;
    // }
    // } else if (b > a) {
    // if (b > c) {
    // return b;
    // } else {
    // return c;
    // }
    // } else {
    // return b;
    // }
    // }

    static int checkMax(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkMax(43, 15, 6));
    }

}
