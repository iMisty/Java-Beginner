import java.util.Scanner;

public class _8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter an ASCII code: ");
            byte code = in.nextByte();
            char _char = (char)code;
            System.out.println("The character for ASCII code " + code +" is " + _char);
        }
        finally{
            in.close();
        }
    }
}