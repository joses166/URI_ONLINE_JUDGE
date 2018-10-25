import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        String [] vet1 = input.readLine().split(" ");
        float n1 = Float.parseFloat(vet1[0]);
        float n2 = Float.parseFloat(vet1[1]);
        float n3 = Float.parseFloat(vet1[2]);
        float n4 = Float.parseFloat(vet1[3]);
        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        DecimalFormat df = new DecimalFormat("0.0");
        String sdf = "";        
        
        sdf = df.format(media);
        System.out.println("Media: " + sdf.replaceAll(",", "."));
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if(media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if((media >= 5.0) && (media < 7.0)) {
            System.out.println("Aluno em exame.");
        
            vet1 = input.readLine().split(" ");
            float nE = Float.parseFloat(vet1[0]);
            
            sdf = df.format(nE);
            System.out.println("Nota do exame: " + sdf.replaceAll(",", "."));
            
            float rF = (media + nE)/2;
            if (rF >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            sdf = df.format(rF);
            System.out.println("Media final: " + sdf.replaceAll(",", "."));

        }        
    }
}