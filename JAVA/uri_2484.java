import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){ //until EOF
            String [] palavra = in.next().split("");
            
            for ( int i = 0; i < palavra.length; i++ ) {

                String mostrar = "";
                String quantidadeEspaco = "";

                for ( int j = 0; j < i; j++ ) {
                    quantidadeEspaco += " ";
                }

                for ( int j = 0; j < palavra.length; j++ ) {
                    mostrar += palavra[j] + " ";
                }

                palavra[palavra.length - i - 1] = "";

                System.out.println(quantidadeEspaco + mostrar.trim());
            }
            System.out.println("");
        }
    }
}