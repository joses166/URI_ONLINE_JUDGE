import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.00");
        int valor = in.nextInt();
        int valorI = valor;
        int n100 = valor / 100;
        valor = valor - (n100 * 100);
        int n50 = valor / 50;
        valor = valor - (n50 * 50);
        int n20 = valor / 20;
        valor = valor - (n20 * 20);
        int n10 = valor / 10;
        valor = valor - (n10 * 10);
        int n5 = valor / 5;
        valor = valor - (n5 * 5);
        int n2 = valor / 2;
        valor = valor - (n2 * 2);
        int n1 = valor / 1;
        valor = valor - (n1 * 1);
        
        System.out.println(valorI);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}