import java.util.Scanner;
public class StonePaper {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        infiniteLoop:
        for( ; ;){
            System.out.println("\n ***********WELCOME********** \n");
            
            //user implementation
            System.out.println("1.STONE \n 2.PAPER \n 3.SCISSOR\n");
            System.out.println("Enter your response: ");

            int dgtuser=sc.nextInt();

            String User="";

            if(dgtuser== 1) User= "STONE";
            else if (dgtuser==2 ) User="PAPER";
            else if (dgtuser==3) User="SCISSSOR";
            else{
                System.out.println("\n INVALID RESPONSE \n" );
                continue infiniteLoop;
            }

            //bot implementation
            int dgtBot=0;
            for( ; ;){
                dgtBot=(int)(Math.random() *10);
                if(dgtBot>= 1 && dgtBot <=3)
                    break;
            }

            String bot= "";
            if(dgtBot==1) bot="STONE";
            else if(dgtBot==2) bot= "PAPER";
            else bot= "SCISSOR";

            System.out.printf(" %n %10 %8s","BOT","USER");

            System.out.printf("%n %10 %8s", bot, User);

            //calculation winner
            if(bot.equals("STONE")&& User.equals("Paper")|| (bot.equals("Paper")&& User.equals("SCISSOR"))||
            (bot.equals("SCISSOR")&&User.equals("STONE"))){
                System.out.println("\n *********USER WON *******");
            }
            else if(bot.equals("STONE")&& User.equals("SCISSOR")||(bot.equals("PAPER")&& User.equals("STONE"))||
            (bot.equals("SCISSOR")&& User.equals("PAPER"))){
                System.out.println("\n *******BOT WON*********\n");
            }else{
                System.out.println("\n ITS A DRAW \n");
            }
        }
    }
    
}
