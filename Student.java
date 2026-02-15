import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int RollNo;
    String name;
    String Address;

    
    public Student(int rollNo, String name, String address) {
        this.RollNo = rollNo;
        this.name = name;
        this.Address = address;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void Display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + RollNo);
        System.out.println("Address: " + Address);
    }

    public static class ListWithCustomerClass {
        public void addValue(int[] roll, String[] name, String[] address) {
            int n = roll.length;
            ArrayList<Student> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(new Student(roll[i], name[i], address[i])); 
            }
            printValue(list);
        }

     
        public void printValue(ArrayList<Student> list) {
            for (Student data : list) {
                System.out.println(data.getRollNo() + " " + data.getName() + " " + data.getAddress());
            }
        }
    }

    public static void main(String[] args) {
       
        int[] roll = {1, 2, 3, 4, 5};
        String[] name = {"Ram", "Krushna", "Govida", "Sakshi", "Deva"};
        String[] address = {"Pune", "Mumbai", "Delhi", "Chennai", "Bangalore"};

        
        ListWithCustomerClass obj = new ListWithCustomerClass();
        obj.addValue(roll, name, address);

        
        Scanner sc = new Scanner(System.in);
        Student student = new Student(0, "", "");

        System.out.print("Enter Student Name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter Student Roll No: ");
        student.setRollNo(sc.nextInt());
        sc.nextLine(); 

        System.out.print("Enter Student Address: ");
        student.setAddress(sc.nextLine());

        student.Display(); 

        sc.close();
    }
}
