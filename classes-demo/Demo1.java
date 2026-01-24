class Calculator {
    int number = 12;

    public int add(int n1, int n2) {
        System.out.println(number);
        return n1 + n2;
    }
}

public class Demo1 {
    public static void main(String[] args) {

        int data = 10;

        Calculator obj = new Calculator();
        int result = obj.add(10, 20);
        System.out.println(result);
    }
}
