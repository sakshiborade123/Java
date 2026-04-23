public class MarkerObject {
    public static void main(String[] args){
        class Marker{
            String color="Black";
            double price=45.20;
            String Waranty="2 Months";

            Marker(){
                System.out.println();
            }
        }
        
        Marker m1= new Marker();

        System.out.println(m1.color);
        System.out.println(m1.price);
        System.out.println(m1.Waranty);
    }
    
}
