import java.util.Scanner;

public class _21{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter year: (e.g., 2012): ");
            int year = in.nextInt();
            System.out.print("Enter month: ");
            int month = in.nextInt();
            System.out.print("Enter the day of the month: 1-31: ");
            int days = in.nextInt();

            int j = (int)year / 100;
            int k = year % 100;

            if(month == 1){
                month = 13;
                year = year - 1;
            }else if(month == 2){
                month = 14;
                year = year - 1;
            }

            int h = (days + ((26 * (month +1))) / 10 + k + (k / 4) + (j / 4) + 5 * j) % 7;

            switch(h){
                case 2:
                    System.out.println("Day of the week is Monday");
                    break;
                case 3:
                    System.out.println("Day of the week is Tuesday");
                    break;
                case 4:
                    System.out.println("Day of the week is Wednesday");
                    break;
                case 5:
                    System.out.println("Day of the week is Tuesday");
                    break;
                case 6:
                    System.out.println("Day of the week is Friday");
                    break;
                case 0:
                    System.out.println("Day of the week is Satursday");
                    break;
                case 1:
                    System.out.println("Day of the week is Sunday");
                    break;
            }
        }
        finally{
            in.close();
        }
    }
}