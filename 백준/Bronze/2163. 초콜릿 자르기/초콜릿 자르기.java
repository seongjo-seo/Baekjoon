import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 2163번
public class Main {
	public static void main(String[] args) throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			String text[] = rd.readLine().split(" ");
			int count =0;
			
			int N = Integer.parseInt(text[0]);
			int M = Integer.parseInt(text[1]);
			
			count = N * M -1;
			System.out.println(count);
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}