package objectclass;

class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " : " + price;
    }
}

public class Object {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenevo Yoga";
        obj.price = 19000;

        System.out.println(obj);
    }
}
