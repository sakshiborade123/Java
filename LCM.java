import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1 No: ");
        int n1= sc.nextInt();
        System.out.println("Enter the 2nd No: ");
        int n2= sc.nextInt();

        int largest= n1>n2?n1:n2;
        int i=1;
        while(true){
            if(largest%n1==0 && largest%n2==0){
                System.out.println(n1+" & "+n2+ "LCM  = "+largest);
                break;
            }
            largest++;
        }
    }
    
}
