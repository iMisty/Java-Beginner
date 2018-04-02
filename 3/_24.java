public class _24{
    public static void main(String[] args){
        String[] a = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String[] b = {"Clubs","Diamonds","Hearts","Spades"};
        System.out.println("The cad you picked is " + a + " of " + b);

        int random1 = (int)Math.floor(Math.random() * 13);
        int random2 = (int)Math.floor(Math.random() * 4);

        System.out.println("The card you picked is " + a[random1] + " of " + b[random2]);
    }
}