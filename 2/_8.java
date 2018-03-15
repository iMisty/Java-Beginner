import java.util.*;

public class _8{
    public static void main(String[] args){
        // ShowCurrentTime.java
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;

        // Change GMT by user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT:");
        long GMT = in.nextLong();

        long currentHours = totalHours % 24 + GMT;

        // If hour >= 24 and hour < 0
        if(currentHours < 0){
            currentHours = currentHours + 24;
        }else if(currentHours >= 24){
            currentHours = currentHours - 24;
        }

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    }
}