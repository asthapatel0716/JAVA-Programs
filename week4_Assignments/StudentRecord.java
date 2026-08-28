class Student {
    private String name, studentId;
    private int mark;
    public Student(String name, String studentId, int mark) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }
        if (studentId == null || studentId.isBlank()) {
            throw new IllegalArgumentException("Student ID cannot be blank");
        }
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid marks");
        }
        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
    }
    public String getName() {
        return name;
    }
    public String getStudentId() {
        return studentId;
    }
    public int getMark() {
        return mark;
    }
    public boolean setMark(int newMark) {
        if (newMark < 0 || newMark > 100) {
            return false;
        }
        mark = newMark;
        return true;
    }
    public boolean hasPassed() {
        return mark >= 50;
    }
    public String getClassification() {
        if (mark >= 80) {
            return "Distinction";
        } else if (mark >= 60) {
            return "First Class";
        } else if (mark >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    @Override
    public String toString() {
        return "Student{name= " + name + ", studentId=" + studentId + ", mark=" + mark + ", classification=" + getClassification() + "}"; 
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Astha", "101", 90);
        Student s2 = new Student("Priya", "102", 50);
        Student s3 = new Student("Ayushi", "103", 89);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.setMark(105));
        System.out.println(s1.getMark());
        System.out.println(s1.setMark(60));
        System.out.println(s1);
    }
}
