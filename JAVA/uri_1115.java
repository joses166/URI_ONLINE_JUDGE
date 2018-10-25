import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String [] vet1 = null;
        for (;;) {
            vet1 = input.readLine().split(" ");
            int x = Integer.parseInt(vet1[0]);
            int y = Integer.parseInt(vet1[1]);
            if (x == 0 || y == 0) {
                break;
            } else {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                } else if (x > 0 && y < 0) {
                    System.out.println("quarto");
                }
            }
        }
    }
}
