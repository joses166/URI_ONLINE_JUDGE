import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        String [] vet1 = input.readLine().split(" ");
        int a = Integer.parseInt(vet1[0]);
        int b = Integer.parseInt(vet1[1]);
        int c = Integer.parseInt(vet1[2]);
        int d = Integer.parseInt(vet1[3]);
        if ((b > c) && (d > a) && ((c + d) > (a + b)) && (c >= 0) && (d >= 0) && (a % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}