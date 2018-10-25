import java.util.Scanner;

public class Main {
	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		
		for ( int i = 0; i < a; i++ ) {
			
			String [] numero = in.next().split("");
			int cont = 0;
			for ( int j = 0; j < numero.length; j++ ) {
				switch ( numero[j] ) {
				case "1":
					cont += 2;
					break;
				case "2":
					cont += 5;
					break;
				case "3":
					cont += 5;
					break;
				case "4":
					cont += 4;
					break;
				case "5":
					cont += 5;
					break;
				case "6":
					cont += 6;
					break;
				case "7":
					cont += 3;
					break;
				case "8":
					cont += 7;
					break;
				case "9":
					cont += 6;
					break;
				case "0":
					cont += 6;
					break;					
				}
			}
			System.out.println(cont + " leds");
		}
		
		
	}
}
