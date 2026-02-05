import java.util.Scanner;
public class Switch {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();

        int a= 55;
        switch(a){

            case 1:{
                System.out.println("Case 1");
                break;
            }
            case 2:{
                System.out.println("Case 2");
            }
            case 3:{
                System.out.println("Case 3");
            }
            case 55:{
                System.out.println("Case 4");
            }
            default:{
                System.out.println("Invalid  Case ");
            }

        }
    }
    
}
