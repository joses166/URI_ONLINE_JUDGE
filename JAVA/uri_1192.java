import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        int vezes = Integer.parseInt(input.readLine());
        for (int i = 0; i < vezes; i++) {
            String [] vet1 = input.readLine().split("");
            int n1 = Integer.parseInt(vet1[0]);
            String letra = vet1[1];
            int n2 = Integer.parseInt(vet1[2]);
            int res = 0;
            if (n1 != n2) {
                if (letra.toUpperCase().equals(letra)) {
                    res = n2 - n1;
                } else if (letra.toLowerCase().equals(letra)) {
                    res = n2 + n1;
                }
            } else {
                res = n1 * n2;
            }
            System.out.println(res);
        }
    }
}
