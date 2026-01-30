import java.util.Scanner;
public class EVM {
    static int bjp, aap, cong, mns, nota;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Population of area: ");
        int population= sc.nextInt();

        for(int i= 1; i<=population; i++){
            System.out.println("\n ****WELCOME***");
            System.out.println("APKA EK VOTE DESH BADAL NHI SAKTA HAIN \n");
            System.out.println("1.BJP \n 2.APP \n 3.CONG \n 4.MNS \n5.NOTA\n");
            System.out.println("\n Enter your response :");
            String resp= sc.next().toUpperCase();

            if(resp.equals("BJP")){
                bjp++;
                System.out.println("YOU HAVE VOTED FOR BJP");
                System.out.println("ACCHE DIN AYENGE\n");


            }
            else if (resp.equals("AAP")){
                aap++;
                System.out.println("YOU HAVE VOTED FOR AAP ");
                System.out.println("APKA EK VOTE MUJHE AZAD KR SHAKTA HAIN \n");
            }
            else if(resp.equals("CONG")){
                cong++;
                System.out.println("YOU HAVE VOTED FOR CONG");
                System.out.println("BHARAT JODO\n");

            }
            else if(resp.equals("MNS")){
                mns++;
                System.out.println("YOU HAVE VOTED FOR MNS");
                System.out.println("JAI MAHARASHTRA");
            }
            else if(resp.equals("NOTA")){
                nota++;
                System.out.println("YOU HAVE VOTED NOTA \n");
                System.out.println("OHHH! U R EDUACATED");
            }
            else {
                System.out.println("INVALID RESPONSE");
                i--;
            }
        }
        System.out.println("bjp "+bjp);
        System.out.println("cong "+cong);
        System.out.println("mns: "+ mns);
        System.out.println("aap: "+aap);
        System.out.println("nota: "+nota);

    }
    
}
