import java.util.*;

public class _15{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
	try{
	System.out.print("Enter x1 and y1:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("Enter x2 and y2:");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double a1 = Math.pow((x2 - x1), 2);
        double a2 = Math.pow((y2 - y1), 2);
        double a = a1 + a2;
        double distance = Math.pow(a, 0.5);
        System.out.println("The distance between the two points is " + distance);
	}
	finally{
	    in.close();
	}
    }
}
