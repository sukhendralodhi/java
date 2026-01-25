package oppslearn;

class A {
    public void show() {
        System.out.println("From class A method show");
    }

    public void config() {
        System.out.println("From class A method config");
    }
}

class B extends A{
    public void show() {
        System.out.println("From class B method show");
    }
}

public class Demo {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        B obj = new B();
        obj.config();
        obj.show();
    }
}
