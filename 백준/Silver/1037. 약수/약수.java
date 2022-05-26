import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
// 1037번
public class Main {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			int N = Integer.parseInt(rd.readLine());
			String text[] = rd.readLine().split(" ");
			int A[] = new int[N];
			
			for(int i=0;i<N;i++) {
				A[i] = Integer.parseInt(text[i]);
			}
			Arrays.sort(A);
			System.out.print(A[0]*A[A.length-1]);
		}
		catch(IOException e) {
            System.out.println("error");
		}
	}
}