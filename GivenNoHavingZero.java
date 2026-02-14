import java.util.Scanner;
public class GivenNoHavingZero {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        if(num==0){
                System.out.print("NO is Having zero");
                
        }
        while(num>0){
            
            if(num%10==0){
                System.out.println("Number is Contain Zero:");
                break;
            }

            num=num/10;
        }

    }
    
}
