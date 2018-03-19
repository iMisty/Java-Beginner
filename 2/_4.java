import java.util.*;

public class _4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a number in pounds:");
            double pounds = in.nextDouble();
            double kilo = 0.454 * pounds;
            System.out.println(pounds+" pounds is "+kilo+" kilograms");
        }
        finally{
            in.close();
        }
    }
}