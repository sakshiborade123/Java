import java.util.Scanner;
public class UpperLowerCase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the CHARACTER");

       char ch= sc.next().charAt(0);

       if(ch>='A' && ch <='Z'){
        System.out.println(ch+ " IS UPPER CASE");
       }
       else{
        System.out.println(ch+" IS LOWER CASE ");
       }
    }
    
}
