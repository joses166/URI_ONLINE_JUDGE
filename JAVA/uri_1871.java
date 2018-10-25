import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int m = in.nextInt();
			int n = in.nextInt();
			if ( m == n && m == 0 ) {
				break;
			} else {
				int resultado = m + n;
				String v = String.valueOf(resultado);
				v = v.replaceAll("0", "");
				resultado = Integer.parseInt(v);
				System.out.println(v);
			}
		}
	}
}