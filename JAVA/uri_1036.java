import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        String [] vet1 = input.readLine().split(" ");
        double a = Double.parseDouble(vet1[0]);
        double b = Double.parseDouble(vet1[1]);
        double c = Double.parseDouble(vet1[2]);
        double delta = Math.pow(b, 2) - 4 * a * c;
        if ((delta >= 0) && (a > 0)) {
            double v1 = -b + Math.sqrt(delta);
            double v2 = -b - Math.sqrt(delta);

            double x1 = (v1)/(2*a);
            double x2 = (v2)/(2*a);    

            System.out.printf("R1 = %.5f\n", x1);

            System.out.printf("R2 = %.5f\n", x2);

        } else {
            System.out.println("Impossivel calcular");
        }
    }
}