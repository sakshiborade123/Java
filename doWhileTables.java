import java.util.Scanner;
public class doWhileTables {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the Number: ");
    int i=1;
    int num= sc.nextInt();
    do{
        System.out.println(num*i);
        i++;
    }
    while(i<=10);
    
}
}
