import java.util.*;
public class Age{
    public static void main(String[] args){
        System.out.print("Enter the value:");
        Scanner sc=new Scanner(System.in);
        int birth=sc.nextInt();
        int RN=sc.nextInt();
        System.out.print("Harry's age in "+RN+" is "+(RN-birth));
    }
}