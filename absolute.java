import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int abs = (num < 0) ? -num : num;

        System.out.println(abs);
        sc.close();
    }
}
