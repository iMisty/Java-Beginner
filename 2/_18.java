public class _18{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        System.out.println("a\tb\tpow(a,b)");
        for (int i = 0;i < 5;i++){
            a = a + 1;
            b = b + 1;
            int c = (int)Math.pow(a,b);
            System.out.println(a +"\t" + b + "\t" + c);
        }
    }
}