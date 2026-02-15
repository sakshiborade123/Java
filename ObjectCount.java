import java.util.Scanner;

public class ObjectCount {
    private static int objectCount = 0; 

   
    public ObjectCount() {
        objectCount++;
    }

    public void display() {
        System.out.println("Number of Objects: " + objectCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of objects to create: ");
        int n = sc.nextInt();

       
        ObjectCount[] objects = new ObjectCount[n];

       
        for (int i = 0; i < n; i++) {
            objects[i] = new ObjectCount();
        }

       
        objects[n - 1].display();

        sc.close();
    }
}
