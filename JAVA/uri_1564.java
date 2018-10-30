import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        while(in.hasNext()){ 
            int num = in.nextInt();
            
            if ( num == 0 ) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
 
        }
    }
}