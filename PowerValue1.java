public class PowerValue1 {
    public static void main(String[] args){
       int base= 5;
       int power=4;
       int result=1;
       for(int i= 0 ;i <power;i++){
        result= result* base;
       }
       System.out.println(""+base+"^ "+power+" "+"= "+result);
    }
}
