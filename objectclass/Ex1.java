package objectclass;

class Veh {
    final int gears = 4;

    final void accelerate() {
        System.out.println("Acceslarate from classs Veh");
    }
}

// class Veh1 extends Veh {
//     void accelerate() { // can not overridden bc in parent class that method already present with keyword final that can not be overridden
//         System.out.println("From class veh1");
//     }
// }

public class Ex1 {
    public static void main(String[] args) {
        Veh obj = new Veh();
        System.out.println(obj.gears);
    }
}
