import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		float salario = in.nextFloat();
		int percentual = 0;
		float novoSalario = 0;
		
		if ( salario >= 0.0 && salario <= 400.00 ) {
			percentual = 15;
		}
		else if ( salario >= 400.01 && salario <= 800.00 ) {
			percentual = 12;
		}
		else if ( salario >= 800.01 && salario <= 1200.00 ) {
			percentual = 10;
		}
		else if ( salario >= 1200.01 && salario <= 2000.00 ) {
			percentual = 7;
		}
		else if ( salario > 2000.01 ) {
			percentual = 4;
		}
		
		novoSalario = salario + (salario * percentual / 100);
		
		System.out.println("Novo salario: " + df.format(novoSalario));
		System.out.println("Reajuste ganho: " + df.format(novoSalario - salario));
		System.out.println("Em percentual: " + percentual + " %");
		
	}
}
