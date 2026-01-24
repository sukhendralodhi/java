package opps.classes1;

  class Car {
        String color;
        int speed;

        void drive() {
            System.out.println("Car is driving");
        }
    }

public class Learn1 {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "red";
        c1.speed = 120;

        c1.drive();
    }
}
