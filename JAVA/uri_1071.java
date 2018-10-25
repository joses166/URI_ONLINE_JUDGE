import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt(), soma = 0;
        for (int a0 = in.nextInt() + 1; a0 < a1; a0++) {
            if (a0 % 2 != 0) {
                soma += a0;
            }
        }
        System.out.println(soma);
    }
}