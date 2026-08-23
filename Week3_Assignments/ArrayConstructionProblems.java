import java.util.Arrays;
public class ArrayConstructionProblems {
    // LC 2011: Final Value After Performing Operations
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
    // LC 1920: Build Array from Permutation
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    // LC 1929: Concatenation of Array
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
    // LC 1480: Running Sum of 1D Array
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums1)));
        int[] nums2 = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums2)));
        int[] nums3 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums3)));
    }
}
