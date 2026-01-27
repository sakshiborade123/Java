import java.util.Scanner;

public class postiv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the Value:");

        String res = (num > 0) ? "POSITIVE" :
                     (num < 0) ? "NEGATIVE" :
                                 "ZERO";

        System.out.println(res);
       
    }
}
