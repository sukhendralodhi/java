public class SmallNumber {
    public static void main(String[] args) {
        int nums[] = { 23, 12, 6, 7, 15, 3, 2, 56 };

        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
