import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// 11653번
public class Main {
	public static void main(String[] args)throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader (System.in));
			
			int num = Integer.parseInt(rd.readLine());
			
			for(int i=2; i<=num;i++) {
				if(num%i==0) {
					System.out.println(i);
					num/=i;
					i--;
				}
			}
		}
		catch(IOException e) {
			System.out.println("error");
		}
	}
}