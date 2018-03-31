import java.util.Scanner;
public class _12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a three-digit integer: ");
            String digit = in.nextLine();
            if (digit.charAt(0) == digit.charAt(2)){
                System.out.println(digit + " is a palindrome");
            }else{
                System.out.println(digit + " is not a palindrome");
            }
        }
        finally{
            in.close();
        }
    }
}