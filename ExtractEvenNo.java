import java.util.Scanner;
public class ExtractEvenNo {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        while(num>0){

            int last=num%10;
           // System.out.println(last);
            if(last%2==0){
                System.out.println("Even No"+ last);
            }
        
            num= num/10;
            
            
            
        }
        
    }
    
}
