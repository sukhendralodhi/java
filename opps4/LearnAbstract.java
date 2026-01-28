package opps4;

abstract class Vehicle {
    abstract void sayHello();
    abstract void brakes();
}

class Car extends Vehicle {

    @Override
    void sayHello() {
    }

    @Override
    void brakes() {
    }
    
}

public class LearnAbstract {
    // Vehicle obj = new Vehicle(); 
    // we can not able to create object of abstract class
}
