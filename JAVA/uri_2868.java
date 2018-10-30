import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(in.readLine());
        
        for ( int i = 0; i < a; i++ ) {
            
            String [] linha = in.readLine().split(" ");
            int x = Integer.parseInt(linha[0]);
            int y = Integer.parseInt(linha[2]);
            int res = Integer.parseInt(linha[4]);
            int resultadoXY = 0;
            
            switch (linha[1]) {
                case "+":
                    resultadoXY = x + y;
                    break;
                case "-":
                    resultadoXY = x - y;
                    break;
                case "x":
                    resultadoXY = x * y;
                    break;
            }
            
            int valor = Math.max(res, resultadoXY) - Math.min(res, resultadoXY);
            
            String apresenta = "E";
            
            for ( int j = 0; j < valor; j++) {
                apresenta += "r";
            }
            
            apresenta += "ou!";
            
            System.out.println(apresenta);
        }
        
    }
}
