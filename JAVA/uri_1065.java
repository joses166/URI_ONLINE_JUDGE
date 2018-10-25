import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[5];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        a[3] = in.nextInt();
        a[4] = in.nextInt();
        int cpar = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                cpar++;
            }
        }
        System.out.println(cpar + " valores pares");
    }
}
