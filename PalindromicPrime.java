import java.util.Scanner;

public class PalindromicPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        boolean isPrime = true;

        if (temp <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= temp / 2; i++) {
                if (temp % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (rev == temp && isPrime) {
            System.out.println("Palindromic Prime");
        } else {
            System.out.println("Not Palindromic Prime");
        }
    }
}
