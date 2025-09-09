package core_java.arrays.level1;
/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
 */
public class prog9 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Taking user input for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Taking user input for the 2D array (matrix)
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Creating a 1D array to copy elements from the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copying elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Displaying the 1D array
        System.out.println("The elements in the 1D array are:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
