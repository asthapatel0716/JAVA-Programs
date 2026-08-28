class Course {
    private String courseCode, title;
    private int capacity, enrolledCount;
    public Course(String courseCode, String title, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        this.enrolledCount = 0;
    }
    public boolean enroll() {
        if (enrolledCount >= capacity) {
            return false;
        }
        enrolledCount++;
        return true;
    }
    public boolean withdraw() {
        if (enrolledCount <= 0) {
            return false;
        }
        enrolledCount--;
        return true;
    }
    public boolean isFull() {
        return enrolledCount == capacity;
    }
    public int getAvailableSeats() {
        return capacity - enrolledCount;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public String getTitle() {
        return title;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getEnrolledCount() {
        return enrolledCount;
    }
    @Override
    public String toString() {
        return "Course{courseCode=" + courseCode + ", title=" + title + ", capacity=" + capacity + ", enrolledCount=" + enrolledCount + ", availableSeats=" + getAvailableSeats() + ", full=" + isFull() + "}";
    }
}
public class CourseEnrollment {
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Java Programming", 3);
        System.out.println(c1);
        System.out.println(c1.enroll());
        System.out.println(c1.enroll());
        System.out.println(c1);
        System.out.println(c1.getAvailableSeats());
        System.out.println(c1.enroll());
        System.out.println(c1.isFull());
        System.out.println(c1.enroll());
        System.out.println(c1.withdraw());
    }
}
