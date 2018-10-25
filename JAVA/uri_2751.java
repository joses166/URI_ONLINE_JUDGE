import java.text.DecimalFormat;

public class Main {

	public static void main(String [] args) {

		int a = 15;
		int b = a / 2;
		double c = 15.456f;
		double d = c / 7;
		
		System.out.println("Valores de b:");
		System.out.println("-------------");
		System.out.println("1) b = " + b);
		System.out.println("2) b =                    " + b);
		System.out.println("3) b = 0000000000000000000" + 7);
		System.out.println("4) b = " + b + "                   ");
		System.out.println("5) b = " + b + "%");
		System.out.println();
		System.out.println("Valores de d:");
		System.out.println("-------------");
		System.out.printf("1) d = %.6f\n", d);
		System.out.println("2) d = " + (int) d);
		System.out.printf("3) d = %.1f\n", d);
		System.out.printf("4) d = %.2f\n", d);
		System.out.printf("5) d = %.3f\n", d);
		System.out.printf("6) d =                %.3f\n", d);
		System.out.printf("7) d = 000000000000000%.3f\n", d);
		System.out.printf("8) d = %.3f               \n", d);
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println("9) d = " + df.format(d) + "%");

 	}

}