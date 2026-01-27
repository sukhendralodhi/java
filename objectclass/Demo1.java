package objectclass;

class A {
    public void show1() {
        System.out.println("From class A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("From class B");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        A obj = (A) new B(); // called upcasting
        obj.show1();
    }
}
