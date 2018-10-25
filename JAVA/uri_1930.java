import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] ntomadas = in.readLine().split(" ");
        int soma = 0;
        for (int i = 0; i < ntomadas.length; i++) {
            soma += Integer.parseInt(ntomadas[i]);
        }
        System.out.println(soma - 3);
    }
}