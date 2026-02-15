public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8, 10}; 
        int n = 10;

        System.out.println("Missing numbers:");
        findMissingNumbers(arr, n);
    }

    public static void findMissingNumbers(int[] arr, int n) {
        boolean[] present = new boolean[n + 1]; 
   
        for (int num : arr) {
            present[num] = true;
        }

        
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
//create array of book with other name implement with get set method 