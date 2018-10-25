import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		int [] numeros = new int[100];
		
		int maior = 0;
		int indice = 0;
		
		for ( int i = 0; i < numeros.length; i++ ) {

			numeros[i] = in.nextInt();
			
			if ( numeros[i] > maior || i == 0 ) {
				maior = numeros[i];
				indice = i + 1;
			}
		}
		
		System.out.println(maior);
		System.out.println(indice);
		
	}
}
