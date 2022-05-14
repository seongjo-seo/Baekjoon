import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 2577번
public class Main {
	public static void main(String[] args)throws IOException {

		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			int A = Integer.parseInt(rd.readLine());
			int B = Integer.parseInt(rd.readLine());
			int C = Integer.parseInt(rd.readLine());
			int result = A*B*C;
			int count[]=new int[10];
			
			for(int i=result;i>0;i/=10) {
				count[i%10]++;
			}
			for(int j=0;j<=9;j++) {
				System.out.println(count[j]);
			}
			
		}
		catch(IOException e) {
			System.out.print("error");
		}
	}
}