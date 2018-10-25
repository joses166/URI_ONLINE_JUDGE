import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0000");
		
		double raio = in.nextDouble();
		double n = 3.14159;
		double area = n * (raio * raio);

		System.out.println("A=" + df.format(area));
				
	}
}
