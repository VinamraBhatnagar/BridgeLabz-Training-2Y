package core_java.arrays.level1;
/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
 */
public class prog5 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer to print its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4]; // For 6, 7, 8, and 9

        // Generating multiplication table from 6 to 9
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        // Displaying the multiplication table
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}
