import java.util.Scanner;

public class _13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a letter: ");
            String input = in.nextLine();
            char _input = input.charAt(0);
            if(_input == 'a' || _input == 'A' || _input == 'e' || _input == 'E'
                || _input == 'i' || _input == 'I' || _input == 'o' || _input == 'O'
                || _input == 'u' || _input == 'U'){
                System.out.println(input + " is a vowel");
            }else if(Character.isLetter(_input)){
                System.out.println(_input + " is a consonant");
            }else{
                System.out.println(_input + " is an invalid grade");
            }
        }
        finally{
            in.close();
        }
    }
}