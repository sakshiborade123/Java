// Main class
public class Dept_Employee {

    
    class AggregEmployee {
        int id;
        String name;
        String dept;

        
        AggregEmployee(int id, String name, String dept) {
            this.id = id;
            this.name = name;
            this.dept = dept;
        }

       
        void displayDetails() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Department: " + dept);
            System.out.println("-------------------------");
        }
    }


    class Department {
        String deptName;
        int no;

        Department(String name, int no) {
            this.deptName = name;
            this.no = no;
        }
    }

 
    class College {
        String ClgName;
        int noOfDepartment;

        College(String name, int department) {
            this.ClgName = name;
            this.noOfDepartment = department;
        }
    }
}


class AggregEmployeeDemo {
    public static void main(String[] args) {
        
        Dept_Employee deptEmp = new Dept_Employee();

        
        Dept_Employee.AggregEmployee e1 = deptEmp.new AggregEmployee(101, "Sakshi", "Computer");
        Dept_Employee.AggregEmployee e2 = deptEmp.new AggregEmployee(102, "Krishna", "Management");
        Dept_Employee.AggregEmployee e3 = deptEmp.new AggregEmployee(103, "Sita", "Account");

     
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
