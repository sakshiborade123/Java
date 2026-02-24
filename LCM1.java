import java.util.Scanner;

public class LCM1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st No: ");
        int n1= sc.nextInt();

        System.out.println("Enter the 2nd No:");
        int n2= sc.nextInt();

        int i= 1;
        int large= n1>n2?n1:n2;

        while(true){
            if((large*i)%n1==0 && (large*i)%n2==0){
                System.out.println("LCM OF "+n1+" & "+n2+" = "+large);
                break;
            }
            i++;
        }

    }
    
}
