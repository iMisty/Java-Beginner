import java.util.*;

public class _10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms:");
        double amount = in.nextDouble();
        System.out.print("Enter the initial temperature:");
        double initial = in.nextDouble();
        System.out.print("Enter the final temperature:");
        double finalTemp = in.nextDouble();
        double Q = amount * (finalTemp - initial) * 4184;
        System.out.println("The energy needed is "+Q);
    }
}