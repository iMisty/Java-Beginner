import java.util.Scanner;

public class _5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Enter today's day:");
            int day1 = in.nextInt();
            System.out.print("Enter the number of days elapsed since today:");
            int day2 = in.nextInt();
            int day3 = day1 + day2;
            String week = "0";
            String week2 = "0";
            switch(day1){
                case 0:
                    week = "Sunday";
                    break;
                case 1:
                    week = "Monday";
                    break;
                case 2:
                    week ="Tuesday";
                    break;
                case 3:
                    week = "Wednesday";
                    break;
                case 4:
                    week = "Thursday";
                    break;
                case 5:
                    week = "Friday";
                    break;
                case 6:
                    week = "Saturday";
                    break;
            }
            if(day3 >= 7){
                day3 = day3 % 7;
            }
            switch(day3){
                case 0:
                    week2 = "Sunday";
                    break;
                case 1:
                    week2 = "Monday";
                    break;
                case 2:
                    week2 = "Tuesday";
                    break;
                case 3:
                    week2 = "Wednesday";
                    break;
                case 4:
                    week2 = "Thursday";
                    break;
                case 5:
                    week2 = "Friday";
                    break;
                case 6:
                    week2 = "Saturday";
                    break;
            }
            System.out.println("Today is " + week + " and the future day is " + week2);
        }
        finally{
            in.close();
        }
    }
}