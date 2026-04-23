public class ComputerObject {
    public static void main(String[] args){
        class Computer{
            String model="Dell";
            String brand= "HP";
            int price=60000;
            String ram= "8GB";
        }
        Computer c1= new Computer();

        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.price);
        System.out.println(c1.ram);
        
    }
    
}
