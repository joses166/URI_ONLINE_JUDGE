import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] vetor = in.readLine().split(" ");
        int HI = Integer.parseInt(vetor[0]);
        int HF = Integer.parseInt(vetor[1]);
        int tempo = 0;
        if (HI == HF) {
            tempo = 24;
        } else if (HI < HF) {
            tempo = HF - HI;
        } else if (HI > HF) {
            tempo = (24 - HI) + HF;
        }
        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
    }
}