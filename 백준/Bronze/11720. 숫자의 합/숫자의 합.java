import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 11720번
public class Main {
    public static void main(String[]args) throws IOException {
		try {
			BufferedReader s_rd = new BufferedReader(new InputStreamReader (System.in));
			
			int N = Integer.parseInt(s_rd.readLine());
			int sum=0;
			
			String two = s_rd.readLine();
			
			for(int i=0;i<N;i++) {
				int test = Integer.parseInt(two.substring(i,i+1));
				sum += test;
			}
			System.out.println(sum);
			
		}
		catch(IOException e) {
		}
	}
}
