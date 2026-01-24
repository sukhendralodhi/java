package opps.classes1;

public class LearnConstructure {
    public static void main(String[] args) {
        // Complex obj1 = new Complex();
        // obj1.print();
    }
}

class Complex {
    int a, b;

    // public Complex() {
    // a = 10;
    // b = 99;
    // System.out.println("Creating a new obj");
    // }

    public Complex(int real, int imaginary) {
        a = real;
        b = imaginary;
    }

    void print() {
        System.out.println(a + " + " + b + "i");
    }
}
