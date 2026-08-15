import java.util.Scanner;
public class GradingSystem {
    public static String classifyMark(int mark) {
        if (mark < 0 || mark > 100) {
            return "Invalid mark";
        } else if (mark >= 80) {
            return "Distinction";
        } else if (mark >= 70) {
            return "Merit";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int mark = sc.nextInt();
        System.out.println(classifyMark(mark));
        sc.close();
    }
}
