import java.util.Scanner;

public class Parindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber: ");
        int num= sc.nextInt();
        int rev=0;
        int temp= num;
        while(temp!=0){
            int last= temp%10;
            rev= rev*10+last;
            num=temp/10;


        }
        if(num==rev){
            System.out.println("Its Palindrome");
        }
        else{
            System.out.println("Its Not A Palindrome");
        }

    }
    
}
