import java.util.Scanner;
public class countevenodd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num= sc.nextInt();
        int evencount=0;
        int oddcount=0;
        while(num>0){
            int last= num%10;
            if(last%2==0){
                System.out.println("Its Even");
                evencount++;
            }
            else{
                System.out.println("Its Odd");
                oddcount++;
            }
            num=num/10;
            

          
        }
        System.out.println("Even Count: "+evencount);
        System.out.println("Odd Count: "+oddcount);
    }
    
}
