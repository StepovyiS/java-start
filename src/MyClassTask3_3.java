import java.util.Arrays;


public class MyClassTask3_3 {


    public static void main(String[]args){
        int[]books;
        books=new int[4];
        books[0]=2;
        books[1]=15;
        books[2]=3;
        books[3]=6;
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
