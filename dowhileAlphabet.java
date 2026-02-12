import java.util.Scanner;
public class dowhileAlphabet {
    public static void main(String[] args){
        char ch='A';
        char c='a';
        do{
            System.out.println(ch);
            System.out.println(c);
            ch++;
            c++;

        }
        while(ch<='Z'||c<='z');

    }
    
}
