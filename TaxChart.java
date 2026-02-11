import java.util.Scanner;
public class TaxChart {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Salary: ");
        int n= sc.nextInt();
        System.out.println("Enter the Age: ");
        int age= sc.nextInt();

        if(n<=250000||age<=80||age>80){
            System.out.println("You have to pay 0% Tax");
        }
        else if(n<=250000 && n>=300000 ||age<=60){
            System.out.println("You have to pay 5% Tax");
        } 
        else if()
    }
    
}
