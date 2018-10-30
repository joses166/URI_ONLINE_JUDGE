import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        String [] m = sc.readLine().split(" ");
        String [] n = sc.readLine().split(" ");
        
        int Am = Integer.parseInt(m[0]);
        int Rm = Integer.parseInt(m[1]);
        int Em = Integer.parseInt(m[2]);
        
        int Av = Integer.parseInt(n[0]);
        int Rv = Integer.parseInt(n[1]);
        int Ev = Integer.parseInt(n[2]);
        
        String palavra = sc.readLine();
       
        int total1 = (2 * Am) + Rm + (palavra.length() * Em);
        int total2 = (2 * Av) + Rv + (palavra.length() * Ev);
        
        if ( total1 < total2 ) {
            System.out.println("Matheus");
        } else if ( total1 > total2 ) {
            System.out.println("Vinicius");
        } else {
            System.out.println("Empate");
        }
        
    }
}
