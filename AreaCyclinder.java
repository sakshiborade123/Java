import java.util.Scanner;
public class AreaCyclinder {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius:");

        int radius= sc.nextInt();
        double area= 3.14 * radius *radius;

        System.out.println("THE RADIUS : "+area);

        System.out.println("Enter the height : ");
        int height=sc.nextInt();

       double  volume= area* height;
       System.out.println("THE VOLUME : "+volume);


    }
}
    

