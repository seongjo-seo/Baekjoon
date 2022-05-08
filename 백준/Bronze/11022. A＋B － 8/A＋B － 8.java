import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 11022번
public class Main {
	public static void main(String[]args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));

			int T = Integer.parseInt(rd.readLine());
			
			for(int i=1;i<=T;i++) {
				String num[] = rd.readLine().split(" ");
				int A = Integer.parseInt(num[0]);
				int B = Integer.parseInt(num[1]);
				System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}
