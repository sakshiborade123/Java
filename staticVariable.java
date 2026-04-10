public class staticVariable{
    static String name;
    
    public static void main(String[] args){
        System.out.println(name);

        String name="abc";

        System.out.println(name);
        System.out.println(staticVariable.name);

        staticVariable.name="Qspiders";
        System.out.println(staticVariable.name);

        demo();


    }
    public static void demo(){
        System.out.println(name);
        System.out.println(staticVariable.name);
    }
}