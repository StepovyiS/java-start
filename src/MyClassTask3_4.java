import java.util.Arrays;

public class MyClassTask3_4 {
    public static void main(String[]args){
        int[]b;
       b=new int[args.length];
       for( int a=0; a<args.length; a++)
           b[a]=Integer.valueOf(args[a]);
      Arrays.sort(b);

        System.out.println(Arrays.toString(b));




    }
}
