import java.util.*;

public class _4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the side: ");
            double s = in.nextDouble();

            double result = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
            System.out.println("The area of the hexagon is " + result);
        }
        finally{
            in.close();
        }
    }
}