import java.util.*;

public class _6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:");
        int number = in.nextInt();
        if (number > 1000 || number < 0){
            System.out.println("Number Error.Need < 1000 and >0");
        }else{
            int e1 = number % 10;   // Single
            int e2 = number / 100;  // Percent
            int e3 = number / 10;
            int e4 = e3 % 10;       // Tens
            int sum = e1 + e2 + e4;
            System.out.println("The sum of the digits is "+sum);
        }
    }
}