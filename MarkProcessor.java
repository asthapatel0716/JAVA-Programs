public class MarksProcessor {
    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }
    public static double calculateAverage(int sum, int count) {
        return (double) sum / count;
    }
    public static void printResults(int count, int sum, double average,
                                    int highest, int passes, int failures) {
        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of failures: " + failures);
    }
}
