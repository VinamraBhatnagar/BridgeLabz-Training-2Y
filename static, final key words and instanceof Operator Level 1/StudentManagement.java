class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    private String name;
    private String grade;
    private final int rollNumber;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("----------------------------");
        } else {
            System.out.println("Not a valid Student object.");
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "A");
        Student s2 = new Student(102, "Bob", "B");
        Student s3 = new Student(103, "Charlie", "A+");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        Student.displayTotalStudents();
    }
}
