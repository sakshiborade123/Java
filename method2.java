import java.util.Scanner;
public class method2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();

        boolean ans1= isprime(num);
        if(ans1==true){
            int rev= reverse(num);

            boolean ans2= isprime(rev);

            if(ans2){
                System.out.println("Its is twisted prime no");
            }
            else{
                System.out.println("not a twisted prime no");
            }
        }
        else{
            System.out.println("Not a twisted prime");
        }
    }
    public static int reverse(int num){
        int rev= 0;

        while(num!=0){
            rev=rev*10 +(num%10);
            num/=10;
        }
        return rev;

    }
    public static boolean isprime(int num){
        int den=2;

        while(den<num){
            if(num%den==0){
                break;
            }
            den++;
        }
        if(num==den){
            return true;

        }
        else{
            return false;
        }
    }
    
}
