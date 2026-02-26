import java.util.Scanner;
public class DecimalToBinaryNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int num= 10;
        int bin= 0;
        int pos=1;

        while(num>0){
            int rem= num %2;
            bin= bin+(rem*pos);
            pos*=10;
            num/=2;
        }
        System.out.println(bin);
    }
    
}
