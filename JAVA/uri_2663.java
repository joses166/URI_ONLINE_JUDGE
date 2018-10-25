import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ncompetidores = in.nextInt();
        int mincompetidores = in.nextInt();

        int j = 0;
        int cont = 0;
        int aux = 0;

        int[] vetor = new int[ncompetidores];

        for (int i = 0; i < ncompetidores; i++) {
            vetor[i] = in.nextInt();
        }
        
        Arrays.sort(vetor);
        for (int i = vetor.length; i > 0; i--) {
            if (mincompetidores == cont) {
                break;
            }
            aux = vetor[vetor.length - mincompetidores];
            cont++;
        }

        for (int i = 0; i < (vetor.length - mincompetidores); i++) {
            if (aux == vetor[i]) {
                cont++;
            }
        }
        System.out.println(cont);
    }
}