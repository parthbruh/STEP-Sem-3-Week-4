import java.util.Scanner;

public class DuplicateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        if (n > 0) {
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
        }
        
        boolean hasDuplicate = containsDuplicate(nums);
        System.out.println("Contains Duplicate: " + hasDuplicate);
        
        scanner.close();
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}