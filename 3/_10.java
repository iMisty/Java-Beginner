import java.util.Scanner;

public class _10{
    public static void main(String[] args){
        // SubtractionQuiz.java
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        Scanner in = new Scanner(System.in);
        try{
            int answer = in.nextInt();

            if(number1 + number2 == answer){
                System.out.println("You are correct!");
            }else{
                System.out.println("Your answer is wrong");
                System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
            }
        }
        finally{
            in.close();
        }
    }
}