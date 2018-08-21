import java.util.Arrays;

public class MyClassTask3_4 {


    public static void main(String[]args){
        String[] a ;
        a = new String[5];
        a[0]=String.valueOf("23");
        a[1]= String.valueOf("34");
        a[2]= String.valueOf("32");
        a[3]= String.valueOf("11");
        a[4]= String.valueOf("13");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));




    }
}
