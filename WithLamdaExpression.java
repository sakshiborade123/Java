import java.util.Arrays;

interface Greet{
    String greet();
}

interface Cube{
    public int calculate1(int b);
    
}
public class WithLamdaExpression {
    public static void main(String[] args) {

        Greet greetMsg = () -> "Hello, welcome to Java!";
        System.out.println(greetMsg.greet());
        
        Cube c1 = (a) -> a * a * a;
        System.out.println("Cube of 4: " + c1.calculate1(4));


        int arr[]={10,50,90,400,500,2,60};
        Arrays.sort(arr);
        System.out.println(""+arr);


    }
}