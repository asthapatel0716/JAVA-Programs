public class MenuCalculator {
    public static void printMenu() {
        System.out.println("\n1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");
    }
    public static boolean isValidChoice(int choice) {
        return choice >= 0 && choice <= 4;
    }
    public static double calculate(int choice, double num1, double num2) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
            default:
                return 0;
        }
    }
}
