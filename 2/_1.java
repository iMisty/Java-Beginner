import java.util.*;

public class _1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        double t = input.nextDouble();
        double f = (9.0 / 5) * t +32;
        System.out.println(t+" Celsius is "+f+" Fahrenheit");
    }
}