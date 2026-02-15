import java.util.*;

public class Job {
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println("Person's Salary: " + salary); 
    }
}

class jobrole { 
    private String role;
    private long salary;
    private int id;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Person {
    private jobrole job;  

    public Person() {
        this.job = new jobrole();  
        job.setSalary(1000L);  
    }

    public long getSalary() {
        return job.getSalary();  
    }
}
