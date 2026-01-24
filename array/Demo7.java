class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("inside static block");
    }

    public Mobile() {
        System.out.println("inside constructor");
    }

    public void show() {
        System.out.println(brand + ": " + price + " :" + name);
    }

}

public class Demo7 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1600;

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 7800;

        Mobile.name = "Smartphone";

        m1.show();
        m2.show();
    }
}
