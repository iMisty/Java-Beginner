import java.util.Scanner;
/**
 * Test11
 */
public class _11 {

    public static void main(String[] args){
        int people = 312032486;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of years:");
        int year = in.nextInt();
        int days = 365 * year;
        int both = year * days * 24 * 60 * 60 / 7;
        int dead = year * days * 24 * 60 * 60 /13;
        int _in = year * days * 24 * 60 * 60 / 45;
        int sum = people + both - dead + _in;
        System.out.println("The population in " + year + " years is " + sum);
    }
}