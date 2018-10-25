import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] v = in.readLine().split(" ");
        float [] vetor = new float[v.length];
        
        vetor[0] = Float.parseFloat(v[0]);
        vetor[1] = Float.parseFloat(v[1]);
        vetor[2] = Float.parseFloat(v[2]);
        
        float maior = 0;
        int posicao = 0;
        float aux = 0;
        
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        
        aux = vetor[0];
        vetor[0] = maior;
        vetor[posicao] = aux;
        
        if (vetor[0] >= (vetor[1] + vetor[2])) 
            System.out.println("NAO FORMA TRIANGULO");
        else if (Math.pow(vetor[0], 2) == (Math.pow(vetor[1], 2) + Math.pow(vetor[2], 2))) 
            System.out.println("TRIANGULO RETANGULO");
        else if (Math.pow(vetor[0], 2) > (Math.pow(vetor[1], 2) + Math.pow(vetor[2], 2)))
            System.out.println("TRIANGULO OBTUSANGULO");
        else if (Math.pow(vetor[0], 2) < (Math.pow(vetor[1], 2) + Math.pow(vetor[2], 2)))
            System.out.println("TRIANGULO ACUTANGULO");
        
        if (vetor[0] == vetor[1] && vetor[0] == vetor[2]) 
            System.out.println("TRIANGULO EQUILATERO");
        else if (vetor[0] == vetor[1] || vetor[1] == vetor[2] || vetor[0] == vetor[2]) 
            System.out.println("TRIANGULO ISOSCELES");
        
    }
    
}
