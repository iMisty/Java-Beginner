import java.util.Scanner;

public class _14{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            int num = (int)(Math.random() * 2);
            System.out.print("Enter the coin (1-positive 2-opposite):");
            //int value = in.nextInt();
            int value = 2;

            if(value == num){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
            }
        }
        finally{
            in.close();
        }
    }
}