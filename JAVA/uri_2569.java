import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String [] a = in.readLine().split(" ");
        
        a[0] = a[0].replaceAll("7", "0");
        a[2] = a[2].replaceAll("7", "0"); 
        
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[2]);
        int res = 0;
        
        String tipoConta = a[1];
        
        switch (tipoConta) {
            case "+":
                res = x + y;
                break;
            case "x":
                res = x * y;
                break;                
        }
        
        String palavra = String.valueOf(res);
        palavra = palavra.replaceAll("7", "0");
        System.out.println(Integer.parseInt(palavra));
    }
}
