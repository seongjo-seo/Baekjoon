import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 10952번
public class Main {
	public static void main(String[]args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));

			String num[] = rd.readLine().split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			
			while(A !=0 && B !=0) {
				System.out.println(A+B);
				String nums[] = rd.readLine().split(" ");
				A = Integer.parseInt(nums[0]);
				B = Integer.parseInt(nums[1]);
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}