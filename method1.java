public class method1 {
    public static void main(String[] args){
        System.out.println("Main begin");
        isprime(33);
        isprime(81);
    }
    public static void isprime(int num){
        System.out.println("Prime Begin");
        int den=2;

        while(den<num){
            if(num%den==0){
                break;
            }
            den++;
        }
        if(den==num){
            System.out.println("Its is Prime");
        }
        else{
            System.out.println("It is not Prime");
        }
        System.out.println("Prime End");
    }
    
}
