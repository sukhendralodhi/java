class Student {
    String name;
    int rollNumber;
    double marks;
}

public class Demo5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Mohan";
        s1.rollNumber = 1;
        s1.marks = 99;

        Student s2 = new Student();
        s2.name = "Jeet";
        s2.rollNumber = 2;
        s2.marks = 78;

        Student s3 = new Student();
        s3.name = "Komal";
        s3.rollNumber = 3;
        s3.marks = 56;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // System.out.println(students);

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " " + students[i].rollNumber + " " + students[i].marks);
        // }

        // enhanced for loop 

        for (Student stud : students) {
            System.out.println(stud.name + ":" + stud.marks + ":");
        }

    }
}
