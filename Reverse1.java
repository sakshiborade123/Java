import java.util.Scanner;
public class Reverse1 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Number: ");
        int num= sc.nextInt();
        String str= num+"";
        String rev= "";

        for(int i= 0; i<str.length();i++){
            rev= str.charAt(i)+rev;

        }
        System.out.print(rev);
    }
    
}
