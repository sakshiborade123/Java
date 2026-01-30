import java.util.Scanner;
public class AreaReactangle {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Height: ");

        int height= sc.nextInt();
        System.out.println("Enter the Width:  ");

        int width= sc.nextInt();

        int AreaReactangle= height * width;
        System.out.println(AreaReactangle);
    }
    
}
