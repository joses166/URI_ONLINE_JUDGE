import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        String [] vet1 = input.readLine().split(" ");
        float a = Float.parseFloat(vet1[0]);
        float b = Float.parseFloat(vet1[1]);
        float c = Float.parseFloat(vet1[2]);
        boolean d = false;
        if ( ( (b - c  < a) && ( a < b + c ) ) && ( ( a - c  < b ) && ( b < a + c ) ) && ( ( a - b  < c ) && ( c < a + b ) ) ) {
            System.out.printf("Perimetro = %.1f\n", (a + b + c) );
        } else {
            System.out.printf("Area = %.1f\n", (((a + b) * c) / 2) );
        }
    }
}