import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number 1: ");
        double num1= sc.nextDouble();

        System.out.println("Enter the Number 2: ");
        double num2= sc.nextDouble();

        System.out.println("Enter the Operator");
        char op= sc.next().charAt(0);

        solve(num1,num2,op);
    }
    /** 
     * A calculator program in Java is used to perform basic arithmetic operations such as addition, subtraction, multiplication, and division using the Java programming language. The program takes input from the user, processes the selected mathematical operation, and displays the result on the screen. In Java, the calculator program is usually developed using concepts like variables, data types, operators, conditional statements, and user input methods. The Scanner class is commonly used to accept input from the user, while arithmetic operators such as +, -, *, /, and % are used to perform calculations.
        The working of a Java calculator program starts by importing the required packages and creating a main class. Inside the main method, the program asks the user to enter two numbers and choose the operation they want to perform. Based on the user’s choice, conditional statements such as if-else or switch are used to perform the selected operation. After processing the input values, the program displays the calculated result using output statements like System.out.println(). This program helps beginners understand Java syntax, user input handling, and decision-making logic. It is widely used as a basic example to learn programming fundamentals and build logical thinking skills.
     * *
        @param num1: this is operand 1 on which operation performed;
        @param num3: this is operand 2 on which operation performed;
        @param op: this is operator  on which operation performed;
    **/
    public static void solve(double num1,double num2, char op){
        double output=0;
        switch(op){
            case '+':{
                output=num1+num2;
                break;
            }
            case '-':{
                output=num1-num2;
                break;

            }
            case '*':{
                output=num1*num2;
                break;
            }
            case '/':{
                output=num1/num2;
                break;
            }
            case '%':{
                output=num1%num2;
                break;
            }
            default:{
                System.out.println("Invalid Response:");
            }
        }
        System.out.print(num1+" "+op+" "+num2+ " ="+output);
    }
    
}
