import java.util.*;

public class _2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the radius and length of a cylinder:");
            double radius = in.nextDouble();
            double length = in.nextDouble();
    
            double area = radius * radius * (Math.PI);
            double volume = area * length;
            System.out.println("The area is "+area);
            System.out.println("The volume is "+volume);
        }
        finally{
            in.close();
        }
    }
}