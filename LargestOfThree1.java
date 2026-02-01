import java.util.Scanner;
public class LargestOfThree1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for A:");
        int a=sc.nextInt();

        System.out.println("Enter the value for B :");
        int b= sc.nextInt();

        System.out.println("Enter the value for C: ");
        int c= sc.nextInt();

        if(a>b && a>c){
            System.out.println("A IS GRETAER THAN B AND C");
        }
        else if(b>a && b>c){
            System.out.println("B IS GREATER THAN A AND C");
        }
        else if(c>a && c>b){
            System.out.println("C IS GREATER THAN A AND B");
        }
        else{
            System.out.println("A AND B AND C HAVE SAME VALUE");
        }
    }
   

    
}
