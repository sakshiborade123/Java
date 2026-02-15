import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Title:");
        String Title= sc.nextLine();
        StringBuilder sb= new StringBuilder();

        char ch= Character.toUpperCase(Title.charAt(0));
        sb.append(ch);

        for(int i= 1; i< Title.length(); i++){
            if(Title.charAt(i)== ' ' && i< Title.length()-1){
                sb.append(Title.charAt(i));
                i++;
                sb.append(Character.toUpperCase(Title.charAt(i)));
            }
            else{
                sb.append(Title.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    
}
