import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		for ( int i = 0; i < a; i++ ) {
			String [] p = in.readLine().split(" ");
			String aux = null;
			for ( int x = 0; x < p.length; x++ ) {
				for ( int y = 0; y < p.length - 1; y++ ) {
					if ( p[y].length() < p[y + 1].length() ) {	
						aux = p[y];
						p[y] = p[y+1];
						p[y+1] = aux;
					}
				}				
			}
			String frase = "";
			for ( String z : p ) {
				frase += z + " ";
			}
			System.out.println(frase.trim());
		}
	}	
}