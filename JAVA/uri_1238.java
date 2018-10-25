import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String [] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(in.readLine());
		for ( int i = 0; i < a; i++ ) {
			String [] frase = in.readLine().split(" ");
			String palavra = "";
			String [] f1 = frase[0].split("");
			String [] f2 = frase[1].split("");
			for ( int j = 0; j < Math.max(frase[0].length(), frase[1].length()); j++ ) {
				palavra += (f1.length > j ? f1[j] : "" ) + (f2.length > j ? f2[j] : "" );	
			}
			System.out.println(palavra);
		}
	}
}