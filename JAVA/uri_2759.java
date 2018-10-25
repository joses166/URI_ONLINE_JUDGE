import java.util.Scanner;

public class Main {
	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();
		String c = in.next();
		
		System.out.println("A = " + a + ", B = " + b + ", C = " + c);
		System.out.println("A = " + b + ", B = " + c + ", C = " + a);
		System.out.println("A = " + c + ", B = " + a + ", C = " + b);

 	}
}