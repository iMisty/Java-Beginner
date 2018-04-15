import java.util.Scanner;

public class _11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a decimal value (0 to 15): ");
            int num = in.nextInt();
            char numChar = (char)num;
            char hex = (char)(numChar + 'A' - 10);
            System.out.println("The hex value is " + hex);
        }
        finally{
            in.close();
        }
    }
}