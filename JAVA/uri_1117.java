import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		int cont = 0;
		float soma = 0;
		while (cont < 2) {
			float nota = in.nextFloat();
			if (nota >= 0 && nota <= 10) {
				soma += nota;
				cont++;
			} else {
				System.out.println("nota invalida");
			}
			
		}
		System.out.println("media = " + df.format(soma / 2));
	}
}