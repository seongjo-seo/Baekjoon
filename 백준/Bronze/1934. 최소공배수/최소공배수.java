import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCase = Integer.parseInt(br.readLine());
			
			for(int i=0; i<testCase; i++) {
				
				String input[] = br.readLine().split(" ");
				
				int A = Integer.parseInt(input[0]);
				int B = Integer.parseInt(input[1]);
				
				int gcd = gcd(A, B);
				
				int result = (A * B / gcd);
				
				System.out.println(result);
			}
		}catch(IOException e) {
			System.out.println("error");
		}
	}
	
	public static int gcd(int A, int B) {
		if(B==0) {
			return A;
		}else {
			return gcd(B, A%B);
		}
	}
}