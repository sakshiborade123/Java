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
    


    public static void main(String[]args){
        childThread t1 = new childThread(5, "First");
        childThread t2 = new childThread(10, "Second");

        t1.start();
        t2.start();

        System.out.println("-----------End of Main-----------------");
    }
}
