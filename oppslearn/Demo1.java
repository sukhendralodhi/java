package oppslearn;

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    @Override
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(4, 7);
        System.out.println(r1);
    }
}
