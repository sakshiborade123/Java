import java.util.Scanner;

public class positiveNegative{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String res = (num >= 0) ? "POSITIVE" : "NEGATIVE";

        System.out.println(res);
        sc.close();
    }
}
