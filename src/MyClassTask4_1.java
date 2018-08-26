public class MyClassTask4_1 {
    public static void main(String[] args) {
        int a = 9;
        while (a < 20) {
            a++;
            System.out.println(a);
        }
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 21);
        for (int c = 10; c <= 20; c++) {
            System.out.println(c);

        }
        int[] mass;
        mass = new int[11];
        for (int i = 0; i < 11; i++) {
            mass[i] = i + 10;
        }
        for (int i : mass) {
            System.out.println(i);


        }
    }
}