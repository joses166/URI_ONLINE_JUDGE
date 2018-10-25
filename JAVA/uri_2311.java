import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.00");
        int qtdeCompet = Integer.parseInt(in.readLine());
        String [] nomes = new String[qtdeCompet];
        float [] notasnomes = new float[qtdeCompet];
        float maior = 0;
        int posicaoMaior = 0;
        float menor = 0;
        int posicaoMenor = 0;
        float total = 0;
        for ( int i = 0; i < qtdeCompet; i++ ) {
            nomes[i] = in.readLine();
            float grau = Float.parseFloat(in.readLine());
            String [] notas = in.readLine().split(" ");
            for ( int j = 0; j < notas.length; j++ ) {
                if (Float.parseFloat(notas[j]) > maior ) {
                    maior = Float.parseFloat(notas[j]);
                    posicaoMaior = j;
                }
                if (Float.parseFloat(notas[j]) < menor || menor == 0 ) {
                    menor = Float.parseFloat(notas[j]);
                    posicaoMenor = j;
                }
            }
            notas[posicaoMaior] = "0";
            notas[posicaoMenor] = "0";
            for ( int j = 0; j < notas.length; j++ ) {
                total += Float.parseFloat(notas[j]);
            }
            notasnomes[i] = total * grau;
            maior = 0;
            menor = 0;
            total = 0;
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " " + df.format(notasnomes[i]));
        }
    }
}