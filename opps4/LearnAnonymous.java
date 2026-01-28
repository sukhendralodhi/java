package opps4;

class OuterClass {
    public void OuterMethod() {
        System.out.println("hello");
    }
}

public class LearnAnonymous {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass() {
            void sing() {
                System.out.println("Sing");
            }
        };
        obj.sing();
    }
}
