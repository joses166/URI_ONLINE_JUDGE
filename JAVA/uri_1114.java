import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senha = 0;
        do {
            senha = in.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso Permitido"); 
            } else {
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);
    }
}