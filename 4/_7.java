import java.util.*;

public class _7{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
            System.out.print("Enter the radius of the bounding circle:");
            double radius=in.nextDouble();
            double p2x=0;
            double p2y=100;
            double p3x=Math.cos(Math.PI/10)*(-1)*radius;
            double p3y=Math.sin(Math.PI/10)*radius;
            double p1y=Math.sin(Math.PI/10)*radius;
            double p1x=Math.cos(Math.PI/10)*radius;
            double p4y=Math.sin((3*Math.PI)/10)*(-1)*radius;
            double p4x=Math.cos((3*Math.PI)/10)*(-1)*radius;
            double p5y=p4y;
            double p5x=Math.cos((3*Math.PI)/10)*radius;
            System.out.println("P1:"+"("+p1x+","+p1y+")");
            System.out.println("P2:"+"("+p2x+","+p2y+")");
            System.out.println("P3:"+"("+p3x+","+p3y+")");
            System.out.println("P4:"+"("+p4x+","+p4y+")");
            System.out.println("P5:"+"("+p5x+","+p5y+")");
        }
        finally{
            in.close();
        }
    }
}