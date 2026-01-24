public class MethodExample {
    static double calculateFinalSalary(double salary) {
        if (salary >= 20000) {
            return salary + salary * 0.10;
        } else {
            return salary + salary * 0.05;
        }
    }

    public static void main(String[] args) {
        double finalSalary = calculateFinalSalary(25000);
        System.out.println(finalSalary);
    }
}
