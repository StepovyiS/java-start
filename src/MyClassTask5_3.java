import java.awt.print.Book;
import java.util.Arrays;

public class MyClassTask5_3 {
    private static int Books(int[] args) {
        return args.length;
    }

    private static int Books(byte[] args) {
        return args.length;
    }


    public static void main(String[] args) {
        int[]b;
        b=new int[args.length];
        for( int a=0; a<args.length; a++)
            b[a]=Integer.valueOf(args[a]);
        System.out.println(Arrays.toString(b));


    }
}