import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

			String text[]= rd.readLine().split(" ");
			
			int A = Integer.parseInt(text[0]);
			int B = Integer.parseInt(text[1]);
			
			System.out.println(A*(B-1)+1);
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}
