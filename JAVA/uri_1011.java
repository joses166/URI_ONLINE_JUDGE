import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.000");
        double R = in.nextDouble();
        double pi = 3.14159;
        double res = (4.0/3) * pi * Math.pow(R, 3);
        System.out.println("VOLUME = " + df.format(res));
    }
}