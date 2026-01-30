import java.util.Scanner;
public class vovel1 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Character:");

        char ch= sc.next().charAt(0);

        if(ch=='i' || ch=='a' || ch =='e' ||ch =='o' ||ch =='u'){
            System.out.println("VOVEL");
        }else{
            System.out.println("CONSONENT");
        }
    }
}
