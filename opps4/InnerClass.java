package opps4;

interface Greeting {
    void sayHello();
}

public class InnerClass {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Say hello");
            }
        };
        g.sayHello();
    }
}
