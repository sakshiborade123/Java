import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args){
        Scanner sc=  new Scanner (System.in);

        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);

        String op =((ch >='A' && ch <='Z')|| (ch>='a' && ch<='z'))? (ch+ "IS AN CHARACTER "):( ch+ " IS NOT CHARACTER");

        System.out.println(op);
    }
    
}
