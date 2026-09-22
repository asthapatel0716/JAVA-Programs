class Person {
    void describeRole() {
        System.out.println("I am a person.");
    }
}
class Student extends Person {
    @Override
    void describeRole() {
        System.out.println("I am a student.");
    }
    void submitAssignment() {
        System.out.println("Student is submitting an assignment.");
    }
}
class Instructor extends Person {
    @Override
    void describeRole() {
        System.out.println("I am an instructor.");
    }
    void conductClass() {
        System.out.println("Instructor is conducting a class.");
    }
}
public class PersonHierarchy {
    public static void main(String[] args) {
        Person[] people = { new Student(), new Instructor(), new Student() };
        for (Person p : people) {
            p.describeRole();
        }
        for (Person p : people) {
            if (p instanceof Student student) {
                student.submitAssignment();
            }
            if (p instanceof Instructor instructor) {
                instructor.conductClass();
            }
        }
    }
}
