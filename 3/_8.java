import java.util.Scanner;

public class _8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter your numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int num3 = in.nextInt();

            if(num1 >= num2 && num1 >= num3 && num2 >= num3){
                System.out.println(num1 + " " + num2 + " " + num3);
            }else if(num1 >= num2 && num1 >= num3 && num2 <= num3){
                System.out.println(num1 + " " + num3 + " " + num2);
            }else if(num1 <= num2 && num1 <= num3 && num2 <= num3){
                System.out.println(num3 + " " + num2 + " " + num1);
            }else if(num1 >= num2 && num1 <= num3 && num2 >= num3){
                System.out.println(num3 + " " + num1 + " " + num2);
            }else if(num2 >= num1 && num2 >= num3 && num3 <= num1){
                System.out.println(num2 + " " + num1 + " " + num3);
            }else{
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }
        finally{
            in.close();
        }
    }
}