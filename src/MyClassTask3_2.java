import java.util.Arrays;


public class MyClassTask3_2 {
    public static void main(String[] args) {
        int[] mass;
        mass = new int[10];
        mass[0] = 16;
        mass[1] = 3;
        mass[2] = 687;
        mass[3] = 65;
        mass[4] = 344;
        mass[5] = 13;
        mass[6] = -44;
        mass[7] = 103;
        mass[8] = 34;
        mass[9] = 999;
        int y = mass[0];
        Arrays.sort(mass);
        mass[0] = mass[mass.length - 1];
        mass[mass.length - 1] = y;
        System.out.println(Arrays.toString(mass));
    }
}
