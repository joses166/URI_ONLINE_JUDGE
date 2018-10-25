import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();

		while ( a > 0 && b > 0 ) {
			String frase = "";
			int soma = 0;
			
			for ( int i = Math.min(a, b); i <= Math.max(a, b); i++ ) {
				frase += i + " ";
				soma += i;
			}
			
			frase += "Sum=" + soma;
			
			System.out.println(frase);		

			a = in.nextInt();
			b = in.nextInt();		
		}
	}
}
