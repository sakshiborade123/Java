class CalculatorNonStatic{
    int num1;
    int num2;

    public CalculatorNonStatic Addition(){
        System.out.println(num1+num2);
        return this;
    }
    public CalculatorNonStatic Subtraction(){
        System.out.println(num1-num2);
        return this;
    }
    public CalculatorNonStatic Multiplication(){
        System.out.println(num1*num2);
        return this;
    }
    public static void main(String[] args){
        CalculatorNonStatic cal= new CalculatorNonStatic();
        cal.num1=10;
        cal.num2=50;
        cal.Addition().Subtraction().Multiplication();
    }
}