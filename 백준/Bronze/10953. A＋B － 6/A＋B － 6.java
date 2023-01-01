import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCase = Integer.parseInt(br.readLine());
			
			for( int i=0; i<testCase; i++) {
				String text[] = br.readLine().split(",");
				
				int A = Integer.parseInt(text[0]);
				int B = Integer.parseInt(text[1]);
				
				System.out.println(A+B);
			}
						
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}