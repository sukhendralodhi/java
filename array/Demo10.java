class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvanceCalc extends Calculator {
    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

class ScientificCal extends AdvanceCalc {
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

public class Demo10 {
    public static void main(String[] args) {
        ScientificCal obj = new ScientificCal();
        int res1 = obj.add(10, 3);
        int res2 = obj.sub(10, 8);
        int res3 = obj.multi(3, 6);
        int res4 = obj.div(8, 3);
        double res5 = obj.power(4, 2);
        System.out.println("Addition: " + res1);
        System.out.println("Subtraction: " + res2);
        System.out.println("Multipication: " + res3);
        System.out.println("Division: " + res4);
        System.out.println("Power: " + res5);
    }
}
