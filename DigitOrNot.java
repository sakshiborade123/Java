import java.util.Scanner;
public class DigitOrNot {
    public static void main(String[] args){
        Scanner sc=  new Scanner (System.in);

        System.out.println("Enter the Digits: ");

        int a =sc.nextInt();

        String di= ( a>= 0 && a<=9)?(a+ " Is An Digit "):(a+" Is not an Digit");
        System.out.println(di);
    }

    
}
