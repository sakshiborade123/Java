import java.util.Scanner;
public class AlphaDigitNot {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value :");
        char ch =sc.next().charAt(0);

        String s= ((ch>='A' && ch<='Z')|| (ch >='a'&& ch<= 'b'))?  (ch+"IS ALPHABET"):
         (ch>='0' && ch<= '9')? (ch+ "IS AN DIGIT"): (ch+" IS SPECIAL Character");

         System.out.println(s);
                  
    }
    
}
