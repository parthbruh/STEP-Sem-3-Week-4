import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        if (n > 0) {
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
        }
        
        System.out.print("Enter the number of positions to rotate (k): ");
        int k = scanner.nextInt();
        
        int[] result = rotateArray(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(result));
        
        scanner.close();
    }

    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) return nums;
        
        k = k % nums.length;
        int[] newArray = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }
        
        return newArray;
    }
}