import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the P :");
        int p=sc.nextInt();

        System.out.println("Enter the R :");
        int r= sc.nextInt();

        System.out.println("Enter the T :");
        int t= sc.nextInt();

        int SI=( p*r*t) /100;
        System.out.println("Simple Interest: "+SI);
    }
    

    
}
