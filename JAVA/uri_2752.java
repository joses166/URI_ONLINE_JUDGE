public class Main {
	public static void main(String [] args) {

		String frase = "AMO FAZER EXERCICIO NO URI";
		
		System.out.printf( "<%s>\n", frase );
		System.out.printf( "<%30s>\n", frase );
		System.out.printf( "<%.20s>\n", frase );
		System.out.printf( "<%-20s>\n", frase );
		System.out.printf( "<%-30s>\n", frase );
		System.out.printf( "<%.30s>\n", frase );
		System.out.printf( "<%30.20s>\n", frase );
		System.out.printf( "<%-30.20s>\n", frase );

 	}
}