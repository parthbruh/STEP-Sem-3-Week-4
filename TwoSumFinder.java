import java.util.Scanner;
import java.util.Arrays;

public class TwoSumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        int[] result = twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
        
        scanner.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}