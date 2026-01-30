import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of cicle : ");

        int radius= sc.nextInt();
        final double PI= 22/7.0;
        final double AREA= PI *radius *radius;
        final double PERIMETER= 2*PI*radius;

        System.out.println("radius :" +radius +"cm");
        System.out.printf("Area of circle :%.3f  cm^2  %n", AREA);

        System.out.printf("Perimeter  of circle : %3f cm " ,PERIMETER);
    }
    
}
