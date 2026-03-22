public class MethodPositiveNumber {
    public static void main(String[] args){
        positive(50);
        negative(-50);

        int num=0;
        if(num==0){
            System.out.println("It is Zero");
        }
    }
    public static void positive(int num){
        if(num>0){
            System.out.println("Positive Number");
        }
    }
    public static void negative(int num){
        if(num<0){
            System.out.println("Negative Number");
        }
    }
    
    
}
