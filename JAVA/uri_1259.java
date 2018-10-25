import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		ArrayList<Integer> vP = new ArrayList<>();
		ArrayList<Integer> vI = new ArrayList<>();
		ArrayList<Integer> vF = new ArrayList<>();
		for ( int i = 0; i < a; i++ ) {
			int b = in.nextInt();
			if (b % 2 == 0) {
				vP.add(b);
			}else {
				vI.add(b);
			}
		}
		vP.sort(null);
		vI.sort(null);
		
		vF.addAll(vP);
		
		for ( int i = vI.size() - 1; i >= 0; i-- ) {
			vF.add(vI.get(i));
		}
		
		for ( int x : vF ) {
		System.out.println(x);
		}
	}	
}