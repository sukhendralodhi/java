package objectclass;

public class Car extends Vehicle {

    String color;

    void start() {
        super.start();
        System.out.println(this);
        System.out.println(this.model + " Car is starting");
    }

    Car() { 
        super(3); // calling another constructor that created in Vehicle class with wheels parameter
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelCount = 10;
        obj.model = "Hyundai I10";
        obj.start();
    }
}
