package opps3.package2;

import opps3.learnpackage.Teacher;

public class MainInPackage2 {

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        
        // Teacher obj =  new Teacher();
        // obj.show();
        // obj.degree = "PHD"; // can not access
        // System.out.println(obj.degree); // can not access

        printHello();
    }
    
}
