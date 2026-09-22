import college.util.TextUtils;
class InvalidStudentDataException extends Exception {
    public InvalidStudentDataException(String message) {
        super(message);
    }
}
class Student {
    private String name;
    private int mark;
    public Student(String name) {
        this.name = TextUtils.normalizeName(name);
    }
    public void setMark(int mark) throws InvalidStudentDataException {
        if (mark < 0 || mark > 100) {
            throw new InvalidStudentDataException(
                "Mark must be between 0 and 100."
            );
        }
        this.mark = mark;
    }
}
public class Week7Lab {
    public static void main(String[] args) {
        Student student = new Student("  asha   nair ");
        String[] marks = {"85", "abc", "120"};
        for (String text : marks) {
            try {
                int mark = Integer.parseInt(text);
                student.setMark(mark);
                System.out.println(mark);
            } catch (NumberFormatException e) {
                System.out.println( "Invalid input: Mark must be a number." );
            } catch (InvalidStudentDataException e) {
                System.out.println( "Invalid mark: " + e.getMessage() );
            } finally {
                System.out.println("Validation attempt complete");
            }
        }
    }
}
