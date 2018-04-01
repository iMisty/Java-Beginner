import java.util.*;

public class _20{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the temperature in Fahrenheit between -58F and 41F:");
            double temp = in.nextDouble();
            System.out.print("Enter the wind speed (>=2) in miles per hour:");
            double speed = in.nextDouble();
            if(temp < -58 || temp > 41){
                System.out.println("Temp Error");
            }else if(speed < 2){
                System.out.println("Wind Error");
            }else{
                System.out.println("Your Enter temperature is :" + temp);
                double _t = 35.74 + 0.6215 * temp - 35.75 * (Math.pow(speed, 0.16)) + 0.4275 * temp * (Math.pow(speed, 0.16));
                System.out.println("The wind chill index is " + _t);
                }
            }
        finally{
            in.close();
        }
    }
}