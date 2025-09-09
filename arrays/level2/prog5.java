package core_java.arrays.level2;
/*Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order 
 */
public class prog5 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
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

        // Displaying the digits in reverse order
        System.out.println("Reversed number:");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}
