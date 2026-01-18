public class largestOfThree {
    public static void main(String[] args){

        int n1= 112, n2= 43, n3=2000;
        int largest = n1>n2 ?(n1 >n3? n1:n3) : (n2>n3? n2:n3);
        System.out.println(largest);


        int largest1= (n1>n2 ?n1:n2) >n3 ? (n1>n2? n1:n2):n3;
        System.out.println(largest1);
    }
    
}
