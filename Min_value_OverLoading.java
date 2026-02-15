public class Min_value_OverLoading {
    public  static void main(String[] args){
        //int arr[]= {1, 2, 3, 4, 5};
        MinValue(55, 12, 15);
    }
    public static void MinValue(int ...arr){
        int MinValue=arr[0];
        for(int i= 0; i<arr.length; i++){
            if(arr[i]<= MinValue){
                MinValue= arr[i];
            }

        }
    }
    public static void MinValue(int a, int b, int c ){
        if(a <b) {
             System.out.println(" Min Value is : "+a);
        }
        else{
            System.out.println(" Min Value is : "+b);
        }
    }
    
}
