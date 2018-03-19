import java.util.Scanner;

public class _5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the subtotal and a gratuity rate:");
            double sub = in.nextDouble();
            double rate = in.nextDouble();
            double tip = (sub * rate) / 100;
            double sum = sub + tip;
            System.out.println("The gratuity is $"+tip+" and total is $"+sum);
        }
        finally{
            in.close();
        }
    }
}