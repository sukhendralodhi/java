package opps4;

interface Animal {
    public void eats();
}

interface Human {
    public void walk();
}

class Monkey implements Animal, Human {
    public void eats() {
        System.out.println("Monkey is eating..");
    }

    public void walk() {
        System.out.println("Human can walk..");
    }
}

public class LearnInterface {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.walk();
    }
}
