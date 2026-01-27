import java.util.Scanner;
public class vovel {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value: ");

        char ch= sc.next().charAt(0);

        String str= (ch=='a'||ch =='e' ||ch== 'i' ||ch== 'o'||ch== 'u' ||ch=='A' ||ch=='E' ||ch =='I'||ch=='O'||ch =='U')?
                   ("Vovel"):("Consonant");

                   System.out.println(str);
    }
    
}
