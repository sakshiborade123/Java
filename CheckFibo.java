class CheckFibo{
    public static void main(String[] args){
        int num=50;
        int n1=0, n2=1, ans;
        while(true){
            ans = n1+n2;

            if(n1==num){
                System.out.println("It is Fibo number");
            }
            else if(n1>num){
                System.out.println("Its not a fibo number");
                break;
            }
            else{
                n1=n2;
                n2=ans;
            }
        }
    }
}