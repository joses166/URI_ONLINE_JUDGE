import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        String [] vet1 = input.readLine().split(" ");
        
        int a = Integer.parseInt(vet1[0]);
        int b = Integer.parseInt(vet1[1]);
        int c = Integer.parseInt(vet1[2]);

        int res = ( (a + b + Math.abs(a - b)) / 2);
        int tot = ( (res + c + Math.abs(res - c)) / 2);
        
        System.out.println(tot + " eh o maior");
        
    }
}