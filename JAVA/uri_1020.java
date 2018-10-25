import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int dias = in.nextInt();
        int meses = 0;
        int anos = 0;
        
        if (dias >= 365) {
            anos = dias / 365;
            dias = dias - (anos * 365);
        }
        if (dias >= 30) {
            meses = dias / 30;
            dias = dias - (meses * 30);
        }
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
