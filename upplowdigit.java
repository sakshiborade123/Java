import java. util.Scanner;

public class upplowdigit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the Value: ");

        char ch= sc.next().charAt(0);

        String str= ((ch>='A' && ch<='Z')?( ch+ "Upper Case"):
                     (ch>='a' && ch<='z')? (ch+"Lower case"):
                     (ch >='0' && ch<='9')?(ch+"DIGIT"):(ch+"Special Character"));

       System.out.println(str);
    }
    
}
