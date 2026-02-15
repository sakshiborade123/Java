import java.util.Scanner;

class User {
    String userName;
    String password;
    String role;

    
    public User(String userName, String password, String role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    
    public void display() {
        if (role.equalsIgnoreCase("Admin")) {
            System.out.println("Welcome Admin");
        } else if (role.equalsIgnoreCase("User")) {
            System.out.println("Welcome User");
        } else {
            System.out.println("Invalid Role!");
        }
    }
}

public class Admin {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the UserName: ");
        String userName = sc.nextLine();

        System.out.print("Enter the Password: ");
        String password = sc.nextLine();

        System.out.print("Enter Role (Admin/User): ");
        String role = sc.nextLine();

        
        User user = new User(userName, password, role);


        user.display();

        sc.close();
    }
}
