import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int vezes = Integer.parseInt(in.readLine());
		
		for ( int i = 0; i < vezes; i++ ) {
			
			String quale = in.readLine();
			String [] valores = in.readLine().split(" ");
			
			int x = Integer.parseInt(valores[0]);
			int y = Integer.parseInt(valores[1]);
			int z = Integer.parseInt(valores[2]);
			
			switch (quale) {
			case "min":
				System.out.println("Caso #" + (i + 1) + ": " + Math.min(x, Math.min(y, z)));
				break;
			case "max":
				System.out.println("Caso #" + (i + 1) + ": " + Math.max(x, Math.max(y, z)));
				break;
			case "mean":
				int media = (x + y + z) / 3;
				System.out.println("Caso #" + (i + 1) + ": " + media);
				break;
			case "eye":
				int eye = (int) ((0.30 * x) + (0.59 * y) + (0.11 * z));
				System.out.println("Caso #" + (i + 1) + ": " + eye);
				break;
			}
			
		}
			
		
	}
}
