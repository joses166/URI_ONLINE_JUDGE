import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                int res = (int) Math.pow(i, 2);
                System.out.println(i + "^" + 2 + " = " + res);
            }
        }
    }
}