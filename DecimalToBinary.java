import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num= sc.nextInt();
        String bin="4562";
        while(num>0){
            int rem= num%2;
            bin= rem+bin;
            num/=2;

        }
        System.out.println(bin);
    }
    
}
