public class Method {
    public static void main(String[] args) {
        // greet();
        // add(5,4);
        int result = sum(5,4);
        System.out.println(result);
    }

    // Method with No Return & No Parameters
    static void greet() {
        System.out.println("Hello greet");
    }

    // Method with Parameters
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    // Method with Return Type
    static int sum(int a, int b) {
        return a + b;
    }

}
