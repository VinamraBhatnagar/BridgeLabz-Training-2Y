package core_java.arrays.level1;
/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
 */
public class prog6 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        // Taking user input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in meters: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculating mean height
        double meanHeight = sum / heights.length;

        // Displaying the mean height
        System.out.printf("The mean height of the football team is: %.2f meters%n", meanHeight);

        scanner.close();
    }
}
