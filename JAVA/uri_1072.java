import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), cont = 0, cont1 = 0;
        
        for (int i = 0; i < a; i++) {
            int r = in.nextInt();
            if (r >= 10 && r <= 20) {
                cont++;
            } else {
                cont1++;
            }
        }
        System.out.println(cont + " in");
        System.out.println(cont1 + " out");
    }
}