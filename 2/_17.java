import java.util.*;

public class _17{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F:");
        double temp = in.nextDouble();
        if(temp < -58 || temp > 41){
            System.out.println("Error");
        }else{
            System.out.print("Enter the wind speed (>=2) in miles per hour:");
            double speed = in.nextDouble();
            if(speed < 2){
                System.out.println("Error");
            }else{
                double _t = 35.74 + 0.6215 * temp - 35.75 * (Math.pow(speed, 0.16)) + 0.4275 * temp * (Math.pow(speed, 0.16));
                System.out.println("The wind chill index is " + _t);
            }
        }

    }
}