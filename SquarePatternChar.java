public class SquarePatternChar {
   public static void main(String[] args){
     int n = 15;
    char count='a';
        for(int i=0; i< n;i++){
            for(int j=0; j<=n;j++)
            {
                count++;
                System.out.print(count+" ");
            } 
            System.out.println();
        }
       
   }

    
}
