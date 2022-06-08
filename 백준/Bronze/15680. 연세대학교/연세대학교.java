import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 15680번
public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(rd.readLine());
			
			if(n==0) {
				System.out.println("YONSEI");
			}
			if(n==1) {
				System.out.println("Leading the Way to the Future");
			}
			
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}
