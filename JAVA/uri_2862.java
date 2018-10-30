import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        
        for ( int i = 0; i < a; i++ ) {
            
            int x = in.nextInt();
            
            if ( x > 8000 ) {
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }    
        }
        
    }
}
