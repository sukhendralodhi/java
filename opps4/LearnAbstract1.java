package opps4;

abstract class TV {
    abstract void turnOn(); // only define rule
}

class SamsungTv extends TV {
    void turnOn() {
        System.out.println("Samsung TV turning on...");
    }
}

public class LearnAbstract1 {
    public static void main(String[] args) {
        SamsungTv tv1 = new SamsungTv();
        tv1.turnOn();
    }
}
