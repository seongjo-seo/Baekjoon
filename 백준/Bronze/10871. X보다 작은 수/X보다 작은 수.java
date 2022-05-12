import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 10871번
public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			String text[] = rd.readLine().split(" ");
			
			int N = Integer.parseInt(text[0]);
			int X = Integer.parseInt(text[1]);
			int num[] = new int[N];
			
			String A[] = rd.readLine().split(" ");
			for(int i=0;i<N;i++) {
				num[i] = Integer.parseInt(A[i]);
				
				if(num[i]<X) {
					System.out.print(num[i] + " ");
				}
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}