import java.util.Scanner;

public class _7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of minutes:");
        int minutes = in.nextInt();
        int days = minutes / 60 / 24;
        int years = days / 365;
        int _days = days - years * 365;
        System.out.println(minutes+ " minutes is approximately "+years+ " years and "+_days+" days");
    }
}