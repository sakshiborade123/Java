import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st No: ");
        int n1= sc.nextInt();

        System.out.println("Enter the 2nd No: ");
        int n2= sc.nextInt();

        int small= n1<n2?n1:n2;
        while(true){
            if(n1%small==0 && n2% small==0){
                System.out.println("HCF OF "+n1+ " & "+n2+ " = "+small);
                break;
            }
            small--;
        }
    }
    
}
