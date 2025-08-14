import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println(2 * (length + width));
        sc.close();
    }
}
