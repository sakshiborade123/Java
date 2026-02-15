import java.util.Scanner;

class Book {
    private String bookName;
    private double price;
    private String author;

    // Constructor
    public Book(String bookName, double price, String author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    // Getters
    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public void displayBook() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

public class BookInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Book Name: ");
            String bookName = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // Consume newline

            // Storing book object in array
            books[i] = new Book(bookName, price, author);
        }

        // Printing book details
        System.out.println("\n📚 List of Books:");
        for (Book book : books) {
            book.displayBook();
        }

        sc.close();
    }
}
