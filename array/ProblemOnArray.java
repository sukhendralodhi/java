public class ProblemOnArray {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = { 23, 12, 6, 7, 15, 3, 2, 56 };

        // using for each loop
        // for (int num: nums) {
        //     // System.out.println(num);
        //     sum += num;
        // }
        // System.out.println(sum);


        // using for loop
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
