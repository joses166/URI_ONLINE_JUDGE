import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int A1 = in.nextInt(), A2 = in.nextInt(), A3 = in.nextInt();
        
        int [] numeros = new int[3];
        numeros[0] = (A2 * 2) + (A3 * 4);
        numeros[1] = (A1 * 2) + (A3 * 2);
        numeros[2] = (A1 * 4) + (A2 * 2);
        
        int resultado = 0;
        
        if (numeros[0] <= numeros[1] && numeros[0] <= numeros[2]) { resultado = numeros[0]; }
        else if (numeros[1] <= numeros[0] && numeros[1] <= numeros[2]) { resultado = numeros[1]; }
        else if (numeros[2] <= numeros[1] && numeros[2] <= numeros[0]) { resultado = numeros[2]; }
        
        System.out.println(resultado);
    }
}