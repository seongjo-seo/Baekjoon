import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2908번
public class Main {
	public static void main(String[] args) {		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String text[] = br.readLine().split(" ");
			
			String A;
			String B;
			
			A = text[0].substring(2) + text[0].substring(1, 2) + text[0].substring(0, 1);
			B = text[1].substring(2) + text[1].substring(1, 2) + text[1].substring(0, 1);
			
			int C = Integer.parseInt(A);
			int D =Integer.parseInt(B);
			
			if(C>D) {
				System.out.println(C);				
			}else {
				System.out.println(D);
			}
			
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
}