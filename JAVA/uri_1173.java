import java.util.Scanner;

public class Main {
	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int [] vetor = new int[10];
		
		vetor[0] = a;
		
		for ( int i = 1; i < vetor.length; i++ ) {
			vetor[i] = vetor[i - 1] * 2;
		}
		
		for ( int i = 0; i < vetor.length; i++ ) { 
			System.out.println("N[" + i + "] = " + vetor[i]);
		}
		
	}
}
