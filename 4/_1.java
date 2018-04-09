import java.util.Scanner;

public class _1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the length from the center to a vertex: ");
            double vertex = in.nextDouble();
            double s = 2 * vertex * Math.sin(3.14 / 5);
            double square = (5 * Math.pow(s, 2)) / 4 * Math.tan(3.14 / 5);
            System.out.println("The area of the pentagon is " + square);
        }
        finally{
            in.close();
        }
    }
}