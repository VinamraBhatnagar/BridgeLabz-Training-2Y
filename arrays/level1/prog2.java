package core_java.arrays.level1;
/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
 */
public class prog2 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input for numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking each number
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is a positive even number.");
                } else {
                    System.out.println(number + " is a positive odd number.");
                }
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing first and last elements
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[numbers.length - 1] + ").");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is equal to the last element (" + numbers[numbers.length - 1] + ").");
        }

        scanner.close();
    }
}
