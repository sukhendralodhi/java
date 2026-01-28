package objectclass;

public class Vehicle {
    int wheelCount;
    String model;

    Vehicle() {
        System.out.println("Creating an vehicle instance");
    }


    Vehicle(int wheelCount) {
        this.wheelCount = wheelCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start() {
        System.out.println("Vehicle is starting" + model + " " + wheelCount);
    }
}
