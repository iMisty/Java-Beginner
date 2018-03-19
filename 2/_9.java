import java.util.*;

public class _9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter v0, v1, and t:");
            double v0 = in.nextDouble();
            double v1 = in.nextDouble();
            double t = in.nextDouble();
    
            double a = (v1 - v0) / t;
            System.out.println("The averave acceleration is " + a);
        }
        finally{
            in.close();
        }
    }
}