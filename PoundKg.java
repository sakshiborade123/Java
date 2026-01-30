import java.util.Scanner;
public class PoundKg {
    public static void main(String[] args){
        //kg= 0.454 * pounds
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");

        double pounds= sc.nextInt();
        double kg= 0.454 *pounds;
        System.out.println(kg);
        
    }
    
}
