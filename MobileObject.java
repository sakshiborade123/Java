public class MobileObject {
    public static void main(String[] args){
        class Mobile{
            String Model;
            String Brand;
            int Price;
            String color;
        }
        Mobile m1= new Mobile();

        m1.Model= "Redmi";
        m1.Brand= "Note 10 Pro Max";
        m1.Price= 23000;
        m1.color= "Black";

        System.out.println(m1.Model);
        System.out.println(m1.Brand);
        System.out.println(m1.Price);
        System.out.println(m1.color);
    }
}
