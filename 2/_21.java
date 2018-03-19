import java.util.Scanner;

public class _21{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        double amount = in.nextDouble();
        System.out.print("Enter annual interest rate in percentage:");
        double annual = in.nextDouble();
        annual = annual / 12 / 100;
        System.out.print("Enter number of years:");
        double years = in.nextDouble();

        double accumulated = amount * Math.pow((1 + annual), (years * 12));
        System.out.println("Accumulated value is $" + accumulated);
    }
}