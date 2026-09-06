class Person {
    private String name;
    private int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}
class Student extends Person {
    private int[] marks;
    Student(String name, int age, int[] marks) {
        super(name, age);
        this.marks = marks;
    }
    double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return (double) sum / marks.length;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString() + ", Average Marks = " + calculateAverage();
    }
}
class Instructor extends Person {
    private String subject;
    Instructor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Instructor: " + super.toString() + ", Subject = " + subject;
    }
}
class CampusRegistry {
    private Person[] persons;
    private int count;
    CampusRegistry(int size) {
        persons = new Person[size];
        count = 0;
    }
    void addPerson(Person person) {
        if (count < persons.length) {
            persons[count] = person;
            count++;
        }
        else {
            System.out.println("Registry is full.");
        }
    }
    void displayAllPersons() {
        for (int i = 0; i < count; i++) {
            System.out.println(persons[i]);
        }
    }
    void searchPerson(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (persons[i].getName().equals(name)) {
                System.out.println("Person Found:");
                found = true;
                break;
            }
          else{
            System.out.println("Person not found");
          }
        } 
    }
public class CampusManagementApp {
    public static void main(String[] args) {
        CampusRegistry registry = new CampusRegistry(10);
        Student s1 = new Student("Rahul", 19, new int[]{80, 75, 90} );
        Student s2 = new Student( "Priya", 20, new int[]{85, 90, 88} );
        Instructor i1 = new Instructor( "Mr Sharma" , 40, "Java" );
        registry.addPerson(s1);
        registry.addPerson(s2);
        registry.addPerson(i1);
        registry.displayAllPersons();
        registry.searchPerson("Priya");
    }
}
