public class P1 {
    public static void main(String[] args) {
        // int age[]; // declaration
        // age = new int[5]; // allocation (memory)

        // int age[] = new int[5];

        // age[0] = 5;
        // age[3] = 16;

        // System.out.println(age[0]);
        // System.out.println(age[3]);
        // System.out.println(age[2]);
        
        // System.out.println(age.length);

        // int marks[] = {98,12,45,12,65};
        // System.out.println(marks[4]);

        String names[] = {"Ram", "Harish", "Mohan", "Rajesh", "Komal"};

        // for(int i = 0; i < names.length; i++) {
        //     System.out.println("Name is: "+ names[i]);
        // }

        for(String name: names) {
            System.out.println("For each: " + name);
        }
    }
}
