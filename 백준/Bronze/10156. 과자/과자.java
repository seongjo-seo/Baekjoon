import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
						
			String text[] = br.readLine().split(" ");
			
			int K = Integer.parseInt(text[0]);
			int N = Integer.parseInt(text[1]);
			int M = Integer.parseInt(text[2]);
			
			if(K*N<=M) {
				System.out.println(0);
			}
			else {
				System.out.println(K*N-M);
			}
			
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
}