import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        MyArrayList();
    }

    public static void MyArrayList() {
        
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial list of elements: " + al);

     
        al.add("Radha");
        al.add("Sakshi");
        al.add("Deva");
        al.add("Supriya");

       
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        System.out.println("After add method: " + al);

        
        al.add(1, "Sakshi");
        System.out.println("After inserting 'Sakshi' at index 1: " + al);

        
        ListIterator<String> itr = al.listIterator();
        System.out.println("\nTraversing elements in forward direction:");

        while (itr.hasNext()) {
            System.out.println("Index: " + itr.nextIndex() + " Value: " + itr.next());
        }

        System.out.println("\nTraversing elements in backward direction:");
        while (itr.hasPrevious()) {
            System.out.println("Index: " + itr.previousIndex() + " Value: " + itr.previous());
        }
    }
}
