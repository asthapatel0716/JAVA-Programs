public class StringBuilderToolkit {
    static String reverse(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
    static String repeat(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
    static String joinWords(String[] words, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
    static String removeCharacterAt(String text, int index) {
        StringBuilder sb = new StringBuilder(text);
        sb.deleteCharAt(index);
        return sb.toString();
    }
    static String replaceCharacterAt(String text, int index, char replacement) {
        StringBuilder sb = new StringBuilder(text);
        sb.setCharAt(index, replacement);
        return sb.toString();
    }
    static String buildNumberList(int[] items) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append(items[i]);
            if (i < items.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        System.out.println(repeat("Java ", 3));
        String[] words = {"Java", "Python", "C++"};
        System.out.println(joinWords(words));
        System.out.println(removeCharacterAt("Hello", 1));
        System.out.println(replaceCharacterAt("Hello", 1, 'a'));
        int[] numbers = {10, 20, 30, 40};
        System.out.println(buildNumberList(numbers));
    }
}
