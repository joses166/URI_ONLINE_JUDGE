import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("####.0000");
        String [] vet1 = input.readLine().split(" ");
        String [] vet2 = input.readLine().split(" ");
        double x1 = Double.parseDouble(vet1[0]);
        double y1 = Double.parseDouble(vet1[1]);
        double x2 = Double.parseDouble(vet2[0]);
        double y2 = Double.parseDouble(vet2[1]);
        double valorX = Math.pow(x2 - x1, 2);
        double valorY = Math.pow(y2 - y1, 2);
        double distancia = Math.sqrt(valorX + valorY);
        System.out.println(df.format(distancia));
    }
}
