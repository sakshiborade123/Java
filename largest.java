import java.util.Scanner;
public class largest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value a: ");
        int a= sc.nextInt();

        System.out.println("Enter the value b: ");
        int b= sc.nextInt();

        if(a>b){
            System.out.println("A IS GREATER THAN B");
        }
        else{
            System.out.println("B IS GREATER THAN A");
        }
    }
    
}
