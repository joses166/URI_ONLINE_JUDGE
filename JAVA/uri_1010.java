import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        DecimalFormat df = new DecimalFormat("####.00");
        
        String [] vet1 = input.readLine().split(" ");
        String [] vet2 = input.readLine().split(" ");
        
        int a1   = Integer.parseInt(vet1[0]);
        int a2   = Integer.parseInt(vet1[1]);
        float a3 = Float.parseFloat(vet1[2]);
        
        int b1   = Integer.parseInt(vet2[0]);
        int b2   = Integer.parseInt(vet2[1]);
        float b3 = Float.parseFloat(vet2[2]);

        float res = ((a2 * a3) + (b2 * b3));
        
        System.out.println("VALOR A PAGAR: R$ " + df.format(res));
        
        
    }
    
}
