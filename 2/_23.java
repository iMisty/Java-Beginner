import java.util.Scanner;

public class _23{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the driving distance:");
        double distance = in.nextDouble();
        System.out.print("Enter miles per gallon:");
        double miles = in.nextDouble();
        System.out.print("Enter price per gallon:");
        double price = in.nextDouble();

        double cost = distance / miles * price;
        System.out.println("The cost of diving is " + cost);
    }
}