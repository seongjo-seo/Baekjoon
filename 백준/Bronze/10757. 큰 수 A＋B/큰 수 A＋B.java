import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
// 10757번
public class Main {
	public static void main(String[] args)throws IOException {
		
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			String text[] = rd.readLine().split(" ");
			BigInteger A = new BigInteger(text[0]);
			BigInteger B = new BigInteger(text[1]);
			
			BigInteger sum= A.add(B);
			
			System.out.println(sum);
		}
		catch(IOException e) {
			System.out.println("error");
		}
		
		
	}
}
