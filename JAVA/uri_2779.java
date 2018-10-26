import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		ArrayList<Integer> numeros = new ArrayList<>();
		for ( int i = 0; i < b; i++ ) {
			int x = in.nextInt();
			boolean existe = false;
			for ( int j = 0; j < numeros.size(); j++ ) {
				if ( numeros.get(j) == x ) {
					existe = true;
				}
			}
			if ( existe == false ) {
				numeros.add(x);
			}
		}
		System.out.println(a - numeros.size());
 	}
}