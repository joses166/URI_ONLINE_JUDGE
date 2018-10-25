import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.000");
        int x = in.nextInt();
        float y = in.nextFloat();
        float res = x / y;
        System.out.println(df.format(res) + " km/l");
    }
}
