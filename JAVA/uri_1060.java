import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float [] a = new float[6];
        int cont = 0;
        for (int i = 0; i < 6; i++) {
            a[i] = in.nextFloat();
            if (a[i] > 0) {
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}