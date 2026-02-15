public class chronicNO {

    public static void main(String[] args){
        int value= 6;
        

        for(int i= 0; i<5 ; i++){
            for(int j= 0; j<5; j++){
                if(i+1==value || j+1 == value){
                    System.out.println("Chronic:");
                }
                else{
                    System.out.println("Not Chronic:");
                }
            }
        }
    }
    
}
