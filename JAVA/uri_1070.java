import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0) {
            a += 1;
        }
        for (int i = 0; i < 12; i+=2) {
            System.out.println(a + i);
        }
    }
}
