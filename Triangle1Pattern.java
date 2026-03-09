public class Triangle1Pattern {
    public static void main(String[] args){
        int n= 6;
        int count=0;
        for(int i= 0 ;i <n; i++){
            for(int j= 0; j<n;j++){
                count++;
                System.out.print(count+"      ");
            }
            System.out.println();
        }
    }
    
}
