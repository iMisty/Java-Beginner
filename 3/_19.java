import java.util.Scanner;

public class _19{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter triangle sites: ");
            double section1 = in.nextDouble();
            double section2 = in.nextDouble();
            double section3 = in.nextDouble();

            double plus1 = section1 + section2;
            double plus2 = section2 + section3;
            double plus3 = section1 + section3;

            if(plus1 < section3 || plus3 < section2 || plus2 < section1){
                System.out.println("Enter error");
            }else{
                double perimeter = section1 + section2 + section3;
                System.out.println("Your enter is " + section1 + " " + section2 + " " + section3 + " ." + "Perimeter is " + perimeter);
            }
        }
        finally{
            in.close();
        }
    }
}