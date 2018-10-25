import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int N;
		Scanner input = new Scanner(System.in);
		while ((N =input.nextInt()) != 0) {
			int sum = 0;
			for (int i = N,k = 1; k<= 5; i++) {
				if (i % 2 == 0) {
					sum += i;
					k += 1;
				}
			}
			System.out.println(sum);
		}

	}

}