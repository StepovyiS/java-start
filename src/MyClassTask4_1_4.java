public class MyClassTask4_1_4 {
    public static void main(String[] args) {
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
