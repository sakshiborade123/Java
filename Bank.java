import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
public class Bank {
    static String name;
        static String address;
        static long contact;
        static long adhar;
        static double balance;
        static String pancard;
        static int pin;
        static LocalDateTime a;//null
        static ArrayList<String> transaction= new ArrayList<String>();
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        welcomeloop:
        for( ; ;){
            System.out.println("\n********Welcome**********");  
            System.out.println("******Laxmi Chit Fund*******");
            System.out.println("1. Create Account \n 2.Login");
            System.out.println("Enter your Resp: ");
            int resp= sc.nextInt();

            switch(resp){
                case 1:{
                if(name!= null){
                    System.out.println("\n Account Already Exist\n");
                    continue;
                }
                System.out.println("\n Account creation page \n");
                System.out.print("Name: ");

                name= new Scanner(System.in).nextLine();
                System.out.println("Address: ");
                address= new Scanner(System.in).nextLine();

                System.out.println("Contact:");
                contact= new Scanner(System.in).nextLong();

                System.out.println("Adhar :");
                adhar= new Scanner(System.in).nextLong();

                System.out.println("PanCard: ");
                pancard= new Scanner(System.in).next();

                System.out.println("Enter the Amount: ");
                balance= new Scanner(System.in).nextDouble();
                a= LocalDateTime.now();
                transaction.add("Deposit (Creation): "+balance+ "rs."+(a.getHour()) %12+": "+a.getMinute()+":"+a.getSecond());
                transaction.add("Deposit (Creation) : "+balance);
                System.out.println("Pin: ");
                pin= new Scanner(System.in).nextInt();
                
                System.out.println("*****Acount Created Successfully\n");
                break;
            }
            case 2:{
                if(name==null){
                    System.out.println("\n Create your account first \n");
                    continue;
                }
                System.out.println("\n Login Module \n");
                System.out.println("Contact: ");
                
                long UserContact= new Scanner(System.in).nextLong();
                System.out.println("Pin: ");

                long UserPin= new Scanner(System.in).nextInt();

                if(contact==UserContact && pin==UserPin){
                    System.out.println("\n Login Successfully");

                    features:
                    for( ; ;){
                        System.out.println("\n ****Feactures*****\n");
                        System.out.println("1.Deposit \n 2.Withdraw \n3.Check Balance \n4. Transaction \n5.LogOut");
                        System.out.println("Enter your option:");
                        int opt= sc.nextInt();
                        switch(opt){
                            case 1: {
                                System.out.println("\n Deposit Amount module\n");
                                System.out.println("Enter deposit amount:");
                                double deptamt= new Scanner(System.in).nextDouble();
                                balance+=deptamt;
                                transaction.add("Deposit: "+deptamt);
                                System.out.println("\n Amount deposited Successfully\n");
                                break;
                            }
                            case 2:{
                                System.out.println("\n Withdraw amount module\n");
                                System.out.println("Enter an amount");
                                double wrdwammout= new Scanner(System.in).nextDouble();
                                System.out.println("Enter your pin: ");
                                int pin2= new Scanner(System.in).nextInt();
                                if(pin2==pin){
                                    if(wrdwammout<=balance){
                                        balance-=wrdwammout;
                                        transaction.add("Withdraw: "+wrdwammout);
                                        System.out.println("\n Amount debited successfully\n");
                                    }
                                    else{
                                        System.out.println("\n insufficient funds\n");
                                        
                                    }
                                }
                                else{
                                    System.out.println("\n Invalid Pin \n");
                                }
                                break;

                            }
                            case 3:{
                                System.out.println("\n Check balance module \n");
                                System.out.println("Enter Your Pin :");
                                int pin2= new Scanner(System.in).nextInt();
                                if(pin2==pin){
                                    System.out.println("Your Account balance is : "+balance+"rs");

                                }
                                else{
                                    System.out.println("\nInvalid Pin \n");
                                }
                                break;
                            }
                             case 4:{
                                System.out.println("\n****Transaction ****\n");
                                for(String ele: transaction){
                                    System.out.println(ele);
                                }
                                System.out.println();
                                break;
                               
                            }
                            case 5:{
                                System.out.println("\n Thank U & Visit Again \n");
                                continue welcomeloop;

                            }
                            default:{
                                System.out.println("\n Invalid Response\n");
                            }
                        }
                    }
                }
                else{
                    System.out.println("\nInvalid cred\n");
                }
                break;

            }
            default:{
                System.out.println("\n Invalid Response\n");
            }

            }
        }
        
    }
    
}
