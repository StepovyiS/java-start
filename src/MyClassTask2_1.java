import java.util.Scanner;

public class MyClassTask2_1 {

    public static void main(String[]args){
        Scanner d = new Scanner(System.in);
        String s1 = d.next();
        String s2 = d.next();
        String s3 = d.next();
        String s4 = s1+s3;
        String s5 = s3+s2+s1;
        String s6 = s1+s2+s3;
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }

}
