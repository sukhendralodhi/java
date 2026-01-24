package opps.classes1;

public class MainClass {
    public static void main(String[] args) {
        Complex number1 = new Complex();
        number1.a = 3;
        number1.b = 6;
        number1.print();
    }
}

class Complex {
    int a, b;

    void print() {
        System.out.println(a+" + "+b+"i");
    }
}
