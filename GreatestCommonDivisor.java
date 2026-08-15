public class GreatestCommonDivisor {
    public static int gcd(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);
        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }
}
