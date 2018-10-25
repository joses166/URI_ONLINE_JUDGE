import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        float c = in.nextFloat();
        
        DecimalFormat df = new DecimalFormat("###.00");
        
        System.out.println( "NUMBER = " + a );
        System.out.println( "SALARY = U$ " + df.format( b * c ) );
    }
    
}
