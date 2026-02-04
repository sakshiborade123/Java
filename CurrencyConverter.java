import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //infinite loop

        for( ; ;){
            System.out.println("\n WELCOME");
            System.out.println("*******Currency Converter***********\n");
            System.out.println("Enter the Amount (INR)  :");
            double Amount= sc.nextDouble();

            System.out.println("1.USD \n 2.EUR \n 3.KWD \n4.GBP \n5.AUD \n6.CAD \n7.BRL \n8.KRW \n 9.IDR \n10. LKR");
            System.out.println("Enter your response: ");
            String resp= sc.next().toUpperCase();

            boolean assump= true;

            double convertedAmount= 0;

            if(resp.equals("USD")){
                convertedAmount= Amount/90.21;

            }
            else if(resp.equals("EUR")){
                convertedAmount=Amount/ 106.53;
            }
            else if(resp.equals("KWD")){
                convertedAmount= Amount /293.61;
            }
            else if (resp.equals("AUD")){
                convertedAmount= Amount/63.33;

            }
            else if(resp.equals("CAD")){
                convertedAmount= Amount/65.9;
            }
            else if(resp.equals("BRL")){
                convertedAmount= Amount/17.11;
            }
            else if (resp.equals("KRW")){
                convertedAmount= Amount/0.06;
            }
            else if(resp.equals("IDR")){
                convertedAmount= Amount/0.005376997214594072;
            }
            else if(resp.equals("LKR")){
                convertedAmount= Amount/0.29;
            }
            else{
                assump= false;
                System.out.println("\n INVALID CURR\n");
            }
            if(assump)
            System.out.printf("%n%20.2f INR  = %.2f %s %n",Amount,convertedAmount,resp);
        }
    }
    
}
