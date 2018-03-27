import java.util.Scanner;

public class _9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter the first 9 digits of an ISBN as integer: ");
            int digits = in.nextInt();
            int d1 = digits / 100000000;
            int d2 = digits / 10000000 % 10;
            int d3 = digits / 1000000 % 10;
            int d4 = digits / 100000 % 10;
            int d5 = digits / 10000 % 10;
            int d6 = digits / 1000 % 10;
            int d7 = digits / 100 % 10;
            int d8 = digits / 10 % 10;
            int d9 = digits % 10;
            int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 +d7 * 7 + d8 * 8 + d9 * 9) % 11;
            if (d10 == 10){
                System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
            }else{
                System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
            }

        }
        finally{
            in.close();
        }
    }
}