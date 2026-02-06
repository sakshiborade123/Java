import java.util.Scanner;
class VovelUsingSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch= sc.next().toLowerCase().charAt(0);

        switch(ch){
            case 'a','e','i','u','o':System.out.println(ch+"Is An Vovel"); break;
            default:System.out.println(ch+"Is An Consonent");break;
            
        }
    }
}