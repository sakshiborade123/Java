import java.util.Scanner;

public class Alphabet2 {
    public static void main(String[]args){
    
    Scanner sc=  new Scanner (System.in);
    System.out.println("Enter the Character: ");

    char ch=  sc.next().charAt(0);
    String op = ((ch>= 65 &&  ch<= 90)|| (ch>=97 && ch<= 122))? 
    ((ch>=65&& ch<=90)? (ch+"Is Upper Case"): (ch+"is An Lower case")):
    ((ch>= 48 && ch<=57)?(ch+"Is digit"):(ch+ "Is special Characater"));

    System.out.println(op);
}
}
