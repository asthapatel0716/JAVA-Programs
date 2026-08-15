import java.util.Scanner;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (!isValidChoice(choice)) {
                System.out.println("Invalid menu choice.");
                continue;
            }
            if (choice == 0) {
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            if (choice == 4 && num2 == 0) {
                System.out.println("Cannot divide by zero.");
                continue;
            }
            double result = calculate(choice, num1, num2);
            System.out.println("Result: " + result);
        } while (choice != 0);
        sc.close();
    }
}
