import java.util.*;

public class _16{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side:");
        double side = in.nextDouble();

        double area = (3 * Math.pow(3, 0.5) / 2) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + area);
    }
}