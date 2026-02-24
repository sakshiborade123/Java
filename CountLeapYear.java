import java.util.Scanner;
public class CountLeapYear {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();

        while(start<=end){
            if ((start % 4 == 0 && start % 100 != 0) || start % 400 == 0) {
                
            }
          //  System.out.println(start);
            start++;
        }
    }
    
}
