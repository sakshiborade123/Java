public class Pattern {
    public static void main(String[] args){
        Rombus(6, 6);
        triangle(5);
        HalfTriangle(9);
    }

    public static void Rombus(int totrow, int col){
        for(int i= 1; i<=totrow; i++){
            for(int j= 1; j<= col; j++){
                if(i== 1 ||i== totrow || j== 1|| j== col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();

        }
    }

    public static void triangle( int n){
        for(int i= 1; i<= n; i++){
            for(int j= 1; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i ;j ++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void HalfTriangle(int n){
        for(int i= 1; i <= n; i++){
            for(int j= 1; j<= n-i+1; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    
}
