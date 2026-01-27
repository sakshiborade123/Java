import java.util.Scanner;
class  Alphabet
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Character");
		
		char ch = sc.next().charAt(0);
		
		String op = ((ch >= 'A' && ch <='Z') || (ch>='a' && ch<='z')) ? 
			(ch+ "Is an Character" ): 
			(ch+"is not a Character" );
		System.out.println(op); 
		
	}
}
