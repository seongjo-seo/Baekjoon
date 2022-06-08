import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 15680번
public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			String n = rd.readLine();
			
			System.out.println(Integer.parseInt(n,16));
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}