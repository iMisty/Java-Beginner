import java.util.Scanner;

public class _26{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter an integer: ");
            int num = in.nextInt();

            if(num % 5 != 0 || num % 6 != 0){
                System.out.println("Is " + num + " divisible by 5 and 6? false");
            }else{
                System.out.println("Is " + num + " divisible by 5 and 6? true");   
            }

            if(num % 5 != 0 && num % 6 != 0){
                System.out.println("Is " + num + " divisible by 5 or 6? false");
            }else{
                System.out.println("Is " + num + " divisible by 5 and 6? true");
            }

            if(num % 5 != 0 ^ num % 6 != 0){
                System.out.println("Is " + num + " divisible by 5 or 6, but not both? true");
            }else{
                System.out.println("Is " + num + " divisible by 5 and 6,but not both? false");
            }
        }
        finally{
            in.close();
        }
    }
}