import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] ordenar = in.readLine().split(" ");
        int [] vetor = new int[ordenar.length];
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(ordenar[i]);
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println(vetor[0] + "\n" + vetor[1] + "\n" + vetor[2] + "\n");
        System.out.println(ordenar[0] + "\n" + ordenar[1] + "\n" + ordenar[2]);
    }
}