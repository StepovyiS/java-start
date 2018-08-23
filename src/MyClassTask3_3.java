import java.util.Arrays;
import java.util.Scanner;
public class MyClassTask3_3 {
    public static void main(String[]args){
        Scanner d = new Scanner(System.in);
        int[]books;
        books=new int[4];
        books[0]=d.nextInt();
        books[1]=d.nextInt();
        books[2]=d.nextInt();
        books[3]=d.nextInt();
        int x[]= new int[4];
        System.arraycopy(books,0,x,0,books.length);
        int y[]=new int[4];
        System.arraycopy(books,0,y,0,books.length);
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }

}
