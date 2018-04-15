import java.util.Scanner;

public class _9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a character: ");
            String input = in.nextLine();
            char c = input.charAt(0);
            int unicode = (int)c;
            System.out.println("The Unicode for the character " + input + " is " + unicode);
        }
        finally{
            in.close();
        }
    }
}