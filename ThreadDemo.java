public class childThread extends Thread {
    int n;
    String msg;

    public childThread(int n, String msg){
        this.n= n;
        this.msg=msg;
    }

    public void run(){
        for (int i= 1;i<=n ;i++){
            try{
                Thread.sleep(300);

            }catch(InterruptedException e){
                System.out.print(e.getMessage());
            }
            System.out.println(msg +i);
        }
    }
    
}
public class ThreadDemo{
    public static void main(String[]args){
        childThread t1 = new childThreads(5, "First");
        childThread t2=
    }
}
