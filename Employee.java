class Employee {
    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id + 
        ", Name: " + name + 
        ",Salary: " + salary + 
        ",  Department: " + department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Sakshi", 50000, "IT");
        emp.display();
    }
}
