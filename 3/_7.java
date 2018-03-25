import java.util.Scanner;

public class _7{
    public static void main(String[] args){
        // ComputeChange.java
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter an amount in double, for example 11.56: ");
            double amount = in.nextDouble();

            int remainingAmount = (int)(amount * 100);
            System.out.println("Your amount " + amount + " consists of");
            
            // Find the number of one dollars
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;
            if(numberOfOneDollars >= 2){
                System.out.print(numberOfOneDollars + " dollars");                
            }else if (numberOfOneDollars == 1){
                System.out.print(numberOfOneDollars + " dollar");
            }


            // Find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;
            if(numberOfQuarters >= 2){
                System.out.print(" and " + numberOfQuarters + " quarters");
            }else if (numberOfQuarters == 1) {
                System.out.print(" and " + numberOfQuarters + " quarter");
            }

            // Find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;
            if(numberOfDimes >= 2){
                System.out.print(" and " + numberOfDimes + " dimes");
            }else if ( numberOfDimes == 1){
                System.out.print(" and " + numberOfDimes + " dime");
            }


            // Find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;
            if(numberOfNickels >= 2){
                System.out.print(" and " + numberOfNickels + " nickels");
            }else if ( numberOfNickels == 1){
                System.out.print(" and " + numberOfNickels + " nickel");
            }


            // Find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;
            if(numberOfPennies >= 2){
                System.out.print(" and " + numberOfPennies + " pennies");
            }else if ( numberOfPennies ==1){
                System.out.print(" and " + numberOfPennies + " penny");
            }
            System.out.println();
        }
        finally{
            in.close();
        }
    }
}