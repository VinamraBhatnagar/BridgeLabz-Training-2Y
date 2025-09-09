package core_java.arrays.level2;
/*
Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
 */
import java.util.Scanner;

public class prog9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array: rows = students, columns = subjects (0: Physics, 1: Chemistry, 2: Maths)
        int[][] marks = new int[n][3];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double percentage = total / 3.0;
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else if (percentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + (i + 1) + " - Percentage: " + percentage + "%, Grade: " + grade);
        }
        sc.close();
    }
}
