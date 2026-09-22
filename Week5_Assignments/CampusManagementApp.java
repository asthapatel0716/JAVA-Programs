abstract class Person {
    private String name;
    private int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public abstract String getRole();
}
class Student extends Person {
    private int[] marks;
    Student(String name, int id, int[] marks) {
        super(name, id);
        this.marks = marks;
    }
    public int[] getMarks() {
        return marks;
    }
    @Override
    public String getRole() {
        return "Student";
    }
}
class Instructor extends Person {
    private String subject;
    Instructor(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    @Override
    public String getRole() {
        return "Instructor";
    }
}
public class CampusManagementApp {
    public static void main(String[] args) {
        Student s1 = new Student("Astha", 101, new int[]{85, 90, 88} );
        Student s2 = new Student( "Riya", 102, new int[]{78, 82, 80} );
        Student s3 = new Student( "Karan", 103, new int[]{92, 89, 95} );
        Instructor i1 = new Instructor( "Dr. Sharma", 201, "Java" );
        Instructor i2 = new Instructor( "Dr. Mehta", 202, "DBMS" );
    }
}
