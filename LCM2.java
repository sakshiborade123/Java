public class LCM2 {
    public static void main(String[] args){
        int n1= 50;
        int n2=40;
        int largest = n1>n2?n1:n2;

        int i=1;
        while(true){
            if((largest%n1==0)&& (largest%n2==0)){
                System.out.println(largest);
                break;
            }
            largest++;
        }
    }
    
}
