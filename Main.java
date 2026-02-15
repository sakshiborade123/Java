import java.util.Scanner;

public class Main {
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum_of_digits = 0;
        int numDigits = String.valueOf(n).length(); 

        while (n != 0) {
            int digit = n % 10; 
            sum_of_digits += Math.pow(digit, numDigits); 
            n /= 10;
        }

        return sum_of_digits == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }

        sc.close();
    }
}
