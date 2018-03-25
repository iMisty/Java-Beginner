import java.util.Scanner;

public class _6{
    public static void main(String[] args){
        // ComputeAndInterpretBMI.java
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter weight in pounds: ");
            double weight = in.nextDouble();

            System.out.print("Enter feet: ");
            double feet = in.nextDouble();

            System.out.print("Enter inches: ");
            double inches = in.nextDouble();

            final double KILOGRAMS_PER_POUND = 0.45359237;
            final double METERS_PER_INCH = 0.0254;
            // 1 feet = 12 inch
            double weightInKilograms = weight * KILOGRAMS_PER_POUND;
            double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;
            double bmi = weightInKilograms / (heightInMeters * heightInMeters);

            System.out.println("BMI is " + bmi);
            if (bmi < 18.5) {
                System.out.println("Underweight");
            }else if (bmi < 25) {
                System.out.println("Normal");
            }else if (bmi < 30) {
                System.out.println("Overweight");
            }else {
                System.out.println("Obese");
            }
        }
        finally{
            in.close();
        }
    }
}