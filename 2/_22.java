import java.util.Scanner;

public class _22 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in int,for example 1156($11.56):");
        int amount = input.nextInt();
        int dollar = amount/100;
        int cent = amount%100;
        System.out.println("This amout = "+dollar+"."+cent);
    }   
}