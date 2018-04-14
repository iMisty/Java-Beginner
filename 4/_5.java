import java.util.*;

public class _5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the number of sites: ");
            double s = in.nextDouble();
            System.out.print("Enter the side: ");
            double side = in.nextDouble();
            // result = (n * s * s) / (4 * tan(π / n))
            double result = (s * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / s));
            System.out.println("The area of the polygon is :" + result);
        }
        finally{
            in.close();
        }
    }
}