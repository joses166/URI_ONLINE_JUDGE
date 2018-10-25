import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        float [] a = new float[6];
        a[0] = in.nextFloat();
        a[1] = in.nextFloat();
        a[2] = in.nextFloat();
        a[3] = in.nextFloat();
        a[4] = in.nextFloat();
        a[5] = in.nextFloat();
        int cpositivo = 0;
        float soma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                cpositivo++;
                soma += a[i];
            }
        }
        System.out.println(cpositivo + " valores positivos");
        System.out.println(df.format(soma / cpositivo));
    }
}