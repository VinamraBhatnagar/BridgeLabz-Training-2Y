package core_java.arrays.level1;
/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
 */
public class prog10 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Error: Please enter a positive integer greater than 0.");
            scanner.close();
            return;
        }

        String[] fizzBuzzArray = new String[number];

        // Generating FizzBuzz results
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i - 1] = "Buzz";
            } else {
                fizzBuzzArray[i - 1] = Integer.toString(i);
            }
        }

        // Displaying the results
        for (int i = 0; i < fizzBuzzArray.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzzArray[i]);
        }

        scanner.close();
    }
}
