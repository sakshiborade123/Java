import java.util.Scanner;
public class LoanCalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        for( ; ;){
            System.out.println("\n *****Welcome********\n");
            System.out.println("Amount : ");
            double amount= sc.nextDouble();
            if(amount<1000 || amount>1000000){
                System.out.println("\n Invalid Amount\n");
                continue;
            }
            System.out.println("Rate of Interest (P.M): ");
            double Interest= sc.nextDouble();
            if(Interest <1 ||Interest>30){
                System.out.println("\n Invalid Interest \n");
                continue;
            }
            System.out.println("Loan Tenure (months) : ");
            int tenure = sc.nextInt();
            if(tenure<3 || tenure>36){
                System.out.println("\n Invalid Tenure \n");
                continue;
            }
            double permonths= (amount/100)*Interest;
            double totalInterestAmount= permonths+tenure;
            double emi= (amount+ totalInterestAmount)/tenure;
            double totalAmount= amount+totalInterestAmount;
            System.out.println("\nMonthy Emi : "+emi);
            System.out.println("\n Principal Amount: "+amount);
            System.out.println("Total Interest: "+totalInterestAmount);

            System.out.println("Total Amount: "+totalAmount);
        }
    }
    
}
