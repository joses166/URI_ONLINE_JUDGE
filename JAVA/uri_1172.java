import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
            if (v[i] == 0 || v[i] < 0) {
                v[i] = 1;
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println("X[" + i + "] = " + v[i]);
        }
    }
}