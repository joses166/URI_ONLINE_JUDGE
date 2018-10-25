import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            String resp = "";
            int b = in.nextInt();    
            if (b != 0) {
                if (b % 2 == 0) {
                    resp = "EVEN";
                } else {
                    resp = "ODD";
                }
            } 
            if (b == 0) {
                resp = "NULL";
            } else if (b > 0) {
                resp += " POSITIVE";
            } else if (b < 0) {
                resp += " NEGATIVE";
            }
            System.out.println(resp);
        }
    }
}