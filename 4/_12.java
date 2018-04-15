import java.util.Scanner;

public class _12{
    public static void main(String[] args){
        String[] hexs = {"0000", "0001", "0010", "0011", "0100", "0101",  
                "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101",  
                "1110", "1111"};  
        Scanner input = new Scanner(System.in); 
        try{
            String hex = input.nextLine();  
            if (hex.charAt(0) > 'F' || hex.charAt(0) < '0')  
                System.out.println(hex.charAt(0) + " is an invalid input.");  
            else {  
                char ch = hex.charAt(0);  
                if(ch >= 'A' && ch <= 'F')  
                    System.out.println(hexs[(int)(hex.charAt(0) - 'A' + 10)]);  
                else  
                    System.out.println(hexs[(int)(ch-'0')]);  
            }
        }
        finally{
            input.close();
        }
    }
}