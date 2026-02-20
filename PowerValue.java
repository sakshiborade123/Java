public class PowerValue {
    public static void main(String[] args){
        int base=2;
        int raise= 5;
        int res= 1;

        for(int i=0; i<raise;i++){
            res=res*base;
        }
        System.out.println(res);
    }
    
}
