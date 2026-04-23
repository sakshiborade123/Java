
class Book{
    String title;
    int price;
    String author;
}
public class BookObject {
    public static void main(String[] args){
        Book b1= new Book();

        b1.title= "Shyamchi Aai ";
        b1.price=299;
        b1.author="Pandurang Sadashiv Sane";

        System.out.println(b1.title);
        System.out.println(b1.price);
        System.out.println(b1.author);

    }
    
}
