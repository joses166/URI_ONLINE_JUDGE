import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.0");
		
		int a = in.nextInt();


		for ( int i = 0; i < a; i++ ) {
			float b = (float) in.nextInt();
			float c = (float) in.nextInt();			
			if ( c == 0 ) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println( df.format(b / c) );
			}
		}
	}
}