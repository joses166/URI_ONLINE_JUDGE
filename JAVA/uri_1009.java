import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String a = in.next();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        DecimalFormat df = new DecimalFormat("###.00");
        
        System.out.println( "TOTAL = R$ " + df.format( b + ( c * 15 / 100 ) ) );
    }
    
}
