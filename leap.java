import java.util.Scanner;

public class leap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        String res =
                (year % 400 == 0) ? ("LEAP YEAR") :
                (year % 100 == 0) ? ("NOT A LEAP YEAR") :
                (year % 4 == 0)   ? ("LEAP YEAR") :
                                   ("NOT A LEAP YEAR");

        System.out.println(res);
        
    }
}
