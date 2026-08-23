public class BitMaskUtility {
    static boolean isBitSet(int number, int position) {
        int mask = 1 << position;
        return (number & mask) != 0;
    }
    static int setBit(int number, int position) {
        int mask = 1 << position;
        return number | mask;
    }
    static int clearBit(int number, int position) {
        int mask = 1 << position;
        return number & ~mask;
    }
    static int toggleBit(int number, int position) {
        int mask = 1 << position;
        return number ^ mask;
    }
    static String toBinary32(int number) {
        String binary = Integer.toBinaryString(number);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        return binary;
    }
    public static void main(String[] args) {
        int number = 10;
        int position = 1;
        System.out.println("Check Bit: " + isBitSet(number, position));
        System.out.println("Set Bit: " + setBit(number, position));
        System.out.println("Clear Bit: " + clearBit(number, position));
        System.out.println("Toggle Bit: " + toggleBit(number, position));
    }
}
