import java.util.Scanner;

public class _17{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            int computer = (int)(Math.ceil(Math.random() * 3));
            System.out.print("scissor (0), rock (1), paper (2): ");
            int user = in.nextInt();

            if(user > 2){
                System.out.println("Error.Need 0, 1 or 2.");
                return;
            }else if(computer == 3){
                computer = 0;
            }

            switch(computer){
                case 1:
                System.out.print("The computer is rock. ");
                break;
                case 2:
                System.out.print("The computer is paper. ");
                break;
                default:
                System.out.print("The computer is scissor. ");
                break;
            }
            
            switch(user){
                case 1:
                System.out.print("You are rock ");
                break;
                case 2:
                System.out.print("You are paper ");
                break;
                default:
                System.out.print("You are scissor ");
                break;
            }

            if(computer > user && computer != 2){
                System.out.println("You lose");
            }else if(computer == 0 && user == 2){
                System.out.println("You lose");
            }else if(computer == user){
                System.out.println("too. It is a draw");
            }else if(computer == 2 && user == 0){
                System.out.println("You won");
            }else{
                System.out.println("You won");
            }

        }
        finally{
            in.close();
        }
    }
}