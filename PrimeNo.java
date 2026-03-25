public class PrimeNo {
    public static void main(String[] args){
        int num= 10;
        int den=1;
        int count=1;

        while(den<=num){
            if(num% den==0){
                count++;
            }
            if(count==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }den++;
        }
    }
    
}
