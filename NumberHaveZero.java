import java.util.Scanner;
public class NumberHaveZero {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num= sc.nextInt();
        
        while(num!=0){
           
            if( num%10==0){
                System.out.println("Have Zero");
                break;
            }
            num=num/10;
           
        }
        System.out.println("Not Zero");
    }
    
}
