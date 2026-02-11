public class whileAlphabet1 {
    public static void main(String[] args){

        char ch='a';
        char c= 'A';

        while(ch<'z'||c<'Z'){
            System.out.println(ch+ " " + c);
            ch++;
            c++;

        }
        System.out.print(ch);
        System.out.print(c);

    }
    
}
