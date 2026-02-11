import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Salary:");
        int salary = sc.nextInt();

        System.out.println("Enter your Age:");
        int age = sc.nextInt();


        if (age <= 60) {
            if (salary <= 250000) {
                System.out.println("Tax Rate = 0%");
            } 
            else if (salary <= 500000) {
                System.out.println("Tax Rate = 5%");
            } 
            else if (salary <= 1000000) {
                System.out.println("Tax Rate = 20%");
            } 
            else {
                System.out.println("Tax Rate = 30%");
            }
        }


        else if (age <= 80) {
            if (salary <= 300000) {
                System.out.println("Tax Rate = 0%");
            } 
            else if (salary <= 500000) {
                System.out.println("Tax Rate = 5%");
            } 
            else if (salary <= 1000000) {
                System.out.println("Tax Rate = 20%");
            } 
            else {
                System.out.println("Tax Rate = 30%");
            }
        }


        else {
            if (salary <= 500000) {
                System.out.println("Tax Rate = 0%");
            } 
            else if (salary <= 1000000) {
                System.out.println("Tax Rate = 20%");
            } 
            else {
                System.out.println("Tax Rate = 30%");
            }
        }

        sc.close();
    }
}
