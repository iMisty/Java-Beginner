import java.util.Scanner;

public class _18{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter your package weight:");
            double weight = in.nextDouble();

            if(weight > 20){
                System.out.println("the package cannot be shipped");
            }else if(weight < 0){
                System.out.println("Enter error.Need > 0");
            }else if(weight > 0 && weight <= 1){
                System.out.println("Your package weight is " + weight + " ,Need 3.5 dollars");
            }else if(weight > 1 && weight <= 3){
                System.out.println("Your package weight is " + weight + " ,Need 5.5 dollars");
            }else if(weight > 3 && weight <= 10){
                System.out.println("Your package weight is " + weight + " ,Need 8.5 dollars");
            }else{
                System.out.println("Your package weight is " + weight + " ,Need 10.5 dollars");
            }
        }
        finally{
            in.close();
        }
    }
}