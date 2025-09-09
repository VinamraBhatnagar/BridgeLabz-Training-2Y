package core_java.arrays.level2;
/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
<18.5 => Underweight
18.5 to 24.9 => Normal
25.0 to 39.9 => Overweight
>=40.0 => Obese
*/
public class prog6 {
                            
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];

        // Taking input for weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) {
                weightStatuses[i] = "Normal";
            } else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

        // Displaying the results
        System.out.println("\nHeight (m)\tWeight (kg)\tBMI\t\tWeight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n", heights[i], weights[i], bmis[i], weightStatuses[i]);
        }

        scanner.close();
    }
}
