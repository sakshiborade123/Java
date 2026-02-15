import java.util.*;

public class marketInterface {
    class Student {
        int Id;
        String Name;
        int fees;
        int Add;

        @Override
        public String toString() {
            return "Student [Id=" + Id + ", Name=" + Name + ", fees=" + fees + ", Add=" + Add + "]";
        }

        public int getId() {
            return Id;
        }
        public void setId(int id) {
            Id = id;
        }
        public String getName() {
            return Name;
        }
        public void setName(String name) {
            Name = name;
        }
        public int getFees() {
            return fees;
        }
        public void setFees(int fees) {
            this.fees = fees;
        }
        public int getAdd() {
            return Add;
        }
        public void setAdd(int add) {
            Add = add;
        }

        public Student(int id, String name, int fees, int add) {
            Id = id;
            Name = name;
            this.fees = fees;
            Add = add;
        }

        public Student() {
            this.Id = 0;
            this.Name = "Unknown";
            this.fees = 0;
            this.Add = 0;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student student = (Student) obj;
            return Id == student.Id && fees == student.fees && Objects.equals(Name, student.Name) && Add == student.Add;
        }

        @Override
        public int hashCode() {
            return Objects.hash(Id, Name, fees, Add);
        }

        public class Driver {
            public static void main(String[] args) {
                int id;
                int fees;
                String name;
                String courses;
        
                Student s1 = new Student(1, "rutuja", 4500, 123);
                Student s2 = new Student(2, "ram", 4500, 124);
        
                if(s1 instanceof Student){
                    System.out.println("Student is Registrable");
                }else{
                    System.out.println("Student is not Registrable");
                }
            }
        }
    }

    public static void main(String[] args) {
        marketInterface market = new marketInterface();
        HashSet<Student> students = new HashSet<>();

        students.add(market.new Student(101, "Sakshi", 5000, 123));
        students.add(market.new Student(102, "Pratija", 5000, 123));
        students.add(market.new Student(103, "Neha", 5500, 124));
        students.add(market.new Student(101, "Sakshi", 5000, 123)); // Duplicate, won't be added

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
