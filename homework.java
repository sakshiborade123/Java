import java.util.*;

public class homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

       
        stud();

        
        TwoDArray();

        sc.close();
    }

   
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum_of_digits = 0;

        while (n != 0) {
            int digit = n % 10; 
            sum_of_digits += (digit * digit * digit); 
            n = n / 10; 
        }

        return sum_of_digits == originalNumber;
    }

   
    public static void stud() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[5];
        
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt(); 
            sum += arr[i]; 
            System.out.println("Element " + arr[i]);
        }
        System.out.println("Total Sum: " + sum);
    }

  
    public static void TwoDArray() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[][] arr = new int[2][2];

        System.out.println("Enter 4 elements for a 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();  
                sum += arr[i][j];           
            }
        }

        System.out.println("Matrix Elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");  
            }
            System.out.println();
        }

        System.out.println("Total Sum: " + sum);
    }
}
