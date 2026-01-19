import java.util.Scanner;

public class jagged {
    public static void main(String[] args) {
        ArrayDemo2 demo = new ArrayDemo2();
        demo.printJaggedArray();
        
        ja2();
        inputJagged();
        jaggedForEach();
    }

   
    public static class ArrayDemo2 {
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        public void printJaggedArray() {
            System.out.println("Printing predefined integer jagged array:");
            for (int i = 0; i < jaggedArray.length; i++) {
                for (int j = 0; j < jaggedArray[i].length; j++) {
                    System.out.print(jaggedArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void ja2() {
        String[][] jaggStrings = {
            {"Ram", "Krushna"},
            {"Govinda", "Narayan", "Hari"},
            {"Keshava", "Mumbai", "Panduranga", "Murari"}
        };

        System.out.println("\nPrinting predefined string jagged array:");
        for (int i = 0; i < jaggStrings.length; i++) {
            for (int j = 0; j < jaggStrings[i].length; j++) {
                System.out.print(jaggStrings[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inputJagged() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput number of rows: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Input number of elements in row " + (i + 1) + ": ");
            arr[i] = new int[sc.nextInt()];
        }

      
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i].length;
        }
        System.out.println("Input " + count + " array elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("Your jagged array is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Closing scanner
        sc.close();
    }

    public static void jaggedForEach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of states: ");
        int row = sc.nextInt();
        String[][] jaggedArr = new String[row][];

        for (int i = 0; i < row; i++) {
            System.out.print("Enter the number of cities in state " + (i + 1) + ": ");
            int col = sc.nextInt();
            jaggedArr[i] = new String[col];

            System.out.println("Enter city names:");
            for (int j = 0; j < col; j++) {
                jaggedArr[i][j] = sc.next();
            }
        }

       
        System.out.println("\nDisplaying the jagged array of states and cities:");
        for (String[] state : jaggedArr) {
            for (String city : state) {
                System.out.print(city + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
