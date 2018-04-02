import java.util.Scanner;

public class _23{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a point with two coordinates: ");
            double x = in.nextDouble();
            double y = in.nextDouble();

            if(x > 5 && y > 2.5){
                System.out.println("Point (" + x + " " + y + ") is not in the ractangle");
            }else{
                System.out.println("Point (" + x + " " + y + ") is in the ractangle");
            }
        }
        finally{
            in.close();
        }
    }
}