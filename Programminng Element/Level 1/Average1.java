import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        System.out.print("Enter the value:");
        Scanner sc=new Scanner(System.in);
        double Maths=sc.nextFloat();
        double Physics=sc.nextFloat();
        double Chemistry=sc.nextFloat();
        double Average01=(Maths+Physics+Chemistry)/3;
        System.out.print("Sam average mark in PCM is "+Average01);
    }
}
