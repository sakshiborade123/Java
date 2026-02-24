public class FibonacciSeries {
    public static void main(String[] args){
        int num= 100;
        int n1=0;
        int n2=1, ans;

        while(true){
            ans= n1+n2;

            if(ans>num)
            break;
            System.out.println(ans);

            n1=n2;
            n2=ans;
        }
    }
    
}
