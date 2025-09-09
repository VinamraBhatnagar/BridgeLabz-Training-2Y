package core_java.arrays.level2;
/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
 */
public class prog10 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer to find the frequency of each digit: ");
        int number = scanner.nextInt();

        // Counting digits
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }

        int[] digits = new int[digitCount];
        int index = 0;

        // Storing digits in the array
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int[] frequency = new int[10];

        // Finding frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // Displaying the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
