import java.util.Scanner;
public class GradeUsingSwitch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the grade");
        String ch= sc.nextLine();
        
        switch(ch){
            case "O":{
                System.out.println("EXECELENT");
                break;
            }
            case "A":{
                System.out.println("VERY GOOD");
                break;
            }

            case "B":{
                System.out.println("GOOD");
            }
            default:{
                System.out.println("Invalid Response");
            }
        }

    }
    
}
