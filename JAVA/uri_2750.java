public class Main {
	public static void main(String [] args) {

		System.out.println("---------------------------------------");
		System.out.println("|  decimal  |  octal  |  Hexadecimal  |");
		System.out.println("---------------------------------------");
		for ( int i = 0; i <= 15; i++ ) {
			if ( i >= 0 && i <= 7 ) {
				System.out.printf("|      %d    |    %o    |       %X       |\n", i, i, i);
			}
			if ( i >= 8 && i <= 9 ) {
	
				System.out.printf("|      %d    |   %o    |       %X       |\n", i, i, i);
			}
			if ( i >= 10 && i <= 15 ) {
	
				System.out.printf("|     %d    |   %o    |       %X       |\n", i, i, i);
			}
		}
		System.out.println("---------------------------------------"); 		
 	}
}