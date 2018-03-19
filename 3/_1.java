import java.util.Scanner;

public class _1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter A:");
            double a = in.nextDouble();
            System.out.print("Enter B:");
            double b = in.nextDouble();
            System.out.print("Enter C:");
            double c = in.nextDouble();
            
            double d = Math.pow(b, 2) - 4 * a * c;

            if(d < 0){
                System.out.println("The equation has no real roots");
            }else{
                double r1 = (0 - b) + Math.pow(d, 0.5) / 2 * a;
                double r2 = (0 - b) - Math.pow(d, 0.5) / 2 * a;
                System.out.println("The equation real roots is:" + r1 +" and "+ r2);
            }
        }
        finally{
            in.close();
        }
    }
}