import java.util.*;

// ✅ Library Class (Parent)
public class Library {
    String libraryName;

    public Library() { }

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void displayLibraryInfo() {
        System.out.println("Library Name: " + libraryName);
    }
}

// ✅ Book Class (Child of Library)
class Book extends Library {
    String bookName;
    int price;

    public Book(String libraryName, String bookName, int price) {
        super(libraryName);
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() { return bookName; }
    public void setBookName(String bookName) { this.bookName = bookName; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public void displayBookInfo() {
        displayLibraryInfo();
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }
}

// ✅ Main Class
class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        System.out.print("Enter Library Name: ");
        String libraryName = sc.nextLine();

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Book " + (i + 1) + " Name: ");
            String bookName = sc.nextLine();

            System.out.print("Enter Price of " + bookName + ": ");
            int price = sc.nextInt();
            sc.nextLine();

            bookList.add(new Book(libraryName, bookName, price));
        }

        System.out.println("\n📚 Library Book List:");
        for (Book b : bookList) {
            b.displayBookInfo();
        }

        sc.close();
    }
}
