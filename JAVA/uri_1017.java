import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("####.000");
        
        int tempo = in.nextInt();
        int veloc = in.nextInt();
        
        float res = (float) ((tempo * veloc) / 12.0);
        
        System.out.println(df.format(res));
        
    }
}