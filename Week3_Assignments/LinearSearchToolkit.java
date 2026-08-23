public class LinearSearchToolkit {
    static boolean contains(int[] values, int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
    static int firstIndexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static int lastIndexOf(int[] values, int target) {
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static int countOccurrences(int[] values, int target) {
        int count = 0;
        for (int value : values) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] values = {4, 2, 7, 2, 9, 2};
        int target = 2;
        System.out.println("Contains: " + contains(values, target));
        System.out.println("First index: " + firstIndexOf(values, target));
        System.out.println("Last index: " + lastIndexOf(values, target));
        System.out.println("Count: " + countOccurrences(values, target));
    }
}
