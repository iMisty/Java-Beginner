import java.util.Scanner;

public class _22{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a point with two coordinates: ");
            double x = in.nextDouble();
            double y = in.nextDouble();

            double a = Math.pow(x, 2) + Math.pow(y, 2);

            double line = Math.pow(a, 0.5);

            if(line > 10){
                System.out.println("Point (" + x + " " + y + ") is not in the circle");
            }else{
                System.out.println("Point (" + x + " " + y + ") is in the circle");
            }
        }
        finally{
            in.close();
        }
    }
}