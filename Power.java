import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");

        double num=  sc.nextDouble();
        System.out.println("Enter a Power:");
        double power= sc.nextDouble();

        if(power<0){
            power*=-1;
            num= 1/num;
        }
        double op= 1;
        for(int i= 1;i<=power;i++){
            op=op*num;
        }
        System.out.println("User Defined: "+op);
        System.out.println("Built in :"+Math.pow(num,power));
    }
    
}
