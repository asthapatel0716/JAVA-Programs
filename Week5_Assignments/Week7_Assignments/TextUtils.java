package college.util;
public class TextUtils {
    private static int count = 0;
    private TextUtils() {
    }
    public static String normalizeName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid input");
        }
        name = name.trim();
        StringBuilder cleaned = new StringBuilder();
        boolean previousSpace = false;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == ' ') {
                if (!previousSpace) {
                    cleaned.append(ch);
                    previousSpace = true;
                }
            } else {
                cleaned.append(ch);
                previousSpace = false;
            }
        }
        StringBuilder result = new StringBuilder();
        boolean newWord = true;
        for (int i = 0; i < cleaned.length(); i++) {
            char ch = cleaned.charAt(i);
            if (ch == ' ') {
                result.append(ch);
                newWord = true;
            } else {
                if (newWord) {
                    result.append(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            }
        }
        count++;
        return result.toString();
    }
    public static int getCount() {
        return count;
    }
}
import college.util.TextUtils;
public class Main {
    public static void main(String[] args) {
        System.out.println(TextUtils.normalizeName("  asha   nair "));
        System.out.println(TextUtils.normalizeName("DAVID"));
        System.out.println( TextUtils.getCount());
    }
}
