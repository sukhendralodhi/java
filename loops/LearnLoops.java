public class LearnLoops {
    public static void main(String[] args) {

        // for(int i = 0; i <= 100; i++) {
        // System.out.println("Hello World!");
        // }
        // for (int count = 0; count <= 10; count++) {
        // for (int i = 1; i <= 6; i++) {
        // System.out.print(i + " ");
        // }
        // System.out.println("printed: "+ count);
        // }

        // for(int i = 0; i < 18; i++) {
        // for(int j=0; j <= i; j++) {
        // System.out.print( " *");
        // }
        // System.out.println();
        // }

        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while (j < 5) {
                if (j == 3)
                    break outerLoop;
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }

    }
}