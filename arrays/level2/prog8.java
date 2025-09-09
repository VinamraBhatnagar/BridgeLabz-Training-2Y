package core_java.arrays.level2;
/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
Grade
A
B
C
D
E
R
Remarks
(Level 4, above agency-normalized standards)
(Level 3, at agency-normalized standards)
(Level 2, below, but approaching agency-normalized standards)
(Level 1, well below agency-normalized standards)
(Level 1- , too below agency-normalized standards)
(Remedial standards)
Marks
80% and above
70-79%
60-69%
50-59%
40-49%
39% and below
Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student
 */
public class prog8 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[][] marks = new int[numberOfStudents][3]; // 3 subjects: physics, chemistry, maths
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Taking input for marks
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                int mark = scanner.nextInt();
                if (mark < 0) {
                    System.out.println("Invalid input. Please enter positive marks.");
                    j--; // Decrement index to repeat this iteration
                    continue;
                }
                marks[i][j] = mark;
                scanner.close();
            }
        }

        // Calculating percentages and grades
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Displaying results
        System.out.println("Student Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student %d: Marks: [%d, %d, %d], Percentage: %.2f%%, Grade: %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}