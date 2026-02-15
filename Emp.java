import java.util.*;

public class Emp {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Emp(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id;
    }

    public String getName() { 
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }

    public double getSalary() {
         return salary;
    }
    public void setSalary(double salary) { 
        this.salary = salary;
    }

    public String getDepartment() { 
        return department; 
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, department);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Emp other = (Emp) obj;
        return id == other.id &&
            Double.compare(other.salary, salary) == 0 &&
            Objects.equals(name, other.name) &&
            Objects.equals(department, other.department);
    }

    @Override
    public String toString() {
        return "Emp { ID=" + id + ", Name='" + name + "', Salary=" + salary + ", Department='" + department + "' }";
    }

    public static void main(String[] args) {
        HashSet<Emp> employees = new HashSet<>();

        employees.add(new Emp(1, "Sakshi", 50000, "HR"));
        employees.add(new Emp(2, "Pratija", 60000, "Emp"));
        employees.add(new Emp(4, "Neha", 55000, "IT"));
        employees.add(new Emp(3, "Rutuja", 50000, "HR"));

        for (Emp emp : employees) {
            System.out.println(emp);
        }
    }
}
