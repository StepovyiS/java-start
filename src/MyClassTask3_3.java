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
        int[]books1,books2 = new int [4];
        books1= Arrays.copyOfRange(books, 0, 4);
        books2 = Arrays.copyOfRange(books, 0, 4);
        String books1a= Arrays.toString(books1);
        String books2b = Arrays.toString(books2);
        System.out.println(books1a);
        System.out.println(books2b);

    }

}
