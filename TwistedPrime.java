import java.util.Scanner;

public class TwistedPrime {
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

        boolean isPrime1 = true;
        boolean isPrime2 = true;

        if (temp <= 1) {
            isPrime1 = false;
        } else {
            for (int i = 2; i <= temp / 2; i++) {
                if (temp % i == 0) {
                    isPrime1 = false;
                    break;
                }
            }
        }

        if (rev <= 1) {
            isPrime2 = false;
        } else {
            for (int i = 2; i <= rev / 2; i++) {
                if (rev % i == 0) {
                    isPrime2 = false;
                    break;
                }
            }
        }

        if (isPrime1 && isPrime2) {
            System.out.println("Twisted Prime");
        } else {
            System.out.println("Not Twisted Prime");
        }
    }
}
