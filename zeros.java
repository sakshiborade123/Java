public class zeros {
    public static void main(String[] args){
        int num =4505450;
        while(num>0){
            int last= num%10;
            if(last==0){
                System.out.println("Its Having Zero:"+num);
                break;
            }
            
            num/=0;
        }
    }    
}
