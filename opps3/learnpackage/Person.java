package opps3.learnpackage;

public class Person {
    public static int count = 0;
    int age;
    String name;

    public Person() {
        count++;
        System.out.println(this.count);
    }
}
