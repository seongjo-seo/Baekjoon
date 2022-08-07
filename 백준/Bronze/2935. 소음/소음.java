import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;
// 2935번
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			BigInteger A = new BigInteger(br.readLine());
			String test = br.readLine();
			BigInteger B = new BigInteger(br.readLine());
			
			if(test.equals("+")) {
				System.out.println(A.add(B));
			}else {
				System.out.println(A.multiply(B));
			}
		}catch(IOException e) {
			System.out.println("error");
		}
	}
}