import java.util.*;

public class _12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter speed and acceleration:");
        double speed = in.nextDouble();
        double acceleration = in.nextDouble();

        double length = (Math.pow(speed, 2)) / (2 * acceleration);
        System.out.println("The minimum runway length for this airplane is :" + length);
    }
}