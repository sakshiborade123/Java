import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    
    
    public static void ArraySort() {
        int arr[] = {1, 2, 3, 4, 8, 96, 400, 12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------------------------");
    }

 
    public static void ArrayList_Sort() {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(40);
        number.add(20);
        number.add(50);
        number.add(60);
        number.add(70);
        number.add(80);

        System.out.println("Before Sorting: " + number);
        Collections.sort(number);  
        System.out.println("After Sorting: " + number);
        System.out.println("-------------------------------------------------------");

    }

   
    public static void bubbleSort(ArrayList<Integer> number) {
        int n = number.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {        
                if (number.get(j) > number.get(j + 1)) {
                    int temp = number.get(j);
                    number.set(j, number.get(j + 1));
                    number.set(j + 1, temp);
                }
            }
        }
        System.out.println("After Bubble Sorting: " + number);
    }

    
    public static void main(String[] args){
       ArraySort();            
       ArrayList_Sort();       
       
       ArrayList<Integer> number = new ArrayList<>();
       number.add(40);
       number.add(20);
       number.add(50);
       number.add(60);
       number.add(70);
       number.add(80);
       bubbleSort(number);     
    }
}
