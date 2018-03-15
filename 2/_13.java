import java.util.*;

public class _13{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount:");
        double amount = in.nextDouble();
        // mRate = Monthly interest rate
        double mRate = 0.05 / 12;
        double sum1 = amount * (1 + mRate);
        double sum2 = (amount + sum1) * (1 + mRate);
        double sum3 = (amount + sum2) * (1 + mRate);
        double sum4 = (amount + sum3) * (1 + mRate);
        double sum5 = (amount + sum4) * (1 + mRate);
        double sum6 = (amount + sum5) * (1 + mRate);
        System.out.println("After the sixth mouth, the account value is $"+ sum6);
    }
}