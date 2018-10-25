import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for (int i = 0; i < a; i++) {
			float n1 = in.nextFloat();
			float n2 = in.nextFloat();
			float n3 = in.nextFloat();
			System.out.printf("%.1f\n", (((n1 * 2) + (n2 * 3) + (n3 * 5)) / ( 2 + 3 + 5 )) );	
		}	
	}
}
