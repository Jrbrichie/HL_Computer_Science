package Unit5_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = in.nextInt();
            nums[i] = num;
            sum += num;
        }

        System.out.println("\nYour array: " + Arrays.toString(nums));
        System.out.println("Average: " + ((double)sum / nums.length));
    }


}
