import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

			String text[]= rd.readLine().split(" ");
			
			int R1 = Integer.parseInt(text[0]);
			int S = Integer.parseInt(text[1]);
			
			S=(S*2)-R1;
			System.out.println(S);
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}
