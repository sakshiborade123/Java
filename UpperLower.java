import java.util.Scanner;
public class UpperLower {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Character");
        char ch= sc.next().charAt(0);

        String str= (ch>='A' && ch<='Z')?(ch+"IS AN UPPER CASE"):(ch+"IS LOWER CASE");

        System.out.println(str);

    }
    
}
