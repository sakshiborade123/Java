import java.util.Scanner;
public class SpecialCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Value or Character:");

        char ch=sc.next().charAt(0);

        String st= ((ch>='A' && ch<='Z' )||(ch>='a' && ch<='z')|| (ch>='0' && ch<='9'))? (ch+ "IS NOT A SPECIAL CHARACTER:"): (ch+"IS $ SPECIAL CHARACTER");

        System.out.println(st);
    }
    
}
