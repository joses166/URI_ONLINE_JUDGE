import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int d = in.nextInt();
        int res = (d * 60) / 30;
        
        System.out.println(res + " minutos");
        
    }
}