public class StaticVariable2{
    static double num =3.14;
    public static void main(String[] args){
        System.out.print(CircleArea(55));
     
    }
    public static double CircleArea(int r){
       double result= r*r*num;

        System.out.println(result);
        return result;
    }
    
}