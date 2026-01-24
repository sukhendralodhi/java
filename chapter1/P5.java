public class P5 {
    public static void main(String[] args) {

        double salary = 25000;

        if (salary >= 20000) {
            salary += salary * 0.10; // 10% bonus
        } else {
            salary += salary * 0.05; // 5% bonus
        }

        System.out.println("Final salary: " + salary);
    }
}
