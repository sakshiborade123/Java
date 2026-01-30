import java.util.Scanner;
public class FeetToMeter {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the NUmber: ");

        double feet = sc.nextDouble();
        double meters= 0.305 *feet;

        System.out.println("Value in Meter: "+meters);
    }
    
}
