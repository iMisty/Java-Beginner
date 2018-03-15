/**
 * Test11
 */
public class Test11 {

    public static void main(String[] args){
        int people = 312032486;
        for (int year = 1;year < 6;year++){
            int days = 365 * year;
            int both = year * days * 24 * 60 * 60 / 7;
            int dead = year * days * 24 * 60 * 60 /13;
            int in = year * days * 24 * 60 * 60 / 45;
            int sum = people + both - dead + in;
            System.out.println("美國在第"+year+ "年時的人口數是："+sum);
        }
    }
}