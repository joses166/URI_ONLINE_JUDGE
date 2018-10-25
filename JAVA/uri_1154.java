import java.util.Scanner;

public class Main {
	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		float cont = 0;
		float soma = 0;
		float media = 0;
		
		while ( a > 0 ) {
			
			cont++;
			soma += a;
			
			a = in.nextInt();
		}
		
		media = soma / cont;
		
		System.out.printf("%.2f\n", media);
		
	}
}
