import java.util.Arrays;
public class ArrayTransformations {
    static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;
        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }
    }
    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }
        return result;
    }
    static int removeValue(int[] values, int target) {
        int newLength = 0;
        for (int value : values) {
            if (value != target) {
                values[newLength] = value;
                newLength++;
            }
        }
        return newLength;
    }
    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        if (values.length == 0) {
            return result;
        }
        result[0] = values[0];
        for (int i = 1; i < values.length; i++) {
            result[i] = result[i - 1] + values[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(values));
        reverseInPlace(values);
        System.out.println("After reverse: " + Arrays.toString(values));
        int[] copy = reversedCopy(values);
        System.out.println("Reversed copy: " + Arrays.toString(copy));
        int[] numbers = {2, 5, 2, 8, 2};
        int newLength = removeValue(numbers, 2);
        System.out.println("After removing 2: "
                + Arrays.toString(Arrays.copyOf(numbers, newLength)));
        int[] sum = runningSum(new int[]{1, 2, 3, 4});
        System.out.println("Running sum: " + Arrays.toString(sum));
    }
}
