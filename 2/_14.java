import java.util.*;

public class _14{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double weight = in.nextDouble();
        System.out.print("enter height in inches:");
        double height = in.nextDouble();
        
        double kilo = weight * 0.45359237;
        double meters = height * 0.0254;

        double BMI = kilo / (Math.pow(meters, 2));
        System.out.println("BMI is " + BMI);
    }
}