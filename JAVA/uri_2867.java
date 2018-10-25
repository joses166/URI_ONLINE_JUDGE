import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int qtdeTeste = in.nextInt();
		
		for ( int i = 0; i < qtdeTeste; i++ ) {
			
			String valor = String.valueOf(Math.pow(in.nextInt(), in.nextInt()));
			
			String [] num;
			
			if (valor.contains("E")) {
				num = valor.split("E");
				int x = (int) Float.parseFloat(num[0]);
				int y = Integer.parseInt(num[1]);
				int cont = String.valueOf(x).length() + y;
				System.out.println(cont);
			} else {
				valor = valor.replace(".", "a");
				num = valor.split("a");
				System.out.println(num[0].length());
			}
		}
	}	
}