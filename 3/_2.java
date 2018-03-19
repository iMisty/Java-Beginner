import java.util.Scanner;

public class _2{
    public static void main(String[] args){
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);
        int num4 = num1 + num2 + num3;
        Scanner in = new Scanner(System.in);
        System.out.println("Number 1,2,3 is "+num1+" "+num2+" "+num3+",Please Enter num1+num2+num3=?");
        int answer = in.nextInt();
        if(answer == num4){
            System.out.println("Right");
        }else{
            System.out.println("Wrong,Answer is "+num4);
        }
    }
}