import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        String [] vet1 = input.readLine().split(" ");
        int v1 = Integer.parseInt(vet1[0]);
        int v2 = Integer.parseInt(vet1[1]);
        float total = 0.00f;
        switch (v1) {
            case 1:
                total = (float) (v2 * 4.00);
                break;
            case 2:
                total = (float) (v2 * 4.50);
                break;
            case 3:
                total = (float) (v2 * 5.00);
                break;
            case 4:
                total = (float) (v2 * 2.00);
                break;
            case 5:
                total = (float) (v2 * 1.50);
                break;
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
