import java.util.*;

public class ClassSorting {

    
    public static class Student {
        int rollno;
        String name;
        int age;

        public Student(int rollno, String name, int age) {
            this.rollno = rollno;
            this.name = name;
            this.age = age;
        }
    }

    
    public static class AgeComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.age == s2.age)
                return 0;
            else if (s1.age > s2.age)
                return 1;
            else
                return -1;
        }
    }

 
    public static class NameComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);  
        }
    }

    public static void main(String[] args) {
      
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(1, "Sakshi", 23));
        al.add(new Student(2, "Krishna", 21));
        al.add(new Student(3, "Deva", 24));


        System.out.println("Sorting by Name:");
        Collections.sort(al, new NameComparator());

        Iterator<Student> itr = al.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        
        System.out.println("\nSorting by Age:");
        Collections.sort(al, new AgeComparator());

        itr = al.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
