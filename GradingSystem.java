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
}
