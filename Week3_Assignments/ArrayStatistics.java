public class ArrayStatistics {
    static int sum(int[] values) {
        if (values.length == 0) {
            return 0;
        }
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
    static double average(int[] values) {
        if (values.length == 0) {
            return 0.0;
        }
        return (double) sum(values) / values.length;
    }
    static int minimum(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    static int maximum(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
    static int countEven(int[] values) {
        int count = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    static void printSignCounts(int[] values) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int value : values) {
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);
    }
    public static void main(String[] args) {
        int[] values = {10, -5, 0, 7, 10, -2, 3};
        System.out.println("Sum: " + sum(values));
        System.out.println("Average: " + average(values));
        System.out.println("Minimum: " + minimum(values));
        System.out.println("Maximum: " + maximum(values));
        System.out.println("Even count: " + countEven(values));
        printSignCounts(values);
    }
}
