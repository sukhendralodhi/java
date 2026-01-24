
class Computer {
    public void playMusic() {
        System.out.println("Playing music!");
    }

    public String getMePan(int cost) {
        if(cost < 10) {
return "Pen";
        } else {
            return "Insufficient cost";
        }
        
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String cost = obj.getMePan(10);
        System.out.println(cost);
    }
}
