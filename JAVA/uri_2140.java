import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String [] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int valorPagar, valorPagou; 
		
		do {
			
			String [] vetor = in.readLine().split(" ");
			
			valorPagar = Integer.parseInt(vetor[0]);
			valorPagou = Integer.parseInt(vetor[1]);
		
			if (valorPagar == 0 && valorPagou == 0) {
				break;
			}
			
			int valorTroco = valorPagou - valorPagar;
			int contador = 0;
			
			while ( valorTroco > 0 ) {
				if (valorTroco >= 100) {
					valorTroco -= 100;
				} else if (valorTroco >= 50) {
					valorTroco -= 50;
				} else if (valorTroco >= 20) {
					valorTroco -= 20;
				} else if (valorTroco >= 10) {
					valorTroco -= 10;
				} else if (valorTroco >= 5) {
					valorTroco -= 5;
				} else if (valorTroco >= 2) {
					valorTroco -= 2;
				} else {
					valorTroco -= valorTroco;
				}
				contador++;
			}
			
			if ( contador == 2 ) {
				System.out.println("possible");
			} else { 
				System.out.println("impossible");
			}
			
			valorPagar = Integer.parseInt(vetor[0]);
			valorPagou = Integer.parseInt(vetor[1]);
			
		} while ( valorPagar != 0 && valorPagou != 0 );
		
	}
	
}