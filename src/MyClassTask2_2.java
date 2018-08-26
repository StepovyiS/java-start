import java.util.Scanner;

public class MyClassTask2_2 {
    public static void main(String[]args){
        Scanner d = new Scanner(System.in);
        int n =d.nextInt();
        int m =d.nextInt();
        System.out.println(m-n);
        System.out.println(m/n);
        System.out.println(m*m);
        System.out.println(n&n);
        System.out.println(m&n);

        d.close();

    }
}
