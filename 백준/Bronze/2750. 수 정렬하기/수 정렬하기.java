import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(rd.readLine());
			int num[] = new int [N];
			
			for(int i=0;i<N;i++) {
				num[i] = Integer.parseInt(rd.readLine());
			}
			Arrays.sort(num);
			
			for(int i=0;i<N;i++) {
				System.out.println(num[i]);
			}
			
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}