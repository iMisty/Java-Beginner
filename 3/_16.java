public class _16{
    public static void main(String[] args){
        int width = (int)(Math.random() * 100);
        int height = (int)(Math.random() * 200);

        if(width > 50){
            width = width - 100;
        }else if(height > 100){
            height = height - 200;
        }

        System.out.println(width + " , " + height);
    }
}