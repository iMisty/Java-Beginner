import java.util.Scanner;

public class _3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter a value of feet:");
            double feet = in.nextDouble();
            double meters = 0.305 * feet;
            System.out.println(feet+" feet is "+meters+" meters");
        }
        finally{
            in.close();
        }
    }
}